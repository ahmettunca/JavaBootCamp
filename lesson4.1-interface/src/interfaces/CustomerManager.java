package interfaces;

//Business-operation class

public class CustomerManager {
	
	//DI design pattern
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers= loggers;
	}

	//loosly(gev�ek) - tightly (Kat�) coupled(ba�l�)
	//sistem loosly coupled olmal�d�r. Dependency Injection kullancaz(DI)
	public void add(Customer customer) {
		System.out.println("M��teri eklendi : "+customer.getFirstName());
		
		//b�yle yapmal�y�z  - loglama 
		//this.logger.log(customer.getFirstName());
		
		//ayn� anda birden fazla loglama yapabilmek i�in
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}  Kendini tekrarlayan bir kod blo�u oldu�u ve her yerde �a�r�labilece�i i�in Util class'�
		alt�nda gruplad�k*/
		
		//Utils utils = new Utils(); Utils s�n�f�nda runLoggers'� static yaparsam new yapmam
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("\n\nM��teri silindi "+customer.getFirstName());
		
		//loglama
		//this.logger.log(customer.getFirstName());
		
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		Utils.runLoggers(loggers,customer.getLastName());
		
		
		
	}

}
