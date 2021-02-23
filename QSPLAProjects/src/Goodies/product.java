package Goodies;

public class product {

	
	String name;
	int price;
	public product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ":" +  price;
	}
	
	
}
