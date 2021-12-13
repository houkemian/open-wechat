package org.hkm.wechat.msg.receive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EventMessageModel extends BaseMessageModel{

    @JsonProperty("MsgType")
    private String msgType = "event";

    @JsonProperty("Event")
    private String event;

}
