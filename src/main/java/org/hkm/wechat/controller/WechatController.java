package org.hkm.wechat.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.util.digester.Digester;
import org.hkm.wechat.base.AccessTokenManager;
import org.hkm.wechat.config.WechatConfigProperties;
import org.hkm.wechat.enums.MessageType;
import org.hkm.wechat.msg.receive.ReceiveMessageDispatcher;
import org.hkm.wechat.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.ByteArrayDecoder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

@RestController
@RequestMapping("/open-wechat")
public class WechatController {

    private WechatConfigProperties wechatConfigProperties;
    private ReceiveMessageDispatcher messageDispatcher;

    public WechatController(WechatConfigProperties wechatConfigProperties, ReceiveMessageDispatcher messageDispatcher){
        this.wechatConfigProperties = wechatConfigProperties;
        this.messageDispatcher = messageDispatcher;
    }

    @GetMapping
    public String main(String signature, String timestamp, String nonce, String echostr){

        TreeMap<String, String> map = new TreeMap<>();
        map.put(timestamp, timestamp);
        map.put(this.wechatConfigProperties.getToken(), this.wechatConfigProperties.getToken());
        map.put(nonce, nonce);

        StringBuilder sb = new StringBuilder();

        map.forEach((k,v) -> sb.append(k));

        String ret = DigestUtils.sha1Hex(sb.toString());
        return ret.equals(signature)?echostr:null;
    }

    @PostMapping
    public String receive(@RequestBody String data) throws IOException {
        return messageDispatcher.process(data);
    }

}
