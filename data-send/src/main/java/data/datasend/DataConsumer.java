package data.datasend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class DataConsumer {


    @Autowired
    DataCore dataCore;



    @StreamListener( DataStream.INPUT_DATAFROMCHAT)
    public void    listenChatData(String chatData )
    {
        dataCore.processShowChatData(chatData);
    }

}
