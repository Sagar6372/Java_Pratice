package Array;

// Array should not have duplicate
// Array no need to be sorted order
// Values should be in range
public class Find_Missing_Number_In_Array {
   public static void main(String[] args) {
	int arr[] = {1,2,3,4,6,7};
	int sum1 = 0;
	
	for(int i = 0; i<arr.length;i++) {
		sum1 = sum1 + arr[i];
	}
	System.out.println("Sum of an array : "+sum1);
	
	int sum2 = 0;
	for(int i=1; i<=arr.length+1;i++) {
		sum2 = sum2 + i;
	}
	
	System.out.println("Sum of an array with missing number : "+sum2);
	System.out.println("Missing Number is : "+(sum2-sum1));
}
}
