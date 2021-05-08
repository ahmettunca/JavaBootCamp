package Test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Abstract.BaseProductManager;
import Abstract.BaseUserManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Entities.Customer;
import Entities.Game;
import Entities.Product;
import Entities.User;

public class Main {
	public static void main(String[] args) {
		//Games
		BaseProductManager gameService = new GameManager();
		Product game1= new Game(1, "F1 2020","a racing game ", 150);
		Product game2= new Game(2, "NBA 2K19","a baskeball game ", 150);
		Product game3= new Game(3, "Call of Duty","war game ", 150);
		Product game4= new Game(4, "Total War:Attila","a strategy game", 150);
		List<Product> games = new ArrayList<Product>();
		games.add(game1);games.add(game2);games.add(game3);games.add(game4);
		gameService.add(games);
		
		//Customers Verification
		BaseUserManager customerService = new CustomerManager(new MernisServiceAdapter());
		User customer1 = new Customer(1, "Veli", "Demir", "12345678927", LocalDate.of(1998, 2, 6));
		/*User customer2 = new Customer(1, "Veli", "Demir", "12345678927", LocalDate.of(1998, 2, 6));
		User customer3 = new Customer(1, "Veli", "Demir", "12345678927", LocalDate.of(1998, 2, 6));
		List<User> customers = new ArrayList<User>();
		customers.add(customer1);customers.add(customer2);customers.add(customer3);*/
		customerService.add(customer1);
		
		
	}
	

}
