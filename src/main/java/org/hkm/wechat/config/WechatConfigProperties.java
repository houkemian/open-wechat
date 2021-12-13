package org.hkm.wechat.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "wechat")
@Data
public class WechatConfigProperties {

    private String token = "123";
    private String encodingAESKey;
    private String appId;
    private String appSecret;
}
