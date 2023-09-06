package com.aug25;

import java.util.regex.Pattern;

// ? once or not all
// + occur once or more than once
// * zero or more than once
// \D any non digit
// [^0-9] anything other than 0 to 9

public class UserNameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd34"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd347"));
		//moblie number validation
		System.out.println(Pattern.matches("[6789]{1}[0-9]{9}", "8688959944"));
		
		String str="    Java example Trim Function  ";
		System.out.println(str.trim());
		

	}
}

