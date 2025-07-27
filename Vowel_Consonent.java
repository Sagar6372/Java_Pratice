package String_Program;

import java.util.Scanner;

public class Vowel_Consonent {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	/*
	System.out.println("Enetr a Word : ");
	String st = sc.next();
	int vowel = 0;
	int consonent = 0;
	char[] str = st.toLowerCase().toCharArray();
	
	for(char ch : str) {
		if(Character.isLetter(ch)) {
			if(ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u') {
				vowel ++;
			} else {
				consonent++;
			}
		}
	}
	System.out.println("Number of Vowel is : "+vowel);
	System.out.println("Number of Consonent is : "+consonent);
	*/
	
	System.out.println("Enter a Character :");
	char ch = sc.next().toLowerCase().charAt(0);
	
	if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch == 'u') {
		System.out.println(ch +" is Vowel");
	} else {
		System.out.println(ch+" is Consonent");
	}
}
}
