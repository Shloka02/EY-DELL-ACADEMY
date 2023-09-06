package com.aug24;

public class ImmutableClass {
	public static void main(String[] args) {
		String str= new String("ABC");
		System.out.println("after first step"+str);
		str=str.concat(".XYZ");
		System.out.println("after second step"+str);
		
		StringBuilder sb= new StringBuilder("ABC");
		System.out.println("SB after 1st step");
		sb.append("XYZ");
		System.out.println("SB After second step "+sb);
	}

}
