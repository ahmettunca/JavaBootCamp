package interfaces;

public class SmsLogger implements Logger {

	//SmsLogger class'ýný Logger interface'ine uyarladýk (implemente etttik-uyguladýk).
	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : "+message);
	}

}
