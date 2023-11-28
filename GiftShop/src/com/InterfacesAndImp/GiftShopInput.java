package com.InterfacesAndImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Objects.Item;

public class GiftShopInput implements IGiftShopeInput {

	@Override
	public List<Item> GetGiftShopInput(List<Item> GiftShopItem) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);					
		//return GiftShopeItem.get(input.nextInt());
		IPrintGiftShopMenu IPGSM = new PrintGiftShopMenu();
		List<Item> Order = new ArrayList<>();
		int menuItem=0;
		do {
			IPGSM.PrintOutGiftShopMenu(GiftShopItem);
			
			menuItem= input.nextInt();
			
			Item item = new Item(GiftShopItem.get(menuItem-1).getName(), GiftShopItem.get(menuItem-1).getPrice());
			
			Order.add(item);
			
			System.out.println("Enter 'y' To Add Another Item");
		}while(input.next().equals("y"));
		input.close();
		return Order;
	}

}
