package com.aug28;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]intArr= {3,60,35,2,45,320,5};
		System.out.println("before heap sort");
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
		}
		HeapSort.heapSort(intArr);
		System.out.println();
		
		System.out.println("after heap sort");
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+" ");
		}

	}
	static void heapSort(int[] intArr) {
		int lengthOfArray=  intArr.length;
		for(int i=(lengthOfArray/2)-1;i>=0;i--) {
			heapify(intArr,lengthOfArray,i);
			
		}
		for(int i=lengthOfArray-1;i>=0;i--) {
			int temp=intArr[0];
			intArr[0]=intArr[i];
			intArr[i]=temp;
			heapify(intArr,i,0);
		}
	}
	static void heapify(int[] intArr,int lengthOfArray,int i) {
		int largestElement=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<lengthOfArray && intArr[left]>intArr[largestElement]) {
			largestElement=left;
		}
		if(right<lengthOfArray&& intArr[right]>intArr[largestElement]) {
			largestElement=right;
		}
		if(largestElement !=i) {
			int tempArr= intArr[i];
			intArr[i]=intArr[largestElement];
			intArr[largestElement]=tempArr;
			
			heapify(intArr, lengthOfArray,largestElement);
			
		}
	}

}
