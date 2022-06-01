// A Linked List Node
import java.util.*;




 
class LinkedList
{
    class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

    Node head;
    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        
 
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    // Takes two lists sorted in increasing order and merge their nodes
    // to make one big sorted list, which is returned
    public static Node sortedMerge(Node a, Node b)
    {
        // base cases
        if (a == null) {
            return b;
        }
        else if (b == null) {
            return a;
        }
 
        Node result;
 
        // pick either `a` or `b`, and recur
        if (a.data <= b.data)
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
 
        return result;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        int tc = sc.nextInt();
        for(int i= 0 ; i< tc; i++){
            for (int j = 0; j < sc.nextInt(); j++){
                list1.push(sc.nextInt());
            }
            for (int k = 0; k < sc.nextInt(); k++){
                list2.push(sc.nextInt());
            }

            Node head = sortedMerge(list1.head, list2.head);
            printList(head);

        } 
        
    }
}