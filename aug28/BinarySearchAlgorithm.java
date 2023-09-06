package com.aug28;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {10,32,2,5,67,8,3};
		Arrays.sort(intArr);
		System.out.println("sorted array is"+Arrays.toString(intArr));
		int lookOutFor= 8;
		int lastElementPositionInArray=intArr.length-1;
		binarySearch(intArr,0,lastElementPositionInArray,lookOutFor);

	}
	static void binarySearch(int[]intArr, int startingPosition,int lastPosition, int searchElement) {
		int midElementPosition=(startingPosition+lastPosition)/2;
		while(startingPosition<=lastPosition) {
			if(intArr[midElementPosition]<searchElement) {
				startingPosition= midElementPosition +1;
			}else if(intArr[midElementPosition]==searchElement) {
				System.out.println("Element"+searchElement+" found at position"+midElementPosition);
				break;
			}else {
				lastPosition= midElementPosition-1;
			}
			midElementPosition=(startingPosition+ lastPosition)/2;
		}
		if(startingPosition>lastPosition) {
			System.out.println("element is not found");
		}
	}

}
