package org.hkm.wechat.msg.receive;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.hkm.wechat.msg.BaseMessageModel;
import org.hkm.wechat.msg.response.model.NewsMessage;
import org.hkm.wechat.util.JacksonUtil;

import java.util.Collections;

public class DefaultReceiveMessageProcessor implements ReceiveMessageProcessor{

    @Override
    public String process(String data, String msgType) {
        BaseMessageModel message = JacksonUtil.parse(data, BaseMessageModel.class);


        NewsMessage msg = new NewsMessage();
        NewsMessage.Article article = new NewsMessage.Article("t","d", "http://www.baidu.com/a.jpg", "http://www.baidu.com");
        msg.setItem(Collections.singletonList(article));
        msg.setArticleCount(1l);
        msg.setCreateTime(System.currentTimeMillis());
        msg.setFromUserName(message.getToUserName());
        msg.setToUserName(message.getFromUserName());

        ObjectMapper mapper = new XmlMapper();
        String response = null;
        try {
            response = mapper.writeValueAsString(msg);
            System.out.println(response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return response;
    }
}
