package com.demo;

import java.util.Arrays;

public class copyarrays {
	public static void main(String[] args) {
		char[] chArr1 = { 'z', 'a', 'b', 'j' };
		char[] ch2 = new char[3];
		System.arraycopy(chArr1, 1, ch2, 0, 3);
		System.out.println(Arrays.toString(ch2));
		System.out.println(new String(ch2));

	}

}
