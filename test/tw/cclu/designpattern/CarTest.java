package tw.cclu.designpattern;

import static org.junit.Assert.*;

import org.junit.Test;

import tw.cclu.designpattern.observer.Car;
import tw.cclu.designpattern.observer.RunningObserver;
import tw.cclu.designpattern.observer.StopObserver;
import tw.cclu.designpattern.observer.Car.State;

public class CarTest {

	@Test
	public void test() {
		Car car = new Car();
		car.register(new RunningObserver());
		car.register(new StopObserver());
		car.setState(State.RUN);
		car.setState(State.STOP);
	}

}
