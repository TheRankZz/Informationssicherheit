package service;

import entities.User;

public class Hello implements IHello {

	@Override
	public User login(String identity) {
		
		User user = new User();
		user.setIdentity(identity);
		
		return user;
	}

	@Override
	public RegisterRequest register(String identity, RegisterRequest register) {
		// TODO Auto-generated method stub
		return register;
	}



}
