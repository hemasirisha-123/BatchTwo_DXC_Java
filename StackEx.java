import java.util.ArrayList;
import java.util.Arrays;

class Stack1{
	int arr[];
	int top1,top2;
	int count;
	public Stack1(int n) {
		 arr=new int[n];
		count=n;
		top1=-1;
		top2=count;
		}
	public  void push1(int x) 
	    { 
	        if (top1 < top2 - 1) { 
	            top1++; 
	            arr[top1] = x; 
	        } 
	        else
	        	throw new StackOverflowError();
	    }
	public  void push2(int x) 
    { 
        if (top1 < top2 - 1) { 
            top2--; 
            arr[top2] = x; 
        } 
        else
        	throw new StackOverflowError();
    }
	public int pop1() 
    { 
        if (top1 >= 0) { 
            int x = arr[top1]; 
            top1--; 
            return x; 
        } 
        else {
        	throw new IllegalStateException();
        } 
    } 
	public int pop2() 
    { 
        if (top2 < count) { 
            int x = arr[top2]; 
            top2++; 
            return x; 
        } 
        else { 
        	throw new IllegalStateException();
        } 
    }
	public boolean isEmpty1() {
		return count==0;
	}
	public boolean isEmpty2() {
		return count==0;
	}
}


	

public class StackEx {
   public static void main(String[] args) {
	   Stack1 stack1=new Stack1(5);
	   stack1.push1(5); 
	   stack1.push2(10); 
	   stack1.push2(15); 
	   stack1.push1(11); 
	   stack1.push2(7); 
       System.out.println("Popped element from"
                          + " stack1 is " + stack1.pop1()); 
       stack1.push2(40); 
       System.out.println("Popped element from"
                          + " stack2 is " + stack1.pop2());
       System.out.println("the stack1 is empty:"+stack1.isEmpty1());
       System.out.println("the stack1 is empty:"+stack1.isEmpty2());
   } 
} 

