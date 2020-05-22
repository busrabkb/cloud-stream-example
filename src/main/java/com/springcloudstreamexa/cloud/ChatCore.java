package com.springcloudstreamexa.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ChatCore {
    @Autowired
    ChatProducer producer;

    public String processShowChatData(String data)
    {

        return data;
    }
    public void sendChatData()
    {
        producer.publishChatData("data");
    }
}
