package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import org.hkm.wechat.msg.BaseMessageModel;

import java.util.List;

@Data
public class NewsMessage{

    @JsonProperty("touser")
    private String toUserName;

    @JsonProperty("news")
    private MessageModel news;

    @JsonProperty("msgtype")
    @Setter(AccessLevel.NONE)
    private String msgType = "news";

}
