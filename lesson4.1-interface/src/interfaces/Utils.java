package interfaces;

//�st class static yap�lmaz

public class Utils {

	
	
	public static void runLoggers(Logger[] loggers, String message) {
		
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
	
	//�st class i�ine - inner class yaparsam static tan�mlayabilirim.
	public static class Util{
		
	}
}
