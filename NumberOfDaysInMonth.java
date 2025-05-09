package Program_Pratice;

import java.util.Scanner;

public class NumberOfDaysInMonth {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int month= 0;
	int days = 12;
	System.out.println("Enter a Year :: ");
	int year = sc.nextInt();
	
	if ((month == 2 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
		System.out.println("Number of Days is 29");
	} else if (month == 0)
	{ 
		System.out.println("Number of Days is 28");
	} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
	{
		System.out.println("Number of Days is 31");
	} else 
		System.out.println("NNumber of Days is 30");
}
}
