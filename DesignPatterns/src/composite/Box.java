package composite;

import java.util.List;

public class Box implements Item {
	/*
	 * List to store elements references
	 * Must be declared as an interface
	 */
	private List<Item> items;
	
	public Box(List<Item> itens) {
		this.items = itens;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	/*
	 * Recursively collects and sum all results
	 * Goes through the whole objects tree, as the Container
	 * sends the request to each child  
	 */
	@Override
	public double calculatePrice() {
		double finalPrice = 0;
		
		for (Item item : items) {
			finalPrice += item.calculatePrice();
		}
		
		return finalPrice;
	}
}

