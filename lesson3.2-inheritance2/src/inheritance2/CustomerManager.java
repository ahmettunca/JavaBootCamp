package inheritance2;

public class CustomerManager {

	//�� yapan s�n�flar new'lenmez. Buradaki gibi metoda parametre olarak g�nderip polimorfizm'i icra etmek gerekir
	//Bu Logger logger, Logger class'�n� extend eden s�n�flar�n referans�n� tutabilir.
	//Clean code oluyor
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi...");
		
		//Loglamalar� �a��rmak istiyorum.
		logger.log();
	}
}
