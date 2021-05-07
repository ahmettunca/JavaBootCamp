package inheritance;

public class CustomerManager {
	//reusability- tekrar tekrar kullannabilmek için
	//bir kere yaz her yerde kullan
	//Customer sýnýfý kendisini extend eden sýnýflarýn referanslarýný tutabilir.

	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	
	//Ayný anda birden fazla customer eklemek istiyorum -"bulk insert" deniyor
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
				add(customer);
		}
	}
}

//SOLID - Open Closed Principle