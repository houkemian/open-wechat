package org.hkm.wechat.msg.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class TextMessage extends BaseMessageModel {

    @JacksonXmlProperty(localName = "Content")
    private String content;

    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "text";


}
