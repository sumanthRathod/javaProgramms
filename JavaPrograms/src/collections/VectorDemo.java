package collections;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		{
			Vector<Object> vect = new Vector<>();
			vect.add(10);
			vect.add(20);
			vect.add(30);
			vect.add("hi");
			vect.add(null);
			vect.add(null);
			
			System.out.println(vect);
			vect.add(2, "Hello");   //in index 2
			System.out.println(vect);
			System.out.println(vect.firstElement());
			System.out.println(vect.lastElement());
			System.out.println(vect.indexOf(20));
			System.out.println(vect.capacity());
			
		}
	}

}
