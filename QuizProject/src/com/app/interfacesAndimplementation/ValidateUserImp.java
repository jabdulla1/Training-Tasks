package com.app.interfacesAndimplementation;

import java.util.ArrayList;
import java.util.List;

import com.app.ojects.HTML_CSS_Quiz;
import com.app.ojects.JavaQuiz;
import com.app.ojects.Quiz;
import com.app.ojects.User;

public class ValidateUserImp implements ValidateUser {

	List<User> users;	
	
	public ValidateUserImp() {
		super();
		
		users= new ArrayList<User>();
		
		users.add(new User(110001, "jabdulla1", "asdfvab", new JavaQuiz("Java Quiz")));
		users.add(new User(133001, "mabdulla1", "asdfvab", new HTML_CSS_Quiz("HTML & CSS Quiz")));
		
	}


	public ValidateUserImp(List<User> users) {
		super();
		this.users = users;
	}


	@Override
	public User Validate(User user) {
		// TODO Auto-generated method stub
		
		for(int x=0; x< this.users.size(); x++) {
			
			if( (this.users.get(x).getPassword().equals(user.getPassword()) ) && 
					( this.users.get(x).getUserName().equals(user.getUserName()) ) ) {
				
				System.out.println("User Found");
				
				return this.users.get(x);
			}
			
		}
		
		
		return null;
	}

}
