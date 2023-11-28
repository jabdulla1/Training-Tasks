package com.InterfacesAndImp;


import java.util.List;

import com.Objects.GiftShop;
import com.Objects.Item;

public class PrintReceipt implements IPrintReceipt {

	@Override
	public void PrintOutReceipt(GiftShop giftShop) {
		// TODO Auto-generated method stub
		
		List<Item> order = giftShop.getItems();
		int count =0;
		double total=0;
		double giftCardAmount= giftShop.getGiftCard();
		
		System.out.println("-----------------------------------------------");
		System.out.println("\t\t SNVA Gift Shop Reciept");
		System.out.println("-----------------------------------------------");
		System.out.println("Item No.  Name\t\tPrice");
		for(int x = 0; x< order.size(); x++) {
			System.out.println(++count +"  "+ order.get(x).getName() +"\t\t $"+ order.get(x).getPrice());
			total += order.get(x).getPrice();		
		}
		
		if(giftCardAmount > total) {
			double printGiftCardAmount = giftCardAmount;
			double printTotal = total;
			
			giftCardAmount = giftCardAmount - total;
			total =0;
			
			System.out.println("-----------------------------------------------");
			System.out.println("Current Gif Card Amount: $"+ printGiftCardAmount);
			System.out.println("Total: $"+ printTotal );
			System.out.println("Gift Card Amount After Purchase: $"+ giftCardAmount);
			System.out.println("Your New Total: $"+ total);
			System.out.println("-----------------------------------------------");

			
		}else {
			
			double printGiftCardAmount = giftCardAmount;
			double printTotal = total;
			
			total = total - giftCardAmount;
			giftCardAmount= 0;
			
			
			System.out.println("-----------------------------------------------");
			System.out.println("Current Gif Card Amount: $"+ printGiftCardAmount);
			System.out.println("Total: $"+ printTotal +" Gift Card Amount After Purchase: $"+ giftCardAmount);
			System.out.println("Your New Total: $"+ total);
			System.out.println("-----------------------------------------------");

		}
		
		System.out.println("\t\t\tThank You");
	}

}
