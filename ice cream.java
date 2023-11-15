

public static void printIceCreamMenu(){
printScreen("Welcome to IceCream World Menu\n
1.Vanilla------------150\n
2.Chocolate----------200\n
3.Mint---------------100\n
4.Strawberry---------300\n
5.Teaberry-----------100\n");
}

class IceCream{
private String name;
private int price;
private int qunaity;

class IceCream(String name, int price){
this.name = name;
this.price=price;
this.qunaity=0;
}

public void setName(String name){
this.name = name;
}
public void setPrice(int price){
this.price= price;
}
public void setQuanity(int qunaity){

this.qunaity= qunaity;
}

public int getQunaity(){
return this.qunaity;
}
public String getName(){
return this.name;
}
public int getPrice(){
return this.price;
}

}

public static void main(String[] args){
	
	printIceCreamMenu();
	IceCream Vanilla = new IceCream("Vanilla", 150);
	IceCream Chocolate = new IceCream("Chocolate", 200);
	IceCream Mint = new IceCream("Mint", 100);
	IceCream Strawberry = new IceCream("Strawberry", 300);
	IceCream Teaberry = new IceCream("Teaberry", 150);
	
	
	print("Enter the quauanity for Vanilla\n");
	Vanilla.setQuanity(input());
	print("Enter the quauanity for Chocolate\n");
	Chocolate.setQuanity(input());
	print("Enter the quauanity for Mint\n");
	Mint.setQuanity(input());
	print("Enter the quauanity for Strawberry\n");
	Strawberry.setQuanity(input());
	print("Enter the quauanity for Teaberry\n");
	Teaberry.setQuanity(input());
	
	int qunaity=0;
	int total =0;
	
	qunaity= Vanilla.getQunaity()+ Chocolate.getQunaity()+Mint.getQunaity()+Strawberry.getQunaity()+Teaberry.getQunaity();
	total =  (Vanilla.getQunaity()*Vanilla.getPrice()) + (Chocolate.getQunaity()*Chocolate.getPrice())+ (Mint.getQunaity()*Mint.getPrice())+ (Strawberry.getQunaity()*Strawberry.getPrice()) + (Teaberry.getQunaity()*Teaberry.getPrice());
	
	print("----------------------------------\n");
	print("Sl.no        Flavour          Price      Quantity    Amount");
	print("1            Vanilla          150        "+Vanilla.getQunaity()+" "+ (Vanilla.getQunaity()*Vanilla.getPrice()));
	print("2            Chocolate        200        "+Chocolate.getQunaity()+" "+(Chocolate.getQunaity()*Chocolate.getPrice()));
	print("3            Mint             100        "+Mint.getQunaity()+" "+(Mint.getQunaity()*Mint.getPrice()));
	print("4            Strawberry       300        "+Strawberry.getQunaity()+" "+(Strawberry.getQunaity()*Strawberry.getPrice()));
	print("5            Teaberry         150        "+Teaberry.getQunaity()+" "+(Teaberry.getQunaity()*Teaberry.getPrice()));
	print("-----------------------------------\n");
	print("Your total amount is                       "+qunaity+" Amount"+ total);
	print("-----------------------------------\n");

	

}