package String_Program;

import java.util.Scanner;


public class Pallindrome_String {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word : ");
	String st = sc.next();
	
	String str = new StringBuffer(st).reverse().toString();
	if(st.equals(str)) {
		System.out.println("It is Pallindrome");
	} else {
		System.out.println("It is not Pallindrome");
	}
	sc.close();
}
}



















