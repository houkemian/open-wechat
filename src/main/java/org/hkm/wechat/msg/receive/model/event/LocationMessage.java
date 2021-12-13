package org.hkm.wechat.msg.receive.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.EventMessageModel;

@Data
public class LocationMessage extends EventMessageModel {


    @JsonProperty("Latitude")
    private String latitude;

    @JsonProperty("Longitude")
    private String longitude;

    @JsonProperty("Precision")
    private String precision;

}
