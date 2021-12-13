package org.hkm.wechat.msg.receive.model.normal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class VideoMessage extends NormalMessageModel {

    @JsonProperty("ThumbMediaId")
    private String thumbMediaId;

    @JsonProperty("MediaId")
    private String mediaId;

    @JsonProperty("MsgType")
    private String msgType = "video";

}
