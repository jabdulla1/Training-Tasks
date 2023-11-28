package com.app;

import java.util.ArrayList;
import java.util.List;

import com.InterfacesAndImp.GiftShopInput;
import com.InterfacesAndImp.IGiftShopeInput;
import com.InterfacesAndImp.IPrintReceipt;
import com.InterfacesAndImp.PrintReceipt;
import com.Objects.GiftShop;
import com.Objects.Shop;

public class GiftShopProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop shop = new GiftShop();
		
		
		IGiftShopeInput iGiftShopeInput = new GiftShopInput();
		IPrintReceipt iPrintReceipt = new PrintReceipt();
				
		shop.setItems(iGiftShopeInput.GetGiftShopInput(shop.getItems()));
		
		iPrintReceipt.PrintOutReceipt((GiftShop) shop);
		

	}

}
