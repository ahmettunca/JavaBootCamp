package inheritance;

public class Main {

	public static void main(String[] args) {
		// �rne�in: M��teri kaydet butonuna t�kland���nda constructor i�lemi icra edilir
		
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
		
		//Ger�ek hayatta polimorfizm b�yle kullan�l�r
		Customer[] customers= {ahmet,hepsiBurada,abc};
		customerManager.addMultiple(customers);
		
	}
	
	
}



