package Program_Pratice;

import java.util.Scanner;

// Find the Greatest Number Among Three Numbers in Java

public class Greates_Three_Numbers 
{
 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 1st Number : ");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd Number :");
	int num2 = sc.nextInt();
	System.out.println("Enter 3rd Number :");
	int num3 = sc.nextInt();
	
	if (num1 > num2 && num1 > num3) {
		System.out.println("1st Number IS Greater");
	} else if(num2 > num1 && num2 > num3) {
		System.out.println("2nd Number Is Greater");
	} else 
		System.out.println("3rd Number Is Greater");
}
}
