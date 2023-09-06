package com.aug21;

import java.util.HashMap;
import java.util.Map;


public class HashMapForCustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Book>hMap= new HashMap<>();
		Book b1= new Book(1,"A","B","C",10);
		Book b2= new Book(12,"P","Q","R",100);
		Book b3= new Book(31,"M","N","O",1000);
		hMap.put(123,b3);
		hMap.put(135, b2);
		hMap.put(121, b3);
		
		for(Map.Entry<Integer,Book>m:hMap.entrySet()) {
			int key= m.getKey();
			Book b = m.getValue();
			System.out.println("key"+key+"details are:");
			System.out.println(b.bookId+" "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
		

	}

}
