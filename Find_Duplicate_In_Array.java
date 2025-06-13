package Array;

/*
public class Find_Duplicate_In_Array {
  public static void main(String[] args) {
	String arr[] = {"Java","Sagar","C++","Java",".NET","C++"};
	
	for(int i = 0; i<arr.length;i++) {
		for(int j = i+1; j<arr.length;j++) {
			if(arr[i].equals(arr[j])) {
				System.out.println("Duplicate Is :"+arr[i]);
			}
		}
	}
}
}
*/



public class Find_Duplicate_In_Array {
	  public static void main(String[] args) {
		String arr[] = {"Java","Sagar","C++","Java",".NET","C++"};
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println("Duplicate is : "+arr[i]);
				}
			}
		}
	}
	}




















