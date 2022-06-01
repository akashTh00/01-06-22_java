// A linked list is said to contain a cycle if any node is visited more than once whil

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    
    if(head==null)
        return 0;
    
    if(head.next==head)
        return 1;
    
    Node slow=head;
    Node fast=head;
    
    while(fast!=null)
        {
        
         fast=fast.next;
         if(fast!=null)
             fast=fast.next;
         else
             return 0;
        
         slow=slow.next;
        
        if(slow==fast)
            return 1;
        
    }
    return 0;
    
    
    
}