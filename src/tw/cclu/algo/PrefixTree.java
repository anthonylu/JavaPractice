package tw.cclu.algo;

public class PrefixTree {
  private Node root;

  public PrefixTree(char rootChar) {
    root = new Node(rootChar);
  }
  
  public void addWord(String word) {
    if (word == null || word.isEmpty()) return;
    char[] chars = word.toCharArray();
    addWord(0, chars);
  }
  
  public void addWord(int offset, char[] chars) {
    Node current = root, child;
    for (int i = offset; i < chars.length; ++i) {
      child = current.getChild(chars[i]);
      if (child == null) {
        child = new Node(chars[i]);
        current.addChild(child);
      }
      current = child;
    }
  }
  
  public String enumerate(String prefix) {
    char[] chars = prefix.toCharArray();
    Node current = root, temp;
    int i = 0;
    for (; i < chars.length; ++i) {
      if ((temp = current.getChild(chars[i])) != null) {
        current = temp;
      } else {
        break;
      }
    }
    
    StringBuilder sb = new StringBuilder();
    if (current != root) {
      sb.append(prefix.subSequence(0, i-1));
      current.enumerate(sb);
    }
    return sb.toString();
  }

  public void printTree() {
    root.print(0);
  }
  
  public static void main(String[] args) {
    PrefixTree pt = new PrefixTree('-');
    pt.addWord("is");
    pt.addWord("as");
    pt.addWord("am");
    pt.addWord("are");
    pt.printTree();
    System.out.println("words with prefix b:\t" + pt.enumerate("b"));
    System.out.println("words with prefix a:\t" + pt.enumerate("a"));
    System.out.println("words with prefix ar:\t" + pt.enumerate("ar"));
    System.out.println("words with prefix ae:\t" + pt.enumerate("ae"));
  }
}
