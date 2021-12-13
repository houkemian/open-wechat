package org.hkm.wechat.msg.receive.model.normal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class LocationMessage extends NormalMessageModel {

    @JsonProperty("Location_X")
    private String location_X;

    @JsonProperty("Location_Y")
    private String location_Y;

    @JsonProperty("Scale")
    private String scale;

    @JsonProperty("Label")
    private String label;

    @JsonProperty("MsgType")
    private String msgType = "location";

}
