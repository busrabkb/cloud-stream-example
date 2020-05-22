package com.springcloudstreamexa.cloud;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CloudApplication extends Application {
	@Autowired
	SendMessageController sendMessageController;
	private ApplicationContext springContext;
	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		springContext = SpringApplication.run(  CloudApplication.class);
		sendMessageController= (SendMessageController) springContext.getBean(SendMessageController.class);

		sendMessageController.run();

	}

}
