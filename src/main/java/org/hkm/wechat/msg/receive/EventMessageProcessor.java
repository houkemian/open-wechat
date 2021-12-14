package org.hkm.wechat.msg.receive;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.hkm.wechat.enums.EventType;
import org.hkm.wechat.msg.BaseMessageModel;
import org.hkm.wechat.msg.receive.model.EventMessageModel;
import org.hkm.wechat.util.JacksonUtil;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public interface EventMessageProcessor extends ReceiveMessageProcessor, ApplicationContextAware {

    BaseMessageModel handleEvent(EventMessageModel message);
    ApplicationContext getApplicationContext();

    default String process(String data, String msgType) {
        EventMessageModel message = JacksonUtil.parseXml(data, EventMessageModel.class);
        return dispatchEvent(message);
    }

    default String dispatchEvent(EventMessageModel message) {

        EventMessageProcessor processor;

        try {
            processor = getApplicationContext()
                    .getBean(Objects.requireNonNull(EventType.of(message.getEvent().toLowerCase(Locale.ROOT))).getProcessorBean(), EventMessageProcessor.class);
        } catch (NoSuchBeanDefinitionException e) {
            processor = getApplicationContext()
                    .getBean(EventType.Default.getProcessorBean(), EventMessageProcessor.class);
        }

        ObjectMapper mapper = new XmlMapper();
        String ret = null;

        try {
            ret = mapper.writeValueAsString(processor.handleEvent(message));
            System.out.println(ret);
            return ret;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
