package org.hkm.wechat.msg.receive;


public interface ReceiveMessageProcessor {

    String process(String message, String msgType);

}
