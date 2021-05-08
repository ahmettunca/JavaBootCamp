package Abstract;

import java.util.ArrayList;
import java.util.List;

import Entities.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getfName()+":  added.");
		
	}

	@Override
	public void add(List<User> users) {
		
		for(User user:users) {
			this.add(user);
		}
	}

	@Override
	public void delete(User entity) {
		System.out.println(entity.getfName()+": deleted.");
		
	}

	@Override
	public void update(User entity) {
		System.out.println(entity.getfName()+":  updated.");
		
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
