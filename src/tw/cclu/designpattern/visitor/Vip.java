package tw.cclu.designpattern.visitor;

public class Vip implements Visitor {
	private double totalPrice;
	private double[] discount = { 0.9, 0.95 };

	@Override
	public double getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void visit(Book book) {
		totalPrice += book.getPrice()*discount[0];
	}

	@Override
	public void visit(Dvd dvd) {
		totalPrice += dvd.getPrice()*discount[1];
	}

}
