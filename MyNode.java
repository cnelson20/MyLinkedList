public class MyNode {
  private String data;
  private MyNode prev,next;

  public MyNode(String data, MyNode next) {
    this.data = data;
    this.next = next;
  }
  public MyNode(String value) {
    data = value;
    this.next = null;
    this.prev = null;
  }
  public MyNode(String data, MyNode prev, MyNode next) {
    this.data = data;
    this.prev = prev;
    this.next = next;
  }
  public String getValue(){
    return this.data;
  }
  public boolean setValue(String value){
    this.data = value;
    return true;
  }
  public MyNode getPrev(){
    return this.prev;
  }
  public MyNode getNext(){
    return this.next;
  }
  public boolean setNext(MyNode value) {
    this.next = value;
    return true;
  }
  public boolean setPrev(MyNode value) {
    this.prev = value;
    return true;
  }
}
