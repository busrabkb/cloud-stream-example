package com.springcloudstreamexa.cloud;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMessageController  extends Application {
    @Autowired
    public  ChatProducer producer;


    public    void run() {

        producer.publishChatData("data");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
