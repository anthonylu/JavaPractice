package tw.cclu.designpattern.visitor;

public class Dvd implements Visitable {
	private double price;
	
	public Dvd(double price) {
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
