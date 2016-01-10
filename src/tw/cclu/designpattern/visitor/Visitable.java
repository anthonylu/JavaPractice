package tw.cclu.designpattern.visitor;

public interface Visitable {
	void accept(Visitor visitor);
	double getPrice();
}
