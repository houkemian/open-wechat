package org.hkm.wechat;

import org.hkm.wechat.config.WechatConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {WechatConfigProperties.class})
public class App {

    public static void main(String[] args) {

        new SpringApplicationBuilder(App.class).web(WebApplicationType.SERVLET).run(args);

    }

}
