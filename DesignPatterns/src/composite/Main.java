
package composite;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Box mainBox = new Box(new ArrayList<Item>());
		
		/* Creating mainBox to store all other boxes */
		mainBox.addItem(new Product("Clean Code: A Handbook of Agile Software Craftsmanship", 200.90));
		
		/* Creating other boxes to be stored inside the main one */
		Box smartphoneBox = new Box(new ArrayList<Item>());
		smartphoneBox.addItem(new Product("Samsung Galaxy S21 Ultra 5G", 3000));
		smartphoneBox.addItem(new Product("Samsung Galaxy S20 FE", 2000));
		smartphoneBox.addItem(new Product("iPhone 13", 2000));
		smartphoneBox.addItem(new Product("iPhone 12", 1500));
		mainBox.addItem(smartphoneBox);
		
		Box laptopBox = new Box(new ArrayList<Item>());
		laptopBox.addItem(new Product("Acer Nitro AN515-44-R5YZ", 5499));
		laptopBox.addItem(new Product("Dell G15", 5301));
		mainBox.addItem(laptopBox);
		
		Box booksBox = new Box(new ArrayList<Item>());
		booksBox.addItem(new Product("Marcus Aurelius - Meditations", 12.30));
		booksBox.addItem(new Product("The Hitchhikers Guide to the Galaxy - Douglas Adams", 17.10));
		booksBox.addItem(new Product("Learning Deep Learning - Random Author", 25));
		mainBox.addItem(booksBox);
		
		/* Calls calculatePrice which recursively calculates
		 * the price for all the boxes inside 
		 */
		System.out.println("Total Price: " + mainBox.calculatePrice());
	}
}

