package com.org.calculate;

import com.org.object.Pastries;

public class CalTotalImp implements CalTotal {

	@Override
	public double CalculateTotal(Pastries black, Pastries white, Pastries chocolate, Pastries red) {
		// TODO Auto-generated method stub
		return (black.getPayable() + white.getPayable() + chocolate.getPayable() + red.getPayable());
	}
	
}
