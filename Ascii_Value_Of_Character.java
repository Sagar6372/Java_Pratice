package Program_Pratice;

import java.util.Scanner;

public class Ascii_Value_Of_Character {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Character :");
	char c = sc.next().charAt(0);
	
	int num = c;
	System.out.println("ASCII Value of "+c+" is :"+num);
}
}
