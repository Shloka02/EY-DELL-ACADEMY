package com.aug25;

import java.util.regex.Pattern;

public class MetaCharacterInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("\\d","abc"));
		System.out.println(Pattern.matches("\\d","i"));
		System.out.println(Pattern.matches("\\d","1234"));
		System.out.println(Pattern.matches("\\d","1234"));
		System.out.println(Pattern.matches("\\D","a"));
		System.out.println(Pattern.matches("\\D*","abc"));
		System.out.println(Pattern.matches("\\D*","123"));
		
		System.out.println("core java Regex".replaceAll("\\s+",""));
		
		
		

	}

}
