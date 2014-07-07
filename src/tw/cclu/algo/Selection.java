package tw.cclu.algo;

import java.util.Arrays;

public class Selection {
  public int getMedianByComparisonSort(int[] data) {
    Arrays.sort(data);
    return data[(data.length+1)/2-1];
  }

  public int getMedianByCountingSort(int[] data, int max) {
    int[] bucket = new int[max+1];
    int i = 0, median;
    for (i = 0; i < data.length; ++i) {
      ++bucket[data[i]];
    }
    
    i = (data.length+1)/2;
    for (median = 0 ; median < max; ++median) {
      i -= bucket[median];
      if (i <= 0) break;
    }
    return median;
  }
  
  public int getMedian(int[] data, int start, int end, int target) {
    int medianOfMedians = select(data, start, end, target);
    swap(data, end, medianOfMedians);
    medianOfMedians = data[end];
    int k = start;
    for (int i = start; i < end; ++i) {
      if (data[i] < medianOfMedians) {
        swap(data, k++, i);
      }
    }
    swap(data, k, end);
    if (k == start+target-1)
      return data[k];
    else if (k < start+target-1) return getMedian(data, k+1, end, target-k-1+start);
    else return getMedian(data, start, k, target);
  }
  
  public int select(int[] a, int s, int e, int k ) {
    // if the partition length is less than or equal to 5
    // we can sort and find the kth element of it
    // this way we can find the median of n/5 partitions
    if (e-s+1 <= 5){
        //System.out.println("start:"+s+" end:"+e+" kth:"+k);
        Arrays.sort(a, s, e+1);
        return s+k-1;
    }
    
    // if array is bigger 
    // we partition the array in subarrays of size 5
    // no. of partitions = n/5 = (e+1)/5
    // iterate through each partition
    // and recursively calculate the median of all of them
    // and keep putting the medians in the starting of the array
    int numGroup = (e-s+1)%5 > 0 ? (e-s+1)/5+1 : (e-s+1)/5;
    //System.out.println("#data:"+a.length+" #group:"+numGroup);
    for (int i = 0; i < numGroup; i++){
        int left = s+5*i;
        int right = left + 4;
        if (right > e) right = e;
        //System.out.println(left+","+right);
        int medianIdx = select(a, left, right, (right+left)/2-left+1);
        swap(a, medianIdx, s+i);
    }
    //System.out.println("sorted");
    
    // now we have array 
    // a[0] = median of 1st 5 sized partition
    // a[1] = median of 2nd 5 sized partition
    // and so on till n/5
    // to find out the median of these n/5 medians
    // we need to select the n/10th element of this set (i.e. middle of it)
    return select(a, s, s+numGroup-1, (numGroup+1)/2);
  }
  
  public static void swap(int[] a, int i, int j) {
    if (i == j) return;
    a[i] ^= a[j];
    a[j] ^= a[i];
    a[i] ^= a[j];
  }
}
