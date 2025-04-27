package Program_Pratice;

import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Binary Number :: ");
	String binary = sc.nextLine();
	
	System.out.println("In Binary : "+binary);
	
	int decimal = Integer.parseInt(binary,2);
	
	System.out.println("In Decimal : "+decimal);
}
}
