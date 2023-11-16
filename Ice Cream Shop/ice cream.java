import java.util.Scanner;

public class IceCreamShop {

	public static void printIceCreamMenu(){
		System.out.println("Welcome to IceCream World Menu\n"
				+ "1.Vanilla------------150\n"
				+ "2.Chocolate----------200\n"
				+ "3.Mint---------------100\n"
				+ "4.Strawberry---------300\n"
				+ "5.Teaberry-----------100\n");
		
		}
	
	public static void printIceCreamOrder(IceCream Vanilla, IceCream Chocolate, IceCream Mint, IceCream Strawberry, IceCream Teaberry ){
		
		int qunaity=0;
		int total =0;
		
		qunaity= Vanilla.getQunaity()+ Chocolate.getQunaity()+Mint.getQunaity()+Strawberry.getQunaity()+Teaberry.getQunaity();
		total =  (Vanilla.getQunaity()*Vanilla.getPrice()) + (Chocolate.getQunaity()*Chocolate.getPrice())+ (Mint.getQunaity()*Mint.getPrice())+ (Strawberry.getQunaity()*Strawberry.getPrice()) + (Teaberry.getQunaity()*Teaberry.getPrice());
		int count=0;
		
		System.out.println("-------------------------------------------------------------------\n");
		System.out.println("Sl.no        Flavour          Price      Quantity    Amount");
		
		
		if(Vanilla.getQunaity()>0)System.out.println(++count +" "+"            Vanilla          150        "+Vanilla.getQunaity()+"\t\t "+ (Vanilla.getQunaity()*Vanilla.getPrice()));
	
		if(Chocolate.getQunaity()>0)System.out.println(++count + " "+"            Chocolate        200        "+Chocolate.getQunaity()+"\t\t "+(Chocolate.getQunaity()*Chocolate.getPrice()));
		
		if(Mint.getQunaity()>0)System.out.println(++count +" "+"            Mint             100        "+Mint.getQunaity()+"\t\t "+(Mint.getQunaity()*Mint.getPrice()));
		
		if(Strawberry.getQunaity()>0)System.out.println(++count +" "+"            Strawberry       300        "+Strawberry.getQunaity()+"\t\t "+(Strawberry.getQunaity()*Strawberry.getPrice()));
		
		if(Teaberry.getQunaity()>0)System.out.println(++count +" "+"            Teaberry         150        "+Teaberry.getQunaity()+"\t\t "+(Teaberry.getQunaity()*Teaberry.getPrice()));
		
		System.out.println("-------------------------------------------------------------------\n");
		System.out.println("Your total amount is                    "+qunaity+"\t\t "+total);
		System.out.println("-------------------------------------------------------------------\n");
		count=0;
	}
	
	public static boolean isOrdered(IceCream ordered) {
		if(ordered.getQunaity()>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		do {
		printIceCreamMenu();
		IceCream Vanilla = new IceCream("Vanilla", 150);
		IceCream Chocolate = new IceCream("Chocolate", 200);
		IceCream Mint = new IceCream("Mint", 100);
		IceCream Strawberry = new IceCream("Strawberry", 300);
		IceCream Teaberry = new IceCream("Teaberry", 150);
		
		
		System.out.println("Enter the quauanity for Vanilla\n");
		Vanilla.setQuanity(input.nextInt());
		System.out.println("Enter the quauanity for Chocolate\n");
		Chocolate.setQuanity(input.nextInt());
		System.out.println("Enter the quauanity for Mint\n");
		Mint.setQuanity(input.nextInt());
		System.out.println("Enter the quauanity for Strawberry\n");
		Strawberry.setQuanity(input.nextInt());
		System.out.println("Enter the quauanity for Teaberry\n");
		Teaberry.setQuanity(input.nextInt());
		
		printIceCreamOrder(Vanilla, Chocolate, Mint, Strawberry, Teaberry);
		System.out.println("Press y to make anouther order");

	}while(input.next().equals("y"));
	System.out.println("Thank You Goodbye");	
	}

}
