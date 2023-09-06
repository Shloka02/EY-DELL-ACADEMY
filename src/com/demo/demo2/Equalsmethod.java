package com.demo.demo2;

public class Equalsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="string is immutable";
		String str2="string is immutable";
		
		if(str1==str2) {
			System.out.println("works for literals and constants ");
		}else {
			System.out.println("doesn't work for literals and constants");
		}
		String str3= new String("string is immutable");
		String str4= new String("string is immutable");
		
		if(str3== str4) {
			System.out.println("works for literals and constants ");
		}else {
			System.out.println("does not work for literals and constants ");
		}
		if(str3.equals(str4)) {
			System.out.println("equals method works for objects");
		}else {
			System.out.println("equals method does not work for objects");
		}
		System.out.println("memory address is"+ str3.hashCode());
		System.out.println("memory address is"+ str4.hashCode());
		

	}

}
