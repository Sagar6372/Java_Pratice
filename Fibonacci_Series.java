package Program_Pratice;

import java.util.Scanner;

public class Fibonacci_Series {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number ::");
	int num = sc.nextInt();
	int a = 0; int b = 1;
	int nextTerm ;
	
	for (int i= 2; i < num ; i++) {
		nextTerm = a + b;
		a = b;
		b = nextTerm;
		System.out.println(nextTerm+",");
	}
}
}
