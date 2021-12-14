package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImageMessage{

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("image")
    private MessageModel image;

    @JsonProperty("msgtype")
    private String msgType = "image";

}
