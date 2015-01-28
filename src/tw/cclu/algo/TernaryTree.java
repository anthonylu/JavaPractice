package tw.cclu.algo;

public class TernaryTree {
  private TernaryNode root;

  public TernaryTree() {
  }
  
  public void addWord(String word) {
    if (word == null || word.isEmpty()) return;
    char[] chars = word.toCharArray();
    addWord(0, chars);
  }
  
  public void addWord(int offset, char[] chars) {
    if (root == null) {
      root = new TernaryNode(chars[offset]);
    }
    TernaryNode current = root, next = root;
    for (int i = offset; i < chars.length; ) {
      //System.out.println(chars[i]);
      int state;
      if (chars[i] == current.getChar()) {
        next = current.getEqual();
        ++i;
        state = 0;
      } else if (chars[i] > current.getChar()) {
        next = current.getHigh();
        state = 1;
      } else {
        next = current.getLow();
        state = 2;
      }
      if (next == null) {
        for (; i < chars.length; ++i) {
          next = new TernaryNode(chars[i]);
          switch(state) {
            case 0:
              current.setEqual(next);
              break;
            case 1:
              current.setHigh(next);
              current = current.getHigh();
              state = 0;
              break;
            case 2:
              current.setLow(next);
              current = current.getLow();
              state = 0;
              break;
          }
          current = next;
        }
      } else {
        current = next;
      }
    }
    current.setEnd();
    //System.out.println("*");
  }
  
  public String enumerate(String prefix) {
    StringBuilder sb = new StringBuilder();
    char[] chars = prefix.toCharArray();
    TernaryNode current = root, temp;
    boolean isEqual = false, includePrefix = false;
    int i = 0;
    for (; i < chars.length;) {
      if (current.getChar() == chars[i]) {
        temp = current.getEqual();
        isEqual = true;
        ++i;
      } else if (current.getChar() < chars[i]) {
        temp = current.getHigh();
        isEqual = false;
      } else {
        temp = current.getLow();
        isEqual = false;
      }
      if (temp == null) {
        break;
      } else {
        if (isEqual) {
          sb.append(chars[i-1]);
          if (current.isEnd() && i == chars.length) includePrefix = true;
        }
        current = temp;
      }
    }
    if (i != 0) {
      prefix = sb.toString();
      sb = new StringBuilder();
      current.enumerate(sb, prefix);
      if (includePrefix) {
        sb.insert(0, ",");
        sb.insert(0, prefix);
      }
    }
    return sb.toString();
  }
  
  public void print() {
    root.print(0, "E");
  }
  
  public static void main(String[] args) {
    TernaryTree tt = new TernaryTree();
    tt.addWord("i");
    tt.addWord("is");
    tt.addWord("as");
    tt.addWord("are");
    tt.addWord("am");
    tt.print();
    System.out.println("prefix b:\t"+tt.enumerate("b"));
    System.out.println("prefix i:\t"+tt.enumerate("i"));
    System.out.println("prefix a:\t"+tt.enumerate("a"));
    System.out.println("prefix ar:\t"+tt.enumerate("ar"));
    System.out.println("prefix ae:\t"+tt.enumerate("ae"));
    System.out.println("prefix am:\t"+tt.enumerate("am"));
  }

}
