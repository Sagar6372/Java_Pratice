package Program_Pratice;

import java.util.Scanner;

public class Number_OF_Vowels {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Word ::");
	String st = sc.nextLine();
	String str = st.toUpperCase();
	char [] c = str.toCharArray();
	int vowel = 0;
	
	for(int i = 0; i< str.length(); i++)
		if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
		{
			vowel++;
		}
	System.out.println("Number of Vowels are :: "+vowel);
}
}
