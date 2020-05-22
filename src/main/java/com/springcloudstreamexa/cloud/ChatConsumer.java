package com.springcloudstreamexa.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;

public class ChatConsumer {


    @Autowired
    ChatCore chatCore;
    @StreamListener( ChatStream.INPUT_CHAT)
 public void    listenChatData(String chatData )
    {
       chatCore.processShowChatData(chatData);
    }


}
