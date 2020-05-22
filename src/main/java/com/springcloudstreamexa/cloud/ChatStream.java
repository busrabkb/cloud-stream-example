package com.springcloudstreamexa.cloud;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ChatStream {

 String OUTPUT_CHAT= "chatOutput"  ;
String INPUT_CHAT="chatInput";
 @Input(OUTPUT_CHAT)
 MessageChannel chatOutputChannel();


 @Input(INPUT_CHAT)
 SubscribableChannel chatInputChannel();
}
