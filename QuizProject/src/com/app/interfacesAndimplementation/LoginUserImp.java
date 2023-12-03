package com.app.interfacesAndimplementation;

import com.app.ojects.User;

public class LoginUserImp implements LoginUser {

	@Override
	public User Login(User user) {
		// TODO Auto-generated method stub
		
		ValidateUser validateUser = new ValidateUserImp();
		
		return validateUser.Validate(user);
	}

}
