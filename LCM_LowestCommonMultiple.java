package Program_Pratice;

import java.util.Scanner;

public class LCM_LowestCommonMultiple {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number ::");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd Number ::");
	int num2 = sc.nextInt();
	int hcf = 1;
	
	for(int i = 1; i<=num1 || i<=num2; i++) {
		if(num1 % i == 0 && num2 % i == 0)
			hcf = i;
	}
	// LCM Formula
	int lcm = (num1 * num2)/hcf;
	System.out.println("The LCM is ::"+lcm);
}
} 
