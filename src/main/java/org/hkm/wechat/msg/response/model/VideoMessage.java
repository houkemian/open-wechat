package org.hkm.wechat.msg.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class VideoMessage extends BaseMessageModel {

    @JacksonXmlProperty(localName = "Video")
    private MediaModel video;

    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "video";

    public void setVideo(String mediaId, String title, String desc) {
        this.video = new MediaModel();
        this.video.setMediaId(mediaId);
        this.video.setTitle(title);
        this.video.setDescription(desc);
    }
    @Data
    private class MediaModel {

        @JacksonXmlProperty(localName = "Title")
        private String title;

        @JacksonXmlProperty(localName = "Description")
        private String description;

        @JacksonXmlProperty(localName = "MediaId")
        private String mediaId;

    }

}
