package org.hkm.wechat.msg.receive;

import org.hkm.wechat.msg.receive.model.EventMessageModel;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class DefaultEventMessageProcessor implements EventMessageProcessor{

    private ApplicationContext applicationContext;

    @Override
    public String handleEvent(EventMessageModel message) {
        System.out.println(message.getFromUserName() + ":" + message.getEvent());
        return message.getFromUserName();
    }

    @Override
    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
