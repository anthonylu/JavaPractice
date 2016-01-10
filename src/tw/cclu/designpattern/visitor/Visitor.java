package tw.cclu.designpattern.visitor;

public interface Visitor {
	void visit(Book book);
	void visit(Dvd dvd);
	double getTotalPrice();
}
