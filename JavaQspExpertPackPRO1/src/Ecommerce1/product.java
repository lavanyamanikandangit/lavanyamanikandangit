package Ecommerce1;

public class product {
String name,manufacturer;
int id,price;
static int finalprice;
public  product(int id,String name,int price,String manuf)
{
	super();
	this.id=id;
	this.name=name;
	this.price=price;
	this.manufacturer=manuf;
	this.finalprice=0;
}

	public String toString() {
		return "Product Id:"+id+", "+"Name: "+name+", "+"price:"+price+", "+"Manufacturer:"+manufacturer;
		
	}
	public static int getFinalPrice() {
		return finalprice;
	}
	
}
