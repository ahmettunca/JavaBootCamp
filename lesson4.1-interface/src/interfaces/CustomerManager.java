package interfaces;

//Business-operation class

public class CustomerManager {
	
	//DI design pattern
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers= loggers;
	}

	//loosly(gevþek) - tightly (Katý) coupled(baðlý)
	//sistem loosly coupled olmalýdýr. Dependency Injection kullancaz(DI)
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : "+customer.getFirstName());
		
		//böyle yapmalýyýz  - loglama 
		//this.logger.log(customer.getFirstName());
		
		//ayný anda birden fazla loglama yapabilmek için
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}  Kendini tekrarlayan bir kod bloðu olduðu ve her yerde çaðrýlabileceði için Util class'ý
		altýnda grupladýk*/
		
		//Utils utils = new Utils(); Utils sýnýfýnda runLoggers'ý static yaparsam new yapmam
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("\n\nMüþteri silindi "+customer.getFirstName());
		
		//loglama
		//this.logger.log(customer.getFirstName());
		
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		Utils.runLoggers(loggers,customer.getLastName());
		
		
		
	}

}
