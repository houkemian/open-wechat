package org.hkm.wechat.msg.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class MusicMessage extends BaseMessageModel {

    @JacksonXmlProperty(localName = "Music")
    private MediaModel music;

    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "music";

    public void setMusic(String title, String desc, String musicURL, String hQMusicUrl, String thumbMediaId) {
        this.music = new MediaModel();
        this.music.setTitle(title);
        this.music.setDescription(desc);
        this.music.setMusicUrl(musicURL);
        this.music.setHQMusicUrl(hQMusicUrl);
        this.music.setThumbMediaId(thumbMediaId);
    }

    @Data
    private class MediaModel {

        @JacksonXmlProperty(localName = "Title")
        private String title;

        @JacksonXmlProperty(localName = "Description")
        private String description;

        @JacksonXmlProperty(localName = "MusicUrl")
        private String MusicUrl;

        @JacksonXmlProperty(localName = "HQMusicUrl")
        private String HQMusicUrl;

        @JacksonXmlProperty(localName = "ThumbMediaId")
        private String ThumbMediaId;
    }
}
