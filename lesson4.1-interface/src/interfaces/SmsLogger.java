package interfaces;

public class SmsLogger implements Logger {

	//SmsLogger class'�n� Logger interface'ine uyarlad�k (implemente etttik-uygulad�k).
	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi : "+message);
	}

}
