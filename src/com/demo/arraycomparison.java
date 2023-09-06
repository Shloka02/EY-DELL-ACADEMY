package com.demo;

import java.util.Arrays;

public class arraycomparison {
	public static void main(String[] args) {
		int[] intArr1= {1,2};
		int[] intArr2= {1,2};
		boolean[] blnArr1= { true, false};
		boolean[] blnArr2= { true, true};
		
		if(intArr1== intArr2) {
			System.out.println("works for arrays");
			
		}else {
			System.out.println("doesnot work for arrays");
		}
		if(blnArr1==blnArr2) {
			System.out.println("works for arrays");
			
		}else {
			System.out.println("doesnot work for arrays");
		}
		boolean result =Arrays.equals(blnArr1, blnArr2);
		System.out.println("result"+ result);
		System.out.println("result"+Arrays.equals(intArr1,  intArr2));
	}

}
