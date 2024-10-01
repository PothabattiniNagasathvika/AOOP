package com.loglevel;

public class Client {
	public static void main(String[] args) {
	 LogHandler infoHandler = new InfoHandler();
     LogHandler debugHandler = new DebugHandler();
     ErrorHandler errorHandler = new ErrorHandler();

     // Configure chain of responsibility
     infoHandler.setNextHandler(debugHandler);
     debugHandler.setNextHandler(errorHandler);

     // Create logger
     Logger logger = new Logger();

     // Create log commands
     logger.addCommand(new LogCommand(LogLevel.INFO, "This is an info message", infoHandler));
     logger.addCommand(new LogCommand(LogLevel.DEBUG, "This is a debug message", infoHandler));
     logger.addCommand(new LogCommand(LogLevel.ERROR, "This is an error message", infoHandler));
     logger.addCommand(new LogCommand(LogLevel.DEBUG, "Another debug message", infoHandler));

     // Process all commands
     logger.processCommands();
 }
}



