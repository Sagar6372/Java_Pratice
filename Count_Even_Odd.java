package Array;

public class Count_Even_Odd {
  public static void main(String[] args) {
	int arr[] = {23,13,45,32,54,33,22};
	
	int countEven = 0, countOdd = 0;
	for(int i=0; i<arr.length;i++) {
		if(arr[i]%2 == 0) {
			countEven++;
		} else {
			countOdd++;
		}
	}
	System.out.println("Even Number is : "+countEven);
	System.out.println("Odd Number is : "+countOdd);
 }
}




/*
public class Count_Even_Odd {
	  public static void main(String[] args) {
		int arr[] = {23,13,45,32,54,33,20,34,43,22};
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even Numbers are : "+even);
		System.out.println("Odd Numbers are : "+odd);
	 }
	}
*/






















