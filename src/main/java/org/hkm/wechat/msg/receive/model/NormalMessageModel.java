package org.hkm.wechat.msg.receive.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class NormalMessageModel extends BaseMessageModel {

    @JsonProperty("MsgId")
    @JacksonXmlProperty(localName = "MsgId")
    private Long msgId;

}
