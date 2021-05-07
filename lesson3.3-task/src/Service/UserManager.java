package Service;

import Entity.User;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getClass().getTypeName().replaceAll(user.getClass().getPackageName()+".", "")+
				": "+user.getName()+" eklendi");
	}
	
	public void add(User[] user) {
		for(User u: user) {
			add(u);
		}
	}
}
