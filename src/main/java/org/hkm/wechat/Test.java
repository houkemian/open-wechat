package org.hkm.wechat;

import org.hkm.wechat.msg.customerservice.model.ImageMessage;
import org.hkm.wechat.msg.customerservice.model.MessageModel;
import org.hkm.wechat.util.JacksonUtil;

public class Test {

    public static void main(String[] args) {
        ImageMessage message = new ImageMessage();
        message.setImage(MessageModel.image("ED5N_zxaNuHeTEC-Pg6DQm4e58Zh529HkrjC30102-_jYff2da7QFcTr84kRZXWY"));
        message.setToUserName("oMkRd5ylhnvOIuaStIAaP_z0HTXA");

        System.out.println(JacksonUtil.toString(message));

    }

}
