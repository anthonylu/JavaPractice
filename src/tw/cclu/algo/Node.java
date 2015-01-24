package tw.cclu.algo;

import java.util.HashMap;

public class Node {
  private Character character;
  private HashMap<Character, Node> children;

  public Node(char ch) {
    this.character = new Character(ch);
    children = new HashMap<Character, Node>();
  }
  
  public Character getChar() {
    return character;
  }
  
  public Node getChild(Character ch) {
    return children.get(ch);
  }
  
  public void addChild(Node child) {
    Node prev = children.put(child.character, child);
    if (prev != null) {
      child.children = prev.children;
    }
  }
  
  public void print(int level) {
    System.out.println(character+" "+level);
    for (Node n:children.values())
      n.print(level+1);
  }
}
