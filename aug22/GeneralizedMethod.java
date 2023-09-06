package com.aug22;
//this is the class that can accept any input
public class GeneralizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr= {10,4,5,6,7,24};
		String[] strArr= {"Z","A","B","W"};
		System.out.println("printing integer array");
		printArray(intArr);
		System.out.println("printing string array");
		printArray(strArr);

	}
	static <E>void printArray(E[]elements){
		for(E ele:elements) {
			System.out.println(ele+" ");
		}
		System.out.println();
	}

}
