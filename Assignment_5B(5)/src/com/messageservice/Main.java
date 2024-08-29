package com.messageservice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        MyApplication appWithEmail = new MyApplication(emailService);
        MyApplication appWithSMS = new MyApplication(smsService);

        appWithEmail.send("Hello via Email");
        appWithSMS.send("Hello via SMS");

	}

}
