// compare two sll and return 1 if identical and return 0 if non-identical

import java.io.*;
import java.util.*;

public class Solution {
{
    Node head; 
 
    
    class Node
    {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }
 
   
    boolean areIdentical(Solution list2)
    {
        Node a = this.head, b = list2.head;
        while (a != null && b != null)
        {
            if (a.data != b.data)
                return false;
 
           
            a = a.next;
            b = b.next;
        }
 
        return (a == null && b == null);
    }
 
    
 
    void push(int new_data)
    {
 
        Node new_node = new Node(new_data);
 

        new_node.next = head;
 

        head = new_node;
    }
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int tc = sc.nextInt();
       for(int i = 0; i< tc; i++){
           Solution list1 = new Solution();
           Solution list2 = new Solution();
           int nn1 = sc.nextInt();
           for(int j=0; j<nn1; j++){
               list1.push(sc.nextInt());
           }
           int nn2 = sc.nextInt();
           for(int k=0; k<nn2; k++){
               list2.push(sc.nextInt());
           }
           
           if (list1.areIdentical(list2) == true)
            { System.out.println("1"); }
            else
            {  System.out.println("0"); }
           
       }
    }
}
