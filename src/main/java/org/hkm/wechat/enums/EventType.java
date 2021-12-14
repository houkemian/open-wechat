package org.hkm.wechat.enums;

import org.hkm.wechat.msg.BaseMessageModel;
import org.hkm.wechat.msg.receive.model.EventMessageModel;
import org.hkm.wechat.msg.receive.model.event.*;
import org.hkm.wechat.msg.receive.model.event.LocationMessage;

public enum EventType {

    Click("click", ClickMessage.class, "clickMessageProcessor"),
    Location("location", LocationMessage.class, "eventLocationMessageProcessor"),
    Scan("scan", ScanMessage.class, "scanMessageProcessor"),
    Subscribe("subscribe", SubscribeMessage.class, "subscribeMessageProcessor"),
    UnSubscribe("unsubscribe", UnSubscribeMessage.class, "unSubscribeMessageProcessor"),
    View("view", ViewMessage.class, "viewMessageProcessor"),
    Default("default", EventMessageModel.class, "defaultEventMessageProcessor"),
    ;

    private String type;
    private Class<? extends BaseMessageModel> clazz;
    private String processorBean;


    EventType(String type, Class<? extends BaseMessageModel> clazz, String processorBean) {
        this.type = type;
        this.clazz = clazz;
        this.processorBean = processorBean;
    }

    public String type(){
        return this.type;
    }

    public static EventType of(String type) {
        for (EventType messageType : values()) {
            if (messageType.type.equals(type)) {
                return messageType;
            }
        }
        return null;
    }

    public Class<?> getMessageClass() {
        return this.clazz;
    }

    public String getProcessorBean() {
        return this.processorBean;
    }

}
