package com.demo;

public class mininarray {
	public static void main(String[] args) {
		int intArr[]= {10,20,30,40};
		min(intArr);
	}
	static void min(int[] intArr) {
		int min =intArr[0];
		for(int i=0; i<intArr.length; i++) {
			if(min>intArr[i]) {
				min=intArr[i];
			}
			
		}
		System.out.println("min is" + min);
	}

}
