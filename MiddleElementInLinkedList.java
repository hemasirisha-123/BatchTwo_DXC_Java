import com.LinkedList.Loop.Node;

class MiddleElementInLinkedList  
{ 
    static class Node 
    { 
  
        int data; 
        Node next; 
    } 
    static void printMiddle(Node head) 
    { 
        Node a = head; 
        Node b = head; 
  
        if (head != null)  
        { 
            while (b != null && b.next != null)  
            { 
  
                b = b.next.next;  
             
                a= a.next; 
            }  
            if (b != null) 
            { 
                System.out.print(a.data-1); 
            } 
            else 
            { 
            	System.out.println((a.data-1) + "," + (a.next.data-1));
               
            } 
        } 
    } 
    static Node push(Node head_ref, int new_data) 
    { 
        Node node = new Node();  
        node.data = new_data; 
  
        node.next = head_ref;  
        head_ref =node; 
        return head_ref; 
    } 
    
    public static void main(String[] args)  
    { 
        
        Node head = null; 
        head = push(head, 6); 
        head = push(head, 5); 
        head = push(head, 4); 
        head = push(head, 3); 
        head = push(head, 2); 
        head = push(head, 1); 
        printMiddle(head); 
    } 
} 
 