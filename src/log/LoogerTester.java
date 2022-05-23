package log;

public class LoogerTester {
	
	public LoogerTester() {
		
	}

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");
		

	}

}
