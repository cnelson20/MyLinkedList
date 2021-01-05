public class MyLinkedList {
  private int length;
  private MyNode head, tail;

  public MyNode get(int index) {
    MyNode current = head;
    for (int i = 0; i < index; i++) {
      current = current.next();
    }
    return current;
  }
  public String toString() {
    MyNode current = null;
    String ret = "";
    while (current != tail) {
      ret += current.data();
      current = current.next();
    }
    return ret;
  }
}
