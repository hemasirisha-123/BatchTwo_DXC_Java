import java.util.Scanner;

class BubbleSort{
	public void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                   //swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	 public void print(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
}

public class BubbleSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		 BubbleSort ob = new BubbleSort();
	        ob.bubbleSort(arr);
	        System.out.println("Sorted array:");
	        ob.print(arr);
	    }
	}


