import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class ReverseQueue1 {
	static Queue<Integer> queue; 

static void reverse(int k) { 
    if (queue.isEmpty() == true || k > queue.size()) 
    	throw new IllegalStateException(); 
    if (k <= 0) 
    	throw new IllegalStateException(); 
 Stack<Integer> stack = new Stack<Integer>();  
    for (int i = 0; i < k; i++) { 
        stack.push(queue.peek()); 
        queue.remove(); 
    } 
  while (!stack.empty()) { 
        queue.add(stack.peek()); 
        stack.pop(); 
    } 
for (int i = 0; i < queue.size() - k; i++) { 
        queue.add(queue.peek()); 
        queue.remove(); 
    } 
} 
static void Print() { 
    while (!queue.isEmpty()) { 
        System.out.print(queue.peek() + " "); 
        queue.remove(); 
    } 
} 

public static void main(String args[]) { 
    queue = new LinkedList<Integer>(); 
    queue.add(10); 
    queue.add(20); 
    queue.add(30); 
    queue.add(40); 
    queue.add(50); 
    queue.add(60); 
    int k = 4; 
    reverse(k); 
    Print(); 
} 
} 
