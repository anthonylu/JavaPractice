package tw.cclu.designpattern.observer;

public interface Observable {
	void register(Observer ob);
	void unregister(Observer ob);
	void notifyObservers();
}
