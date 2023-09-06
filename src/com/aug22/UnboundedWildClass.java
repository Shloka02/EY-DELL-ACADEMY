package com.aug22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class UnboundedWildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    UnboundedWildClass obj= new UnboundedWildClass();
		List<String>listStr= new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printCollectionData(listStr);
		
		List<Integer>listInt= new ArrayList<>();
		listInt.add(123);
		listInt.add(456);
		obj.printCollectionData(listInt);

	}
	void printCollectionData(Collection<?>objToPrint) {
		System.out.println("{");
		for(Object obj : objToPrint) {
			System.out.println(obj.getClass().getClass().getCanonicalName()+":"+ obj);
		}
		System.out.println("}");
		System.out.println();
	}

}
