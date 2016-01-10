package tw.cclu.designpattern.visitor;

public class Book implements Visitable {
	private double price;
	
	public Book(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
