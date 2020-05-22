package data.datasend;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface DataStream {

 String OUTPUT_DATA= "DataOutput"  ;
 String INPUT_DATA="DataInput";

 String INPUT_DATAFROMCHAT="chatOutput";
 @Input(OUTPUT_DATA)
 MessageChannel dataOutputChannel();


 @Input(INPUT_DATAFROMCHAT)
 SubscribableChannel dataInputFromChatChannel();
 @Input(INPUT_DATA)
 SubscribableChannel dataInputChannel();
}
