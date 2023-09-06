package com.aug21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;


public class HashSetForBookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book>hSet = new HashSet<>();
		Book b1= new Book(1,"A","B","C",10);
		Book b2= new Book(12,"P","Q","R",100);
		Book b3= new Book(13,"M","N","O",1000);
		
		hSet.add(b1);hSet.add(b1);hSet.add(b1);
		hSet.add(b3);hSet.add(b2);hSet.add(b2);
		
		for(Book b: hSet) {
			System.out.println(b.bookId+ " "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
		Iterator<Book> Itr= hSet.iterator();
		while(Itr.hasNext()) {
			System.out.println(Itr.next()+ " ");
		}
		//System.out.println();
		//while( Itr.hasPrevious()) {
			//System.out.println(Itr.previous()+ " ");
		
		}
		

	


	

}
