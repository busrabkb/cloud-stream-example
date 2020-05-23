package com.springcloudstreamexa.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ChatConsumer {


    @Autowired
    ChatCore chatCore;


}
