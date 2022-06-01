// Reverse a doubly linked list

  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    
    if(head==null)
        return null;
    
    if(head.next==null)
        return head;
    
    Node temp=head;
    Node next=temp.next;
    while(next!=null)
        {
          
           temp.next=temp.prev;
        temp.prev=next;
        temp=next;
        next=next.next;
        
    }
    
    temp.next=temp.prev;
    temp.prev=null;
    return temp;

}

