package com.loglevel;

public class LogCommand implements Command{
	 private LogLevel level;
	    private String message;
	    private LogHandler handler;

	    public LogCommand(LogLevel level, String message, LogHandler handler) {
	        this.level = level;
	        this.setMessage(message);
	        this.handler = handler;
	    }


	@Override
	public void execute(String message) {
		// TODO Auto-generated method stub
		 handler.handleRequest(level, message);

		
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

}
