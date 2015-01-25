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
  }

}
