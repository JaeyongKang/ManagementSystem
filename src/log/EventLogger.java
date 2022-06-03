package log;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1938004195902651007L;
	FileHandler fileHandler;
	LogManager logManager;
	Logger logger;
	
	public EventLogger() {
		
	}
	
	public EventLogger(String fileName) {
		try {
			logManager = LogManager.getLogManager();
			logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fileHandler = new FileHandler(fileName);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public void log(String logMessage) {
		logger.info(logMessage);
	}
}
