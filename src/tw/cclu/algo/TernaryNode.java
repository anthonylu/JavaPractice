package tw.cclu.algo;

public class TernaryNode {
  private Character character;
  private boolean isEnd = false;
  private TernaryNode low, high, equal;

  public TernaryNode(char ch) {
    character = new Character(ch);
  }
  
  public Character getChar() {
    return character;
  }
  
  public TernaryNode getLow() {
    return low;
  }

  public TernaryNode getEqual() {
    return equal;
  }

  public TernaryNode getHigh() {
    return high;
  }
  
  public boolean isEnd() {
    return isEnd;
  }
  
  public void setEnd() {
    isEnd = true;
  }
  
  public void setLow(TernaryNode n) {
    low = n;
  }

  public void setHigh(TernaryNode n) {
    high = n;
  }
  
  public void setEqual(TernaryNode n) {
    equal = n;
  }
  
  public void print(int level, String state) {
    System.out.println(character+" "+level+" "+state+" "+(isEnd?"*":""));
    if (equal != null) equal.print(level+1, "E");
    if (low != null) low.print(level+1, "L");
    if (high != null) high.print(level+1, "H");
  }
}
