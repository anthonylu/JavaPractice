package tw.cclu.designpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testGetInstance() {
		assertTrue(Singleton.getInstance() instanceof Singleton);
		assertTrue(Singleton.getInstanceFromHolder() instanceof Singleton);
	}

}
