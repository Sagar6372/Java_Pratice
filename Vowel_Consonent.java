package Program_Pratice;

import java.util.Scanner;

public class Vowel_Consonent {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Single character :");
	String c = sc.next();
	
	String vowel = "aeiouAEIOU";
	if (vowel.contains(c))
		System.out.println(c+ " is a Vowel");
	else 
		System.out.println(c+ " is a Consonent");
		
}
}
