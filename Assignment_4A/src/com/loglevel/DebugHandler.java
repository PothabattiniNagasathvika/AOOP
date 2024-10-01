package com.loglevel;

public class DebugHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.DEBUG;
	}

	@Override
	protected void writeMessage(String message) {
		// TODO Auto-generated method stub
		 System.out.println("DEBUG: " + message);
		
	}

	@Override
	protected void setNextHandler1(ErrorHandler errorHandler) {
		// TODO Auto-generated method stub
		System.out.println("DEBUG: " + errorHandler);
		
	}

}
