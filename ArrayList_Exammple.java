package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import OOPS.A;

public class ArrayList_Exammple 
{
  public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(40);
	al.add("A");
	al.add(null);
	al.add(20);
	al.add("B");
	al.add(10);
	al.remove(2);
	al.add(3,"K");
	al.add(90);
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.get(3));
	System.out.println(al.contains(al));
	System.out.println(al.remove(4));
	System.out.println(al.set(0, 120));
	System.out.println(al);
	
	Iterator<Integer> i = al.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	}
	  
	System.out.println("Forward Direction");
	ListIterator<Integer> li = al.listIterator();
	while(li.hasNext()) {
		System.out.print(li.next()+" ");
	}
	
	System.out.println("Backward Direction");
	while(li.hasPrevious()) {
		System.out.print(li.previous()+" ");
	}
}
}
