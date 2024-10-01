package com.loglevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Logger {
	 private List<Command> commandList;

	    public Logger() {
	        commandList = new ArrayList<>();
	    }

	    public void addCommand(Command command) {
	        commandList.add(command);
	    }

	    public void processCommands() {
	        Iterator<Command> iterator = commandList.iterator();
	        while (iterator.hasNext()) {
	            Command command = iterator.next();
	            command.execute(null);


}
	    }
}
	    
