package com.loglevel;

public class ErrorHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.ERROR;
	}

	@Override
	protected void writeMessage(String message) {
		// TODO Auto-generated method stub
		 System.out.println("ERROR: " + message);
		
	}

	@Override
	protected void setNextHandler1(ErrorHandler errorHandler) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + errorHandler);
		
	}

}
