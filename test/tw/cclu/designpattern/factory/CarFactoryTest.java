package tw.cclu.designpattern.factory;

import static org.junit.Assert.*;

import org.junit.Test;

import tw.cclu.designpattern.factory.CarFactory.Type;

public class CarFactoryTest {

	@Test
	public void testGetInstanceOf() {
		assertTrue(CarFactory.getInstanceOf(Type.SPORTS) instanceof SportsCar);
		assertTrue(CarFactory.getInstanceOf(Type.VAN) instanceof Van);
		assertTrue(CarFactory.getInstanceOf(null) instanceof NullCar);
	}

}
