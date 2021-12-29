/*
 * Product class implements an Item interface
 */

package composite;

public class Product implements Item {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void description() {
		System.out.println("This product is a " + this.name);
	}
	
	@Override
	public double calculatePrice() {
		return this.price;
	}

}


