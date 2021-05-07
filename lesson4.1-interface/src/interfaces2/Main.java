package interfaces2;

public class Main {

	public static void main(String[] strings) {
		Logger[] loggers = {new DatabaseLogger(),new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer ahmet = new Customer(1,"Ahmet ", "X");
		customerManager.add(ahmet);
	}
}
