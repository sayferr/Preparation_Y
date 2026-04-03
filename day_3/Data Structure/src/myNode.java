// №3.1
public class myNode {
    int data;
    myNode next;

    myNode(int d){
        data = d;
        next = null;
    }
}

class myLinkedList{
     myNode head;

      public void add(int data){
          myNode newNode = new myNode(data);
          if(head == null){
              head = newNode;
              return;
          }
          myNode current = head;
          while(current != null){
              current = current.next;
          }
          current.next = newNode;
      }
}