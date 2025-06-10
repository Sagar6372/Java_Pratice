package Array;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Distinct_Array {
  public static void main(String[] args) {
	int arr[] = {23,34,95,23,56,67,23,45};
	 
	
	// Logic for Remove Duplicate and Sorting Order
	TreeSet<Integer> ts = new TreeSet<Integer>();
	for(Object obj : arr) {
		ts.add((Integer)obj);
	}
	System.out.println(ts);
	
	// Logic for Remove Duplicate and Insertion Order
	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	for(Object obj : arr) {
		lhs.add((Integer)obj);
	}
	System.out.println(lhs);
}
}


/*

public class Distinct_Array {
	public static void main(String[] args) {
		int arr[] = {22,43,12,43,56,65,43,2,12,33};
		
		// Distinct with insertion Order
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for(Object obj : arr) {
			lhs.add((Integer)obj);
		}
		// System.out.println("Distinct Nummbers are : "+lhs);
		
		// Distinct with SSorting Order
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(Object obj : arr) {
			ts.add((Integer)obj);
		}
		System.out.println("Numbers are : "+ts);
	}
}

*/

























