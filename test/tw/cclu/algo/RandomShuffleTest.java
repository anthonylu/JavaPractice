package tw.cclu.algo;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class RandomShuffleTest {

  @Test
  public void testGetNext() {
    RandomShuffle rs = new RandomShuffle(10);
    int[] array = new int[10];
    for (int i=0;i<array.length;++i) {
      array[i] = rs.getNext();
      System.out.print(array[i]+",");
    }
    boolean check = true;
    Arrays.sort(array);
    for (int i=0;i<array.length;++i) {
      check = check&&(array[i]==(i+1));
    }
    assertTrue(check);
  }

}
