package com.messageservice;

public class MyApplication {
	private MessageService messageService;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }

}
