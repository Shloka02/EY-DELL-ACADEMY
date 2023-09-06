package com.aug21;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListForBookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book>list = new LinkedList<>();
		Book b1= new Book(1,"A","B","C",10);
		Book b2= new Book(12,"P","Q","R",100);
		Book b3= new Book(13,"M","N","O",1000);
		list.add(b1);list.add(b1);list.add(b1);
		list.add(b3);list.add(b2);list.add(b2);
		
		for(Book b: list) {
			System.out.println(b.bookId+ " "+b.name+" "+b.publisher+" "+b.author+" "+b.quantity);
		}
		ListIterator<Book> listItr= list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next()+ " ");
		}
		System.out.println();
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous()+ " ");
		
		}
		

	}

}
