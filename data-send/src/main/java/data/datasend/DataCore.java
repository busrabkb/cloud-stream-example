package data.datasend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataCore {
    @Autowired
    DataProducer producer;

    public String processShowData(String data)
    {

        return data;
    }
    public String processShowChatData(String data)
    {

        return data;
    }
    public void sendData()
    {
        producer.publishData("datasend");
    }
}
