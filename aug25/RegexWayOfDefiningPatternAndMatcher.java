package com.aug25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexWayOfDefiningPatternAndMatcher {
		// TODO Auto-generated method stub
		public static void main(String[] args) {

		    Pattern p= Pattern.compile(".o");

		    Matcher m= p.matcher("Co");

		    boolean result=m.matches();

		    

		    System.out.println("Match Result - "+result);

		    

		    boolean sameResult2=  Pattern.compile(".a").matcher("a").matches();

		    System.out.println("Resutl is "+ sameResult2);

		    

		    boolean sameResult3= Pattern.matches(".q", "Pq");

		    System.err.println("Result is "+sameResult3);

		}
	}

