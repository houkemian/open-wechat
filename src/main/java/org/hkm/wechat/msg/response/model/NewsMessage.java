package org.hkm.wechat.msg.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

import java.util.List;

@Data
public class NewsMessage extends BaseMessageModel {

    @JacksonXmlProperty(localName = "ArticleCount")
    private Long articleCount;

    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "news";

    @JacksonXmlElementWrapper(localName = "Articles")
    private List<Article> item;

    @Data
    @AllArgsConstructor
    @JacksonXmlRootElement(localName = "item")
    public static class Article {

        @JacksonXmlProperty(localName = "Title")
        private String title;

        @JacksonXmlProperty(localName = "Description")
        private String description;

        @JacksonXmlProperty(localName = "PicUrl")
        private String picUrl;

        @JacksonXmlProperty(localName = "Url")
        private String url;
    }

}
