package Array;

import java.util.Arrays;


public class Merge_Two_Array 
{
  public static void main(String[] args) 
  {
	int arr1[] = {23,45,43,12,55};
	int arr2[] = {32,43,21,47,20};
	
	int merge[] = new int[arr1.length + arr2.length];
	
	System.arraycopy(arr1, 0, merge, 0, arr1.length);
	System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);
	
	System.out.println("Merge Array : "+Arrays.toString(merge));
 }
}




/*
public class Merge_Two_Array{
	public static void main(String[] args) {
		int arr1[] = {23,45,32};
		int arr2[] = {64,34,21};
		
		int merge[] = new int[arr1.length + arr2.length];
		
		System.arraycopy(arr1, 0, merge, 0, arr1.length);
		System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);
		
		System.out.println("Merge Array is :"+Arrays.toString(merge));
	}
}
*/




















