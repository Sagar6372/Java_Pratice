package Program_Pratice;

import java.util.Scanner;

// Java Program to Check Whether a Number is Even or Odd

//public class PB2 
//{
//  public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a Number : ");
//	int a = sc.nextInt();
//	if (a % 2 == 0) 
//		System.out.println("Number is Even");
//	else 
//		System.out.println("Number is Odd");
//}
//}

public class Even_Odd 
{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number : ");
	int a = sc.nextInt();
	String status = a % 2 == 0 ? "Even" : "Odd";
	System.out.println(a+ " is "+ status);
}
}
