package org.hkm.wechat.enums;

import java.text.MessageFormat;

public class WechatApi {

    private static String domain = "https://api.weixin.qq.com";

    public interface Api{
        String genUrl(Object... args);
    }

    public enum Base implements Api{
        Access_Token(domain+"/cgi-bin/token?grant_type=client_credential&appid={0}&secret={1}"),
        ;

        private String pattern;

        Base(String pattern){
            this.pattern = pattern;
        }

        @Override
        public String genUrl(Object... args) {
            return MessageFormat.format(pattern, args);
        }
    }

    public enum CustomerService implements Api{
        SEND_MSG(domain+"/cgi-bin/message/custom/send?access_token={0}"),
        ;

        private String pattern;

        CustomerService(String pattern){
            this.pattern = pattern;
        }

        @Override
        public String genUrl(Object... args) {
            return MessageFormat.format(pattern, args);
        }
    }
}
