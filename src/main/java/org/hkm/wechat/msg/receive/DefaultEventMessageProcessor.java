package org.hkm.wechat.msg.receive;

import org.hkm.wechat.msg.BaseMessageModel;
import org.hkm.wechat.msg.receive.model.EventMessageModel;
import org.hkm.wechat.msg.response.model.ImageMessage;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class DefaultEventMessageProcessor implements EventMessageProcessor{

    private ApplicationContext applicationContext;

    @Override
    public BaseMessageModel handleEvent(EventMessageModel message) {
        ImageMessage response = new ImageMessage();
        response.setImage("ED5N_zxaNuHeTEC-Pg6DQm4e58Zh529HkrjC30102-_jYff2da7QFcTr84kRZXWY");
        response.setCreateTime(System.currentTimeMillis());
        response.setFromUserName(message.getToUserName());
        response.setToUserName(message.getFromUserName());
        return response;
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
