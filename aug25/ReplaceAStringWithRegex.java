package com.aug25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAStringWithRegex {
	private static final String REGEX="Java";
	private static  String INPUT_STRING="core java programming language";
	private static final String REPLACED_STRING="Java regex concept";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern P= Pattern.compile(REGEX);
		Matcher m= P.matcher(INPUT_STRING);
		INPUT_STRING=m.replaceAll(REPLACED_STRING);
		System.out.println("replaced string is"+ INPUT_STRING);

	}

}
