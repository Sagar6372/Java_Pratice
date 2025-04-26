package Program_Pratice;

import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Radious :: ");
	double radious = sc.nextDouble();
	double pi = 3.14;
	
	double area = (pi * radious * radious);
	System.out.println("Area of Circle : "+ area);
}
}
