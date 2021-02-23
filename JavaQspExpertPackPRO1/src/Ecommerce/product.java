package Ecommerce;

public class product {

	
		String name,type;
		int price;
		static int finalPrice;
		public product(String name, String type, int price) {
			super();
			this.name = name;
			this.type = type;
			this.price = price;
			this.finalPrice=0;
		}
		@Override
		public String toString() {
			return "product [name=" + name + ", type=" + type + ", price=" + price + "]";
		}
		public static int getFinalPrice() {
			return finalPrice;
		}
		
		
	}

