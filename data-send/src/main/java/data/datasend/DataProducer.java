package data.datasend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("chatProducer")
@Transactional
public class DataProducer {

    @Autowired
    @Qualifier( DataStream.OUTPUT_DATA)
private  MessageChannel dataOutputChannel;

    public void publishData(String streamData){

        dataOutputChannel.send(MessageBuilder.withPayload(streamData).build());

    }

}
