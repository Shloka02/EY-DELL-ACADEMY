package com.aug21;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListsWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList= new ArrayList<> ();
		arrList.add("A");arrList.add("A");arrList.add("A");arrList.add("A");
		
		arrList.add(null);arrList.add(null);arrList.add(null);
		arrList.add("Z");arrList.add("X");arrList.add("Y");arrList.add("B");
		ArrayList<String>arrList2= new ArrayList<>();
		arrList2.add("P");arrList2.add("P");arrList.add("Q");
		
		arrList.addAll(arrList2);
		System.out.println(" size of my array list is"+ arrList.size());
		
		arrList.remove("A");
		
		arrList.removeAll(arrList2);
		arrList.set(1, "New second element");
		arrList.retainAll(arrList2);
		
		
		Iterator<String> itr= arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		arrList.clear();
		
		for(String str: arrList) {
			System.out.println(str+ " ");
		}

	}

}
