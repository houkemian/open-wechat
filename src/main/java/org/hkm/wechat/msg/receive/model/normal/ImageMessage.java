package org.hkm.wechat.msg.receive.model.normal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class ImageMessage extends NormalMessageModel {

    @JsonProperty("PicUrl")
    @JacksonXmlProperty(localName = "PicUrl")
    private String picUrl;

    @JsonProperty("MediaId")
    @JacksonXmlProperty(localName = "MediaId")
    private String mediaId;

    @JsonProperty("MsgType")
    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "image";


}
