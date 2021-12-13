package org.hkm.wechat.msg.receive.model.normal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class VoiceMessage extends NormalMessageModel {

    @JsonProperty("Format")
    private String format;

    @JsonProperty("MediaId")
    private String mediaId;

    @JsonProperty("MsgType")
    private String msgType = "voice";

}
