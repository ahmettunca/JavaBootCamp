package inheritance;

public class Main {

	public static void main(String[] args) {
		// Örneðin: Müþteri kaydet butonuna týklandýðýnda constructor iþlemi icra edilir
		
		IndividualCustomer ahmet=new IndividualCustomer();
		ahmet.customerNumber="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc= new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager=new CustomerManager();
		/*customerManager.add(hepsiBurada);
		customerManager.add(ahmet);
		customerManager.add(abc);*/
		
		//Gerçek hayatta polimorfizm böyle kullanýlýr
		Customer[] customers= {ahmet,hepsiBurada,abc};
		customerManager.addMultiple(customers);
		
	}
	
	
}



