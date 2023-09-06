package com.aug28;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {20,2,3,-10,100,12,0,-1};
		System.out.println("elements beforr swapping");
		for(int i: intArr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int firstIndex=2, secondIndex=4;
		
		int temp= intArr[firstIndex];
		
		intArr[firstIndex]=intArr[secondIndex];
		intArr[secondIndex]=temp;
		
		System.out.println("elements after swapping 4th index with 2nd index are");
		for(int i: intArr) {
			System.out.print(i+" ");
		}
				

	}

}
