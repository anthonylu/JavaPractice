package tw.cclu.math;

public class Fibonacci {

  // closed-form solution
  public long getNumber(int n) {
    if (n <= 0) return 0;
    double sqrtFive = Math.sqrt(5.0);
    double number = 
        (Math.pow((1+sqrtFive), n) - Math.pow(1-sqrtFive,n)) / 
        (Math.pow(2, n)*sqrtFive);
    
    return new Double(number).longValue() ;
  }
  
  public long getNumberRecursive(int n) {
    long number = 0;
    //F0=0
    if (n <= 0) {
      return number;
    //F1=1
    } else if (n == 1) {
      return n;
    } else {
      number = getNumberRecursive(n-1) + getNumberRecursive(n-2);
    }
    return number;
  }
  
  public long getNumberIterative(int n) {
    long number = 0, previous = 1, current = 0;
    
    for (int i = 0; i < n; ++i) {
      current = number;
      number = current + previous;
      previous = current;
    }
    
    return number;
  }

}
