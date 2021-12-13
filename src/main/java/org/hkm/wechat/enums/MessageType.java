package org.hkm.wechat.enums;

import org.hkm.wechat.msg.receive.model.BaseMessageModel;
import org.hkm.wechat.msg.receive.model.EventMessageModel;
import org.hkm.wechat.msg.receive.model.normal.*;

public enum MessageType {

    Text("text", TextMessage.class, "textMessageProcessor"),
    Image("image", ImageMessage.class, "imageMessageProcessor"),
    Voice("voice", VoiceMessage.class, "voiceMessageProcessor"),
    Video("video", VideoMessage.class, "videoMessageProcessor"),
    Shortvideo("shortvideo", ShortVideoMessage.class, "shortVideoMessageProcessor"),
    Location("location", LocationMessage.class, "locationMessageProcessor"),
    Link("link", LinkMessage.class, "linkMessageProcessor"),

    Event("event", EventMessageModel.class, "defaultEventMessageProcessor"),
    ;

    private String type;
    private Class<? extends BaseMessageModel> clazz;
    private String processorBean;


    MessageType(String type, Class<? extends BaseMessageModel> clazz, String processorBean) {
        this.type = type;
        this.clazz = clazz;
        this.processorBean = processorBean;
    }

    public String type(){
        return this.type;
    }

    public static MessageType of(String type) {
        for (MessageType messageType : values()) {
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
