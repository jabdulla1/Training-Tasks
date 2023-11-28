package com.Objects;

import java.util.ArrayList;
import java.util.List;

public abstract class Shop {

	List<Item> items = new ArrayList<>();
	
	
	public List<Item> getItems() {
		return items;
	}


	public void setItems(List<Item> items) {
		this.items = items;
	}


	public abstract void addItem(Item items);
		//this.items.add(items);
	
	
}
