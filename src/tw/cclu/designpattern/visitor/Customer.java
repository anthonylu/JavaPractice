package tw.cclu.designpattern.visitor;

public class Customer implements Visitor {
	private double totalPrice;

	@Override
	public double getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void visit(Book book) {
		totalPrice += book.getPrice();
	}

	@Override
	public void visit(Dvd dvd) {
		totalPrice += dvd.getPrice();
	}

}
