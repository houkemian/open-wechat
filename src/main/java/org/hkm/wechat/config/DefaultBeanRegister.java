package org.hkm.wechat.config;

import org.hkm.wechat.base.AccessTokenManager;
import org.hkm.wechat.base.DefaultAccessTokenManager;
import org.hkm.wechat.msg.receive.DefaultEventMessageProcessor;
import org.hkm.wechat.msg.receive.DefaultReceiveMessageProcessor;
import org.hkm.wechat.msg.receive.ReceiveMessageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultBeanRegister {

    @Autowired
    private WechatConfigProperties wechatConfigProperties;


    @Bean
    public ReceiveMessageProcessor defaultMessageProcessor(){
        return new DefaultReceiveMessageProcessor();
    }

    @Bean
    public ReceiveMessageProcessor defaultEventMessageProcessor(){
        return new DefaultEventMessageProcessor();
    }

    @Bean
    @ConditionalOnMissingClass(value = {"accessTokenManager"})
    public AccessTokenManager accessTokenManager(){
        return new DefaultAccessTokenManager(wechatConfigProperties);
    }



}
