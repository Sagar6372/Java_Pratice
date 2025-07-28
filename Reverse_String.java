package String_Program;

import java.util.Scanner;

public class Reverse_String {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Word : ");
	String str = sc.nextLine();
	// String Rev = "";
	
	// 1. Using StringBuffer
	 String reverse = new StringBuffer(str).reverse().toString();
	 System.out.println("Reverse of "+str+" is : "+reverse);
	
	// 2. Using StringBuilder
	// String rev = new StringBuilder(str).reverse().toString();
	// System.out.println("Reverse of "+str+" is : "+rev);
	 
	// 3. Using String concatenation
//	 int st = str.length();
//	 for(int i = st-1; i>=0; i--) {
//		 Rev = Rev + str.charAt(i);
//	 }
//	 System.out.println("Reverse is : "+Rev);
}
}
