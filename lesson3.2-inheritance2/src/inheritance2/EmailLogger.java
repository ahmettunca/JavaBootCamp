package inheritance2;

public class EmailLogger extends Logger{

	//kod okunurlu�u i�in
	@Override
	public void log() {
		System.out.println("Email yolland�");
	}
}
