package org.hkm.wechat.msg.receive.model.normal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class LinkMessage extends NormalMessageModel {

    @JsonProperty("Title")
    @JacksonXmlProperty(localName = "Title")
    private String title;

    @JsonProperty("Description")
    @JacksonXmlProperty(localName = "Description")
    private String description;

    @JsonProperty("Url")
    @JacksonXmlProperty(localName = "Url")
    private String url;

    @JsonProperty("MsgType")
    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "link";

}
