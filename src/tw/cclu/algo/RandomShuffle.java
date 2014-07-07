package tw.cclu.algo;

public class RandomShuffle {
  private int[] numbers;
  private int currentIndex = 0;

  public RandomShuffle(int n) {
    numbers = new int[n];
    for (int i = 0; i < n; ++i)
      numbers[i] = i+1;
    shuffle();
  }
  
  private void shuffle() {
    int index = 0;
    for (int i = 0; i < numbers.length; ++i) {
      index = (int) (Math.random()*(numbers.length-i));
      Selection.swap(numbers, index, numbers.length-i-1);
    }
  }
  
  public int getNext() {
    return numbers[currentIndex++];
  }
  
  public void reset() {
    shuffle();
    currentIndex = 0;
  }

}
