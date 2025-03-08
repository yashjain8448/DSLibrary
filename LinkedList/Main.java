@SuppressWarnings("all")
class Node<T> {
    T data;
    Node next;
    Node(T d) {
      this.data = d ;
      this.next = null;
    }
  }

@SuppressWarnings("all")
class LinkedList<T> {
    Node<T> head ;
  
    public void addAtTail(T d){
        if(head == null){
        this.head = new Node<T>(d);
        }
        else {
            Node<T> temp = new Node<T>(d);
            Node<T> last = this.head;
            while(last.next != null){
            last = last.next;
            }
            last.next = temp;
        }
    }

    public void addAtHead(T d){
        Node<T> temp = new Node<T>(d);
        if (head == null){
          this.head = temp;
        }
        else {
          temp.next = this.head;
          temp.next.next = this.head.next;
          this.head = temp;
        }
    }
  
    public void display(){
      if(this.head == null){
      throw new java.lang.Error("Empty List");
      }
      else {
        Node<T> print = this.head;
        while(print != null){
        System.out.println(print.data);
        print = print.next;
        }
      }
      System.out.println("\n");
    }
  
    public void removeAtTail(){
      Node<T> demilast = this.head;
      if(this.head == null){
        throw new java.lang.Error("Empty List");
      }
      else {
        while(demilast.next.next != null){
          demilast = demilast.next;
        }
        demilast.next = null;
      }
    }
  
    public void removeAtPos(int i){
      try {
        if (i == 0){
          this.head = head.next;
        }
        else {
          int c = 1;
          Node count = this.head;
          while (count != null){
            if (c == i){
              count.next = count.next.next;
              break;
            }
            count = count.next;
            c++;
          }
        }
      }
      catch(Exception  e){
        throw new java.lang.Error("Wrong Index");
      }
    }
  
    public void removeAtHead(){
        removeAtPos(0);
    }

    public void clear(){
      this.head = null;
    }
}

class Main{
    public static void main(String[] args) {
        // Example: linked list of integer
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addAtHead(10);
        numbers.addAtHead(20);
        numbers.addAtHead(30);
        numbers.addAtHead(40);
        
        // numbers.removeAtHead();
        // numbers.removeAtTail();
        numbers.removeAtPos(2);
        numbers.display();


        // Example: linked list of string
        LinkedList<String> names = new LinkedList<>();
        names.addAtTail("Yash");
        names.addAtTail("Vatsal");
        names.addAtTail("Tanmay");
        names.addAtTail("Yug");

        names.display();
    }
}