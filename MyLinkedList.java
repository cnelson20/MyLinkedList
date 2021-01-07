public class MyLinkedList {
  private int length;
  private MyNode head, tail;

  public MyLinkedList() {
    length = 0;
    head = null;
    tail = head;
  }

  public boolean add(String value) {
    MyNode v = new MyNode(value,tail,null);
    if (length == 0) {
      head = v;
      tail = head;
    } else {
      tail.setNext(v);
      tail = v;
    }
    length++;
    return true;
  }
  public boolean add(int index, String value) {
    if (length == 0) {
      return add(value);
    }
    if (index == 0) {
      head = new MyNode(value,null,head);
    } else {
      MyNode pr = getNode(index - 1);
      MyNode nxt = pr.getNext();
      MyNode newNode = new MyNode(value,pr,nxt);
      pr.setNext(newNode);
      if (nxt != null) {
        nxt.setPrev(newNode);
      }
    }

    length++;
    return true;
  }
  public String toString() {
    MyNode current = head;
    String ret = "[";
    while (current != null) {
      if (current != head) {ret += ", ";}
      ret += current.getValue();
      current = current.getNext();
    }
    return ret + "]";
  }
  public int size() {
    return length;
  }
  public String set(int index, String str) {
    MyNode current = head;
    for (int i = 0; i < index; i++) {
      current = head.getNext();
    }
    String temp = current.getValue();
    current.setValue(str);
    return temp;
  }
  public MyNode getNode(int index) {
    MyNode current = head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    return current;
  }
  public String get(int index) {
    if (index < 0 || index >= length) {
      throw new IndexOutOfBoundsException();
    }
    return getNode(index).getValue();
  }

}
