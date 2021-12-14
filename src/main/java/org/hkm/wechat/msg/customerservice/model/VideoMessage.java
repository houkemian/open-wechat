package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class VideoMessage {

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("video")
    private MessageModel video;

    @JsonProperty("msgtype")
    @Setter(AccessLevel.NONE)
    private String msgType = "video";


}
