
public class IceCream {
	private String name;
	private int price;
	private int qunaity;

	IceCream(String name, int price){
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
