package tw.cclu.designpattern.observer;

import tw.cclu.designpattern.observer.Car.State;

public class StopObserver implements Observer {

	@Override
	public void stateChanged(Observable sub, Object obj) {
		if (obj == State.STOP)
			System.out.println("Car stoped");
	}

}
