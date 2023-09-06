package com.aug25;

import java.util.regex.Pattern;
//[abc]= a or b or c

public class CharacterClassInRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]","a"));
		System.out.println(Pattern.matches("[amn]","aa"));
		
		System.out.println(Pattern.matches("[amn]","m"));
		System.out.println(Pattern.matches("[amn]","mn"));
		//any character except a or m or n
		System.out.println(Pattern.matches("[^amn]","z"));
		System.out.println(Pattern.matches("[a-zA-z]","B"));
		System.out.println(Pattern.matches("[a-d[m-p]]","e"));
		
		
		
		
		

	}

}
