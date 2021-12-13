package org.hkm.wechat.msg.receive;

import org.hkm.wechat.msg.receive.model.BaseMessageModel;
import org.hkm.wechat.util.JacksonUtil;

public class DefaultReceiveMessageProcessor implements ReceiveMessageProcessor{

    @Override
    public String process(String data, String msgType) {
        BaseMessageModel message = JacksonUtil.parse(data, BaseMessageModel.class);
        return message.getFromUserName();
    }
}
