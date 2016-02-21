package co.edu.java.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Generics {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
		List myIntList = new LinkedList(); // 1
		myIntList.add(new Integer(0)); // 2
		Integer x = (Integer) myIntList.iterator().next(); // 3
		
		List<Integer> myIntListGenreic = new LinkedList<Integer>(); // 1'
		myIntListGenreic.add(new Integer(0)); // 2'
		Integer xGeneric = myIntListGenreic.iterator().next(); // 3'
		
		List<String> ls = new ArrayList<String>(); // 1
		//List<Object> lo = ls; // 2 FAIL 
		
		Collection<?> c = new ArrayList<String>();
		//c.add(new Object()); // Compile time error
		//c.add(new String());
		
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<Object>();

		// T inferred to be Object
		fromArrayToCollection(oa, co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<String>();

		// T inferred to be String
		fromArrayToCollection(sa, cs);
		
		// T inferred to be Object
		fromArrayToCollection(sa, co);		
	
	}
	
	// Without generics
	@SuppressWarnings("rawtypes")
	void printCollection(Collection c) {
	    Iterator i = c.iterator();
	    for (int k = 0; k < c.size(); k++) {
	        System.out.println(i.next());
	    }
	}
	
	// With generics
	void printCollectionGenerics(Collection<Object> c) {
	    for (Object e : c) {
	        System.out.println(e);
	    }
	}
	
	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	    for (T o : a) {
	        c.add(o); // Correct
	    }
	}
	
	static void fromArrayToCollection(String[] a, Collection<String> c) {
	    for (String o : a) {
	        c.add(o); // Correct
	    }
	}

}
