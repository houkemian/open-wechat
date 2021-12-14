package org.hkm.wechat.msg.receive.model.normal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.NormalMessageModel;

@Data
public class LocationMessage extends NormalMessageModel {

    @JsonProperty("Location_X")
    @JacksonXmlProperty(localName = "Location_X")
    private String location_X;

    @JsonProperty("Location_Y")
    @JacksonXmlProperty(localName = "Location_Y")
    private String location_Y;

    @JsonProperty("Scale")
    @JacksonXmlProperty(localName = "Scale")
    private String scale;

    @JsonProperty("Label")
    @JacksonXmlProperty(localName = "Label")
    private String label;

    @JsonProperty("MsgType")
    @JacksonXmlProperty(localName = "MsgType")
    private String msgType = "location";

}
