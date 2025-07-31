package String_Program;

import java.util.Scanner;


public class Find_String_Length {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Word : ");
	String str = sc.next();
	
	// With length()
	// System.out.println("Length of String : "+str.length());
	
	// Without length() 
	char[] ch = str.toCharArray();
	System.out.println("Length of String : "+ch.length);
}
}






















