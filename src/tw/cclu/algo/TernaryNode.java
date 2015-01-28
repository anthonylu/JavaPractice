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
  
  public void enumerate(StringBuilder sb, String prefix) {
    if (low != null) low.enumerate(sb, prefix);
    if (high != null) high.enumerate(sb, prefix);
    if (equal != null) {
      prefix = prefix + character;
      if (isEnd) {
        sb.append(prefix);
        sb.append(',');
      }
      equal.enumerate(sb, prefix);
    } else {
      sb.append(prefix);
      sb.append(character);
      sb.append(',');
    }
  }
  
  public void print(int level, String state) {
    System.out.println(character+" "+level+" "+state+" "+(isEnd?"*":""));
    if (equal != null) equal.print(level+1, "E");
    if (low != null) low.print(level+1, "L");
    if (high != null) high.print(level+1, "H");
  }
}
