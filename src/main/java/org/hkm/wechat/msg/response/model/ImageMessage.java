package org.hkm.wechat.msg.response.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class ImageMessage extends BaseMessageModel {

    @JacksonXmlProperty(localName = "Image")
    private MediaModel image;

    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "image";

    public void setImage(String mediaId) {
        this.image = new MediaModel();
        this.image.setMediaId(mediaId);
    }

    @Data
    private class MediaModel {

        @JacksonXmlProperty(localName = "MediaId")
        private String mediaId;
    }
}
