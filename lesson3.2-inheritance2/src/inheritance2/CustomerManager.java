package inheritance2;

public class CustomerManager {

	//Ýþ yapan sýnýflar new'lenmez. Buradaki gibi metoda parametre olarak gönderip polimorfizm'i icra etmek gerekir
	//Bu Logger logger, Logger class'ýný extend eden sýnýflarýn referansýný tutabilir.
	//Clean code oluyor
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi...");
		
		//Loglamalarý çaðýrmak istiyorum.
		logger.log();
	}
}
