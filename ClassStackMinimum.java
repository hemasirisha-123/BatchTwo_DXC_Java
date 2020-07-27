import java.util.ArrayList;
import java.util.Arrays;

class Stack2{
	private int[] items=new int[5];
	private int count;
	public void push(int item) {
		if(count==items.length)
			throw new StackOverflowError();
		items[count++]=item;
	}
	public int pop() {
		if(isEmpty()) {
			throw new IllegalStateException();
	}
		return items[--count];
	}
	@Override
	public String toString() {
		var content=Arrays.copyOfRange(items,0,count);
		return Arrays.toString(content);
	}
	public int  minimum() {
		int res;
		res=items[0];
		for(int i=0;i<items.length;i++) {
		    if(items[i]<res) 
		    	res=items[i];
		    }
		    System.out.println("The minimum number in array:"+res);
	          return 0;
	}
	public boolean isEmpty() {
		return count==0;
	}
}

public class ClassStackMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack2 stack=new Stack2();
         stack.push(10);
         stack.push(20);
         stack.push(300);
         stack.push(40);
         stack.push(5);
         System.out.println(stack);
          stack.minimum();
        stack.pop();
        stack.pop();
        System.out.println(stack);
	}

}
