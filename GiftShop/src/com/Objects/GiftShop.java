package com.Objects;

import java.util.ArrayList;
import java.util.List;

public class GiftShop extends Shop{

	double GiftCard= 250;
	
	
	
	public GiftShop() {		
		super();
		// TODO Auto-generated constructor stub
		
		
		this.items.add(new Item("Custom Pens", 2));
		this.items.add(new Item("Hand Embroidered", 10));
		this.items.add(new Item("T-shirts", 35));
		this.items.add(new Item("Coffee Cup", 50));
		this.items.add(new Item("Soap", 4));
		this.items.add(new Item("Hand Bages", 60));
		this.items.add(new Item("Keychain", 3));
		this.items.add(new Item("Pottery", 25));
		this.items.add(new Item("Earrings", 10));
		this.items.add(new Item("Note Books", 29));
		this.items.add(new Item("Bracelet", 59));
	}



	public double getGiftCard() {
		return GiftCard;
	}



	public void setGiftCard(double giftCard) {
		GiftCard = giftCard;
	}



	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		this.items.add(item);
	}

}
