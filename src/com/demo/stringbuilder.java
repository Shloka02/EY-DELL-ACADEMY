package com.demo;

public class stringbuilder {
	public static void main(String[] args) {
		String str= new String("ABC");
		StringBuffer sb= new StringBuffer("ABC");
		System.out.println("value of string is"+ sb.toString());
		sb.append("XYZ");
		System.out.println("value of str is"+sb.toString());
		StringBuilder sb2= new StringBuilder("MNO");
		System.out.println("value of str is"+sb2.toString());
		sb2.append("XYZ");
		System.out.println("value of str is "+ sb2.toString());
	}

}
