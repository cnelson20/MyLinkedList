public class MyLinkedList {
  private int length;
  private MyNode head, tail;

  public boolean add(String value) {
    MyNode v = new MyNode(value,tail,null);
    tail.setNext(v);
    return true;
  }
  public boolean add(int index, String value) {
    MyNode pr = get(index);
    MyNode nxt = pr.getNext();
    MyNode newNode = new MyNode(value,pr,nxt);
    pr.setNext(newNode);
    nxt.setPrev(newNode);

    return true;
  }
  public String toString() {
    MyNode current = head;
    String ret = "";
    while (current != null) {
      ret += current.getValue();
      current = current.getNext();
    }
    return ret;
  }
  public MyNode get(int index) {
    MyNode current = head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    return current;
  }
}
