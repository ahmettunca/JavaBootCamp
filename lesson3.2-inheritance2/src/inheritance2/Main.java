package inheritance2;

public class Main {

	public static void main(String[] args) {
		//Loglama: �rne�in: Projede kim ne zaman neyi yapt�. Mesela bir kullan�c�n�n timeline'�(hareket d�k�m�)
		//Birbirinin alternatifi olan kodlar i�in if yaz�lmaz
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());

	}

}
