package Program_Pratice;

import java.util.Scanner;

// Program to Check Leap Year or not
/*
public class PB8 
{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Year : ");
	int year = sc.nextInt();
	
	if (year % 400 == 0 ) {
	    System.out.println(year + " It is a Leap Year");
	}else if (year % 4 == 0 && year % 100 != 0) {
		System.out.println(year +" It is a Leap Year");
	} else
		System.out.println(year + " It is not a Leap Year");
}
}
*/

public class Leap_Year 
{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Year : ");
	int year = sc.nextInt();
	
	if (year % 400== 0 || year % 4 == 0 && year % 100 != 0) {
		System.out.println(year + " It is a Leap Year");
	} else 
		System.out.println(year + " It is not a Leap Year");
}
}