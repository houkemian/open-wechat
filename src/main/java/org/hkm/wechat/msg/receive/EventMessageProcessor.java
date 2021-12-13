package org.hkm.wechat.msg.receive;

import org.hkm.wechat.enums.EventType;
import org.hkm.wechat.msg.receive.model.EventMessageModel;
import org.hkm.wechat.util.JacksonUtil;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Objects;
import java.util.Optional;

public interface EventMessageProcessor extends ReceiveMessageProcessor, ApplicationContextAware {

    String handleEvent(EventMessageModel message);
    ApplicationContext getApplicationContext();

    default String process(String data, String msgType) {
        EventMessageModel message = JacksonUtil.parse(data, EventMessageModel.class);
        return dispatchEvent(message);
    }

    default String dispatchEvent(EventMessageModel message) {

        EventMessageProcessor processor;

        try {
            processor = getApplicationContext()
                    .getBean(Objects.requireNonNull(EventType.of(message.getEvent())).getProcessorBean(), EventMessageProcessor.class);
        } catch (NoSuchBeanDefinitionException e) {
            processor = getApplicationContext()
                    .getBean(EventType.Default.getProcessorBean(), EventMessageProcessor.class);
        }

        return processor.handleEvent(message);
    }
}
