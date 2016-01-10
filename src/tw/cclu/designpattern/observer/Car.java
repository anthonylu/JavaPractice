package tw.cclu.designpattern.observer;

import java.util.LinkedList;

public class Car implements Observable {
	public enum State { RUN, STOP }
	private LinkedList<Observer> observers = new LinkedList<>();
	private State sta;

	public void setState(State s) {
		sta = s;
		notifyObservers();
	}
	
	public State getState() {
		return sta;
	}
	
	@Override
	public void register(Observer ob) {
		observers.add(ob);
	}
	
	@Override
	public void unregister(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyObservers() {
		for (Observer ob:observers)
			ob.stateChanged(this, sta);
	}


}
