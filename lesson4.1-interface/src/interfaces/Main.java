package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new DatabaseLogger(), new FileLogger()};
		
		//Custumer Manager'a senin ba��ml�l���n SmsLogger dedim
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer ahmet = new Customer(1,"Ahmet", "Tunca");
		customerManager.add(ahmet);
		customerManager.delete(ahmet);
		
	}
}
