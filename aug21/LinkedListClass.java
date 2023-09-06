package com.aug21;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<>();
		list.add("A");list.add("A");list.add("A");list.add("A");
		list.add(null);list.add(null);list.add(null);
		list.add("Z");list.add("X");list.add("Y");list.add("B");
		list.addFirst("First element");
		list.addLast("Last element");
		
		Object firstElement= list.getFirst();
		System.out.println("First element is"+firstElement);
		Object lastElement= list.getLast();
		System.out.println("last element is"+lastElement);
		
		Object lastPositionOfA= list.indexOf("Z");
		System.out.println("Position of Z is"+lastPositionOfA);
		list.add(0,"Added element at zeroth index");
		list.remove(2);
		
		list.removeFirst();
		list.removeLast();
		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");
		Object o= list.poll();
		Object o2= list.pollLast();
		
		ListIterator<String> listItr= list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next()+ " ");
		}
		System.out.println();
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous()+ " ");
		}
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		
		
		
		

	}

}
