package com.example.kafka.messagingSystem.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	
	@KafkaListener(topics = "Sushma_Topic",groupId="my_group")
	public void listenToTopic(String recievedmessage) {
		System.out.println("Recieved Message" +recievedmessage);
	}
	
	

}
