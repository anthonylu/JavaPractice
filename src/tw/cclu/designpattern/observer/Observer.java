package tw.cclu.designpattern.observer;

public interface Observer {
	void stateChanged(Observable sub, Object obj);
}
