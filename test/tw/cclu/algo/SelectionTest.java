package tw.cclu.algo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SelectionTest {
  private int[][] data = {{5, 12, 4, 3, 51}, {13, 5, 12, 4, 51, 3}};
  private int[]   solution = {5, 5};
  private Selection sel;
  
  @Before
  public void setup() {
    sel = new Selection();
  }

  @Test 
  public void testSwap() {
    Selection.swap(data[0], 0, 3);
    assertTrue(data[0][3]==5&&data[0][0]==3);
  }
  
  @Test
  public void testGetMedian() {
    int n = 100;
    for (int k=0;k<2;++k) {
      n += k;
      for (int j=0;j<100;++j) {
        RandomShuffle rs = new RandomShuffle(n);
        int[] data = new int[n];
        for (int i = 0; i < data.length; ++i) {
          data[i] = rs.getNext();
          //System.out.print(data[i]+",");
        }
        /*System.out.println();*/
        int median = sel.getMedian(data,0,data.length-1,(data.length+1)/2);
        //System.out.println(median);
        assertTrue((data.length+1)/2==median);
      }
    }
  }
  
  @Test
  public void testGetMedianByComparisonSort() {
    assertTrue(sel.getMedianByComparisonSort(data[0])==solution[0]);
    assertTrue(sel.getMedianByComparisonSort(data[1])==solution[1]);
  }

  @Test
  public void testMedianByCountingSort() {
    assertTrue(sel.getMedianByCountingSort(data[0],51)==solution[0]);
    assertTrue(sel.getMedianByCountingSort(data[1],51)==solution[1]);
  }

}
