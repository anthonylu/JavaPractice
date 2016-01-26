package tw.cclu.designpattern.flyweight;

import static org.junit.Assert.*;

import org.junit.Test;

import tw.cclu.designpattern.factory.CarFactory.Type;
import tw.cclu.designpattern.factory.Vehicle;

public class FlyweightFactoryTest {

	@Test
	public void test() {
		Vehicle v = FlyweightFactory.getInstanceOf(Type.VAN);
		assertNotNull(v);
		assertNotNull(FlyweightFactory.getInstanceOf(Type.SPORTS));
		assertNotNull(FlyweightFactory.getInstanceOf(Type.NULL));
		assertNotNull(FlyweightFactory.getInstanceOf(null));
		assertTrue(v == FlyweightFactory.getInstanceOf(Type.VAN));
	}

}
