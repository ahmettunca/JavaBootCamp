package inheritance2;

public class Main {

	public static void main(String[] args) {
		//Loglama: Örneðin: Projede kim ne zaman neyi yaptý. Mesela bir kullanýcýnýn timeline'ý(hareket dökümü)
		//Birbirinin alternatifi olan kodlar için if yazýlmaz
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new DatabaseLogger());

	}

}
