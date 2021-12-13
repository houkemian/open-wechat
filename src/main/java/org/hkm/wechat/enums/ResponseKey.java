package org.hkm.wechat.enums;

import java.text.MessageFormat;

public enum ResponseKey {

    ERR_CODE("errcode"),
    ERR_MESSAGE("errmsg"),
    ACCESS_TOKEN("access_token"),
    EXPIRES_IN("expires_in"),
    ;

    private String key;

    ResponseKey(String key){
        this.key = key;
    }

    public String get() {
        return key;
    }

}
