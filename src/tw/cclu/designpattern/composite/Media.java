package tw.cclu.designpattern.composite;

public interface Media {
	String getType();
	void add(Media media);
	void remove(Media media);
	void clear();
	void displayInfo();
}
