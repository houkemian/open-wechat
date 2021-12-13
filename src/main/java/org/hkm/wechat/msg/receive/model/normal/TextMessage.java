package org.hkm.wechat.msg.receive.model.normal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class TextMessage extends NormalMessageModel {

    @JsonProperty("Content")
    private String content;

    @JsonProperty("MsgType")
    private String msgType = "text";


}
