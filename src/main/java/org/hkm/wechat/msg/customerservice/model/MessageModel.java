package org.hkm.wechat.msg.customerservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageModel {

    @JsonProperty("content")
    private String content;

    @JsonProperty("media_id")
    private String mediaId;

    @JsonProperty("thumb_media_id")
    private String thumbMediaId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("musicurl")
    private String musicurl;

    @JsonProperty("hqmusicurl")
    private String hqmusicurl;

    @JsonProperty("articles")
    private List<ArticleModel> articles;

    public static MessageModel text(String content){
        return MessageModel.builder().content(content).build();
    }

    public static MessageModel image(String mediaId){
        return MessageModel.builder().mediaId(mediaId).build();
    }

    public static MessageModel voice(String mediaId){
        return MessageModel.builder().mediaId(mediaId).build();
    }

    public static MessageModel video(String mediaId, String thumbMediaId, String title, String description){
        return MessageModel.builder().mediaId(mediaId).thumbMediaId(thumbMediaId).title(title).description(description).build();
    }

    public static MessageModel music(String musicurl, String hqmusicurl, String thumbMediaId, String title, String description){
        return MessageModel.builder().musicurl(musicurl).hqmusicurl(hqmusicurl).thumbMediaId(thumbMediaId).title(title).description(description).build();
    }

    public static MessageModel news(List<ArticleModel> articles){
        return MessageModel.builder().articles(articles).build();
    }

    public static MessageModel mpnews(String mediaId){
        return MessageModel.builder().mediaId(mediaId).build();
    }
}
