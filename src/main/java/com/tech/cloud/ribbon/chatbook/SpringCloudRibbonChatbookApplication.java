package com.tech.cloud.ribbon.chatbook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/chatbook-app")
public class SpringCloudRibbonChatbookApplication {

	@Value("${server.port}")
	private String port;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonChatbookApplication.class, args);
	}
	
	@GetMapping("/chat")
	public String chat() {
		return "Chatbook is running on port:"+port;
	}

}
