package com.springcloudstreamexa.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Component("chatProducer")

public class ChatProducer {

    @Autowired
    @Qualifier( ChatStream.OUTPUT_CHAT)
private  MessageChannel chatOutputChannel;

    public void publishChatData(String streamData){

        chatOutputChannel.send(MessageBuilder.withPayload(streamData).build());

    }

}
