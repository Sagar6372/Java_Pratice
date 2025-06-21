package Array;

public class Reverse_Of_Array {
  public static void main(String[] args) {
	int arr[] = {20,10,34,23,54,32};
	int n = arr.length;
	
	for(int i=n-1;i>=0;i--) {
	 System.out.print(arr[i]+" ");	
	}
}
}


/*
public class Reverse_Of_Array {
	  public static void main(String[] args) {
		  int arr[] = {23,34,54,56,43,21,78};
		  int start = 0;
		  int end = arr.length-1;
		  
		  while(start < end) {
			 int temp = arr[start];
			  arr[start] = arr[end];
			  arr[end] = temp;
			  
			  start++;
			  end--;
		  }
		  
		  for(int num : arr) {
			  System.out.print(num+" ");
		  }
	}
	}
	*/

/*
public class Reverse_Of_Array
{
	public static void main(String[] args) {
		int arr[] = {23, 21, 43, 25, 76, 21, 54, 43};
		
		for(int i = arr.length-1; i>0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
*/






























