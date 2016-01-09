package tw.cclu.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathOpsTest {

	@Test
	public void testPower() {
		assertTrue(MathOps.pow(2, 13) == (long)Math.pow(2, 13));
		assertTrue(MathOps.pow(4, 8) == (long)Math.pow(4, 8));
		assertTrue(MathOps.pow(13, 9) == (long)Math.pow(13, 9));
	}

}
