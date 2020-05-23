package data.datasend;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface DataStream {



 String INPUT_DATAFROMCHAT="chatOutput";



 @Input(INPUT_DATAFROMCHAT)
 SubscribableChannel dataInputFromChatChannel();

}
