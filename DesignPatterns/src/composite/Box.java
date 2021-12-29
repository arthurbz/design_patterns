package composite;

import java.util.List;

public class Box implements Item {
	// Lista para armazenar refer�ncias aos subelementos. 
	// Armazena tanto Folha como Cont�iner, por isso deve ser declarado com um tipo de interface Componente.
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

	// Percorre recursivamente todos os filhos, coletando e somando seus resultados. 
	// Como os filhos do Cont�iner passam essas chamadas para seus pr�prios filhos e assim em diante, 
	// toda a �rvore de objetos � percorrida como resultado.
	@Override
	public double calculatePrice() {
		double finalPrice = 0;
		
		for (Item item : items) {
			finalPrice += item.calculatePrice();
		}
		
		return finalPrice;
	}
}

