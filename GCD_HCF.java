package Program_Pratice;

import java.util.Scanner;

public class GCD_HCF {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number :: ");
	int num1 = sc.nextInt();
	System.out.println("Enter 2nd Number ::");
	int num2 = sc.nextInt();
	int hcf = 0;
	
	for (int i=1; i <= num1 || i <= num2;i++) {
		if (num1 % i == 0 && num2 % i == 0) 
			hcf = i;
	}
	System.out.println("The HCF is :: "+hcf);
}
}
