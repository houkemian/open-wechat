package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class TextMessage{

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("text")
    private MessageModel text;

    @JsonProperty("msgtype")
    private String msgType = "text";


}
