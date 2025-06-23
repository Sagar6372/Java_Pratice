package Array;

import java.util.Arrays; 
public class Second_Smallest_And_Highest_Element_In_Array 
{
	public static void main(String[] args) {
		int arr[] = {23, 21, 43, 25, 76, 22, 54,78,90,60};
		Arrays.sort(arr);
		
		System.out.println("1st Smallest Number : "+arr[0]);
		System.out.println("2nd Smallest Number : "+arr[1]);
		
		System.out.println("1st Highest Number : "+arr[arr.length-1]);
		System.out.println("2nd Highest Number : "+arr[arr.length-2]);
	}
}























