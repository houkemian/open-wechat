package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class MpNewsMessage {

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("mpnews")
    private MessageModel mpnews;

    @JsonProperty("msgtype")
    @Setter(AccessLevel.NONE)
    private String msgType = "mpnews";

}
