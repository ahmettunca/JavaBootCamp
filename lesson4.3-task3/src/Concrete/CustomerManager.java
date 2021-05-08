package Concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.User;

public class CustomerManager extends BaseUserManager {

	private UserCheckService userCheckService;
	
	public CustomerManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}

	@Override
	public void add(User user) {
		try {
			if(!userCheckService.checkIfRealUser(user)) {
				System.out.println("Kullanýcý bulunamadý");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		super.add(user);
	}

	@Override
	public void add(List<User> users) {
		// TODO Auto-generated method stub
		try {
			add(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	 @Override
	public ArrayList<User> getAll() {
		return super.getAll();
	}
	
	
}
