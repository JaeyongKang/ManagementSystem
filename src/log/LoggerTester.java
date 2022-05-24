package log;

public class LoggerTester {
	
	public LoggerTester() {
		
	}

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
		

	}

}
