package org.hkm.wechat.base;

import org.hkm.wechat.config.WechatConfigProperties;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Scope("single")
public class DefaultAccessTokenManager implements AccessTokenManager{

    private volatile String token;

    private WechatConfigProperties wechatConfigProperties;

    public DefaultAccessTokenManager(WechatConfigProperties wechatConfigProperties){
        this.wechatConfigProperties = wechatConfigProperties;
    }

    @Override
    public void cache(String accessToken) {
        System.out.println(accessToken);
        this.token = accessToken;
    }

    @Override
    public String get() {
        return this.token;
    }

    @Override
    @PostConstruct
    public void refresh() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                request(wechatConfigProperties);
            }
        }, new Date(), 7100000);

    }
}
