package inheritance;

public class CustomerManager {
	//reusability- tekrar tekrar kullannabilmek i�in
	//bir kere yaz her yerde kullan
	//Customer s�n�f� kendisini extend eden s�n�flar�n referanslar�n� tutabilir.

	public void add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	
	//Ayn� anda birden fazla customer eklemek istiyorum -"bulk insert" deniyor
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
				add(customer);
		}
	}
}

//SOLID - Open Closed Principle