package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShopPrices {
	
	// Menu
	
	List<Product> products = new ArrayList<> ();
	
	// class member variable
	
	Scanner input = new Scanner(System.in);
	
	
	public void setupProducts() {
		Product coffee = new Product ();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);
		
		Product tea = new Product ();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);
		
		Product cookie = new Product ();
		cookie.setName("Cookie");
		cookie.setPrice(6.77);
		products.add(cookie);
		
		Product sandwich = new Product ();
		sandwich.setName("Egg & Cheese Muffin");
		sandwich.setPrice(9.99);
		products.add(sandwich);
				
	
		
	}
	public void printProduct(Product product) {
 		System.out.println("Product name : " + product.getName() + " Price : " + product.getPrice());
 		
	}
	
	public void printAllProducts() {
		for (Product product : products) {
			printProduct (product);
		}
	}
	
		

	// move this later: public static void main(String[] args) {
		// CoffeeShopPrices cf = new CoffeeShopPrices();
		// cf.setupProducts();
	
	public void example() {
		
		
	
		// the value in each product is the price
		double coffee = 5.44d;
		double tea = 4.33d;
		double cookie = 6.73d;
		
		double subTotal = 0;
		
		// 3 items of first product
		subTotal = coffee * 1;
		
		// 4 items of the 2nd product
		subTotal = subTotal + (tea * 1);
		
		// 2 items of the 3rd product
		subTotal = subTotal + (cookie * 1);
		
		DecimalFormat df = new DecimalFormat ("$#,##0.00");
		System.out.println("Subtotal " + df.format(subTotal));
		
		double salesTax = subTotal * 0.10;
		System.out.println("Sales Tax\t : " + df.format(salesTax));
		
		double totalSale = subTotal + salesTax;
		System.out.println("Total\t\t" + df.format(totalSale));	
		
	}

		public int userSelect( ) {
			System.out.println("1) Print the menu items and prices") ;
			System.out.println("2) Add an item to your order") ;
			System.out.println("3) Print the items in your order.") ;
			System.out.println("4) Checkout") ;
			
			System.out.print ("What would you like to do?") ;
		
			
			int select = input.nextInt();
			
			return select;
		} 
		
		public static void main(String[] args) {
			CoffeeShopPrices cf = new CoffeeShopPrices();
			cf.setupProducts();
			
			int userSelection = cf.userSelect();
			if (userSelection == 1) {
				cf.printAllProducts();
			} else {
					System.out.println("User input " + userSelection + "is unknown.  Try again;");
			}
	  }
}

		
		