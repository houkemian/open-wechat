package org.hkm.wechat.base;

import org.hkm.wechat.config.WechatConfigProperties;
import org.hkm.wechat.enums.WechatApi;
import org.hkm.wechat.util.HttpClient;
import org.hkm.wechat.util.WechatResponse;

import javax.validation.ValidationException;
import java.util.Optional;

import static org.hkm.wechat.enums.ResponseKey.*;

public interface AccessTokenManager {

    void cache(String accessToken);
    String get();
    void refresh();

    default void request(WechatConfigProperties wechatConfig) {

        WechatResponse response = new WechatResponse(
                Optional.ofNullable(
                        HttpClient.get(WechatApi.Base.Access_Token.genUrl(wechatConfig.getAppId(), wechatConfig.getAppSecret())))
                        .orElseThrow(() -> new ValidationException("request failed")));

        if (response.success()) {
            cache(response.getString(ACCESS_TOKEN.get()));
        } else {
            //todo
            System.out.println(response.getErrMessage());
        }
    }
}
