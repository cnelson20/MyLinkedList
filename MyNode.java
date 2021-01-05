public class MyNode {
  private int data;
  private MyNode prev,next;

  public MyNode(int data, MyNode prev, MyNode next) {
    this.data = data;
    this.next = next;
  }
  public MyNode(int data, MyNode prev, MyNode next) {
    this.data = data;
    this.prev = prev;
    this.next = next;
  }
  public int data(){
    return this.data;
  }
  public MyNode prev(){
    return this.prev;
  }
  public MyNode next(){
    return this.next;
  }
}
