package com.loglevel;

public class InfoHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		 return level == LogLevel.INFO;
	}

	@Override
	protected void writeMessage(String message) {
		// TODO Auto-generated method stub
		 System.out.println("INFO: " + message);
	}

	@Override
	protected void setNextHandler1(ErrorHandler errorHandler) {
		// TODO Auto-generated method stub
		System.out.println("INFO: " + errorHandler);
	}

}
