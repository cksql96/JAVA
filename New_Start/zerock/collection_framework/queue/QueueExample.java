package com.zerock.collection_framework.queue;

import java.util.LinkedList;
import java.util.Queue;

import lombok.extern.log4j.Log4j;

@Log4j
public class QueueExample {
	
	
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();		
		
		messageQueue.offer( new Message("sendMail", "홍길동"));
		messageQueue.offer( new Message("sendSMS", "신용권"));
		messageQueue.offer( new Message("sendKakaotalk", "홍두께"));
		//----------------------------------//
		
		while(!messageQueue.isEmpty()) {	
			Message message = messageQueue.poll();
			
			switch(message.command) {
				case "sendMail" :
					log.info(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS" :
					log.info(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk" :
					log.info(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}	//switch
		}	//while
		
		
	}	//end main

}	//end class
