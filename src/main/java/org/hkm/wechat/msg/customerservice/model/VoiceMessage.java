package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class VoiceMessage{

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("voice")
    private MessageModel voice;

    @JsonProperty("msgtype")
    private String msgType = "voice";


}
