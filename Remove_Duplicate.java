package String_Program;

import java.util.Scanner;

public class Remove_Duplicate {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Word : ");
	String st = sc.nextLine();
    String result = "";
    
    for(int i=0; i< st.length(); i++) {
    	char ch = st.charAt(i);
    	
    	if(!result.contains(String.valueOf(ch))) {
    		result = result +ch;
    	}
    }
    System.out.println("After Removing Duplicates : "+result);
}
}
