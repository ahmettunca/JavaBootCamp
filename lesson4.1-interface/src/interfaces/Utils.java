package interfaces;

//üst class static yapýlmaz

public class Utils {

	
	
	public static void runLoggers(Logger[] loggers, String message) {
		
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
	
	//üst class içine - inner class yaparsam static tanýmlayabilirim.
	public static class Util{
		
	}
}
