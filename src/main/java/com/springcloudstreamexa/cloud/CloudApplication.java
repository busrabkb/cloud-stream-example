package com.springcloudstreamexa.cloud;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CloudApplication implements CommandLineRunner {

	@Autowired
	public  ChatProducer producer;

	private ApplicationContext springContext;
	public static void main(String[] args) {
		 SpringApplication.run(  CloudApplication.class);
		}

	public void start(Stage primaryStage) throws Exception {
//	sendMessageController= (SendMessageController) springContext.getBean(SendMessageController.class);

	//	sendMessageController.run();

	}

	@Override
	public void run(String... args) throws Exception {
		producer.publishChatData("data");
	}
}
