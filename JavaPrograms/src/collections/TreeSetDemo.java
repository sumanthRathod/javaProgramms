package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(2);
		set.add(7);
		System.out.println(set);
		
		
		ArrayList<Object> list = new ArrayList<>();
		list.add("Hi");
		list.add("Hello");
		list.add("Bye");
		list.add(0);
		
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(list.remove(3));
		System.out.println(list.set(3,"HiHello"));
		System.out.println(set.descendingSet());
		System.out.println();
		
		
		Iterator<Object> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
