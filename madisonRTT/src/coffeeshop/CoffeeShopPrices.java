package coffeeshop;

import java.text.DecimalFormat;

public class CoffeeShopPrices {
	
	public static void main(String[] args) {
		// the value in each product is the pric
		double coffee = 5.43d;
		double tea = 4.33d;
		double cookie = 6.76;
		double subtotal = 0;
		
		// 3 items of first item
		subtotal = coffee * 3;
		
		// 4 items of the 2nd product
		subtotal = subtotal + (tea * 4);
		
		// 2 items of the 3rd product
		subtotal = subtotal + (cookie * 2);
		
		DecimalFormat df = new DecimalFormat ("0.00");
		
		System.out.println("subtotal : " + df.format(subtotal));
		
	}

}
