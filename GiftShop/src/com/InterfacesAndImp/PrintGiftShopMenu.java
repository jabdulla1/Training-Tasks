package com.InterfacesAndImp;

import java.util.List;

import com.Objects.Item;

public class PrintGiftShopMenu implements IPrintGiftShopMenu {

	@Override
	public void PrintOutGiftShopMenu(List<Item> items) {
		// TODO Auto-generated method stub
		int count=0;
		
		System.out.println("-------------------------------------------------------------------");
		System.out.println("\t\t\t Welcome to SNVA GiftShop");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Item No.   Name\t\tPrice");
		System.out.println("-------------------------------------------------------------------");
		for(int i=0; i< items.size(); i++) {
			System.out.println(++count +"  "+ items.get(i).getName() +"\t\t $"+ items.get(i).getPrice());
		}
		System.out.println("-------------------------------------------------------------------");
	}

}
