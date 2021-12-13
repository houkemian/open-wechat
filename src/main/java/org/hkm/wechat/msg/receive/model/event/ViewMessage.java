package org.hkm.wechat.msg.receive.model.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hkm.wechat.msg.receive.model.EventMessageModel;

@Data
public class ViewMessage extends EventMessageModel {


    @JsonProperty("EventKey")
    private String eventKey;

}
