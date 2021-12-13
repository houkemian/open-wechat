package org.hkm.wechat.msg.receive;

import org.hkm.wechat.enums.MessageType;
import org.hkm.wechat.util.JacksonUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.validation.ValidationException;
import java.util.Optional;

@Component
public class ReceiveMessageDispatcher implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private ReceiveMessageProcessor defaultMessageProcessor;

    public ReceiveMessageDispatcher(ReceiveMessageProcessor defaultMessageProcessor){
        this.defaultMessageProcessor = defaultMessageProcessor;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String process(String data) {

        MessageType type = Optional.ofNullable(MessageType.of(JacksonUtil.get(data, "MsgType"))).orElseThrow(() -> new ValidationException("unknow msgtype"));

        ReceiveMessageProcessor processor;

        try {
            processor = this.applicationContext.getBean(type.getProcessorBean(), ReceiveMessageProcessor.class);
        } catch (NoSuchBeanDefinitionException e) {
            processor = defaultMessageProcessor;
        }

        return processor.process(data, type.type());
    }
}
