package com.messageservice;

public class SMSService implements MessageService{

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS with message: " + message);
	}

}
