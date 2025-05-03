package Program_Pratice;

import java.util.Scanner;

// Find Greatest of Two Numbers

public class Find_Greatest_2Numbers
{
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 1st Number : ");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd Number :");
	int num2 = sc.nextInt();
	
	if (num1 > num2) {
		System.out.println("1st Number is Greater");
	} else if(num1 == num2) {
		System.out.println("Both Number Are Equal");
	} else 
		System.out.println("2nd Number Is Greater");
}
}
