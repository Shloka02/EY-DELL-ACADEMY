package com.aug22;

import java.util.HashMap;


public class PrintNextVowelInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "amitthakur";
		System.out.println("next vowel is "+printNextVowel(str.toCharArray()));

	}
	public static  String printNextVowel(char[]str) {
		HashMap<Character, Integer> hMap= new HashMap<>();
		hMap.put('a',0);
		hMap.put('e',1);
		hMap.put('i',2);
		hMap.put('o',3);
		hMap.put('u',4);
		
		char[] arr= {'a','e','i','o','u'};
		 int lengthOfString =str.length;
		 for(int i=0;i<lengthOfString;i++) {
			 char c=str[i];
			 System.out.println("character is"+c);
			 if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
				 
				 int index= hMap.get(c)+1;
				 int newIndex= index%5;
				 str[i]= arr[newIndex];
				 System.out.println("print1 "+index);
				 System.out.println("cprint2 "+newIndex);
			 }
		 }
		return String.valueOf(str);
	}

}
