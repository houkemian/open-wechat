package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ImageMessage{

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("image")
    private MessageModel image;

    @JsonProperty("msgtype")
    @Setter(AccessLevel.NONE)
    private String msgType = "image";

}
