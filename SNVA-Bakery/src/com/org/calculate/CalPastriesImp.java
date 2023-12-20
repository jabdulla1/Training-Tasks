package com.org.calculate;

import com.org.object.Pastries;

public class CalPastriesImp implements CalPastries {

	@Override
	public double CalQtyPastries(Pastries pastries) {
		// TODO Auto-generated method stub
		return (pastries.getQuanity() * pastries.getPrice());
	}

}
