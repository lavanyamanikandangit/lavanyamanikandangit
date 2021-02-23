package Ecommerce;

import java.util.LinkedHashMap;
import java.util.Map;



public class User {
	


	
		String name;
		Map<product, Integer> l=new LinkedHashMap<product, Integer>();
		int finalPrice;

		public User(String name) {
			super();
			this.name = name;
			this.finalPrice=0;
		}



		

	}

