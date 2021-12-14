package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class MpNewsMessage {

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("mpnews")
    private MessageModel mpnews;

    @JsonProperty("msgtype")
    private String msgType = "mpnews";

}
