package org.hkm.wechat.msg.receive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NormalMessageModel extends BaseMessageModel{

    @JsonProperty("MsgId")
    private Long msgId;

}
