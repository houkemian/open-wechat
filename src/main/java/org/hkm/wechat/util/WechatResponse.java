package org.hkm.wechat.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

import static org.hkm.wechat.enums.ResponseKey.*;

public class WechatResponse {

    private String originData;
    private Map<String, Object> map;

    public WechatResponse(String originData){
        this.originData = originData;
        ObjectMapper mapper = new ObjectMapper();
        try {
            map = mapper.readValue(originData, Map.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public String getString(String key){
        return map.get(key).toString();
    }

    public boolean success(){
        return getErrCode()==null;
    }

    public Object getErrCode(){
        return map.get(ERR_CODE);
    }

    public String getErrMessage(){
        return map.get(ERR_MESSAGE).toString();
    }

}
