package tw.cclu.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
  private Fibonacci fib;
  
  @Before
  public void setup() {
    fib = new Fibonacci();
  }

  @Test
  public void testGetNumber() {
    assertTrue(fib.getNumber(0)==0);
    assertTrue(fib.getNumber(1)==1);
    assertTrue(fib.getNumber(2)==1);
    assertTrue(fib.getNumber(3)==2);
    assertTrue(fib.getNumber(4)==3);
    assertTrue(fib.getNumber(5)==5);
  }
  
  @Test
  public void testGetNumberRecursive() {
    assertTrue(fib.getNumberRecursive(0)==0);
    assertTrue(fib.getNumberRecursive(1)==1);
    assertTrue(fib.getNumberRecursive(2)==1);
    assertTrue(fib.getNumberRecursive(3)==2);
    assertTrue(fib.getNumberRecursive(4)==3);
    assertTrue(fib.getNumberRecursive(5)==5);
  }

  @Test
  public void testGetNumberIterative() {
    assertTrue(fib.getNumberIterative(0)==0);
    assertTrue(fib.getNumberIterative(1)==1);
    assertTrue(fib.getNumberIterative(2)==1);
    assertTrue(fib.getNumberIterative(3)==2);
    assertTrue(fib.getNumberIterative(4)==3);
    assertTrue(fib.getNumberIterative(5)==5);
  }
}
