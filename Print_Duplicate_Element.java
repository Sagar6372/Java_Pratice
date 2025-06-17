package Array;


public class Print_Duplicate_Element {
  public static void main(String[] args) {
	int arr[] = {23,54,98,54,65,32,23,65,21,10};
	
	for(int i = 0;i<arr.length;i++) {
		for(int j = i+1; j<arr.length;j++) {
			if(arr[i] == arr[j]) {
				System.out.print(arr[i]+" ");
				break;
			}
		}
	}
}
}





/*
public class Print_Duplicate_Element
{
	public static void main(String[] args) 
	{
		int arr[] = {23, 21, 43, 25, 76, 21, 54, 43};
	  
	  for(int i=0; i<arr.length; i++) {
		  for(int j=i+1; j<arr.length;j++) {
			  if(arr[i] == arr[j]) {
				  System.out.println("Duplicate Number :"+arr[i]);
				  break;
			  }
		  }
	  }
	}
}
*/





















