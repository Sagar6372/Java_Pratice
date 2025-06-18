package Array;


public class Print_Even_Odd_From_Array {
	  public static void main(String[] args) {
		int nums[] = {32,54,57,89,60,45,33};
		
		System.out.println("Even Numbers are : ");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2 == 0) 
				System.out.print(nums[i]+" ");
		}

		System.out.println();
		System.out.println("Odd Numbers are : ");
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2 != 0) 
				System.out.print(nums[i]+" ");
		}
	}
	}



















