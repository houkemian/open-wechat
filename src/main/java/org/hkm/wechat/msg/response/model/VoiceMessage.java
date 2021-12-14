package org.hkm.wechat.msg.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.BaseMessageModel;

@Data
public class VoiceMessage extends BaseMessageModel {

    @JacksonXmlProperty(localName = "Voice")
    private MediaModel voice;

    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "voice";

    public void setVoice(String mediaId) {
        this.voice = new MediaModel();
        this.voice.setMediaId(mediaId);
    }

    @Data
    private class MediaModel {
        @JacksonXmlProperty(localName = "MediaId")
        private String mediaId;
    }
}
