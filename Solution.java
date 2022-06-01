import java.util.*;

// You are given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. 
// Delete nodes and return a sorted list with each distinct value in the original list.

class Solution {
    static Node head; // head of list
 
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* function to insert a
new_node in a list. */
    void sortedInsert(Node new_node)
    {
        Node current;
 
        /* Special case for head node */
        if (head == null || head.data
>= new_node.data) {
            new_node.next = head;
            head = new_node;
        }
        else {
 
            /* Locate the node before point of insertion. */
            current = head;
 
            while (current.next != null
&& current.next.data < new_node.data)
                current = current.next;
 
            new_node.next = current.next;
            current.next = new_node;
        }
    }
 
    /*Utility functions*/
 
    /* Function to create a node */
    Node newNode(int data)
    {
        Node x = new Node(data);
        return x;
    }
 
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    if(head==null)
        return null;
    
    Node temp=head.next;
    Node prev=head;
    while(temp!=null)
        {
        
         if(prev.data==temp.data)
             {
             prev.next=temp.next;
             temp.next=null;
             temp=prev.next;
         }
        else
            {
              prev=temp;
              temp=temp.next;
        
        }
    }
    return head;
}
 
    /* Driver function to test above methods */
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        Node new_node;
        int tc = sc.nextInt();
        for(int i =0; i < tc; i++){
        Solution llisti = new Solution();
            int nni = sc.nextInt();
            for(int j=0; j < nni; j++){
                
                new_node = llisti.newNode(sc.nextInt());
                llisti.sortedInsert(new_node);
            }
        llisti.RemoveDuplicates(llisti.head);
        llisti.printList();
        System.out.println();
        }
        
    }
}