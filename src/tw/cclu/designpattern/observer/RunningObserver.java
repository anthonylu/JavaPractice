package tw.cclu.designpattern.observer;

import tw.cclu.designpattern.observer.Car.State;

public class RunningObserver implements Observer {

	@Override
	public void stateChanged(Observable sub, Object obj) {
		if (obj == State.RUN)
			System.out.println("Car is running");
	}

}
