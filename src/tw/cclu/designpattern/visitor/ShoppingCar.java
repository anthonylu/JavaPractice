package tw.cclu.designpattern.visitor;

import java.util.LinkedList;

public class ShoppingCar {
	private LinkedList<Visitable> items = new LinkedList<>();
	
	public void addItem(Visitable item) {
		items.add(item);
	}
	
	public void removeItem(Visitable item) {
		items.remove(item);
	}

	public double calculatePrice(Visitor v) {
		for (Visitable item:items) item.accept(v);;
		return v.getTotalPrice();
	}
}
