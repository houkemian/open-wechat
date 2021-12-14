package org.hkm.wechat.msg.receive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class EventMessageModel extends BaseMessageModel {

    @JsonProperty("MsgType")
    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "event";

    @JsonProperty("Event")
    @JacksonXmlProperty(localName = "Event")
    private String event;

}
