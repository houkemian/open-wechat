package org.hkm.wechat.msg;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "xml")
public class BaseMessageModel {

    @JsonProperty("ToUserName")
    @JacksonXmlProperty(localName = "ToUserName")
    private String toUserName;

    @JsonProperty("FromUserName")
    @JacksonXmlProperty(localName = "FromUserName")
    private String fromUserName;

    @JsonProperty("CreateTime")
    @JacksonXmlProperty(localName = "CreateTime")
    private Long createTime;

    @JsonProperty("MsgType")
    @JacksonXmlProperty(localName = "MsgType")
    private String msgType;

}
