package com.demo;

import java.util.Calendar;
import java.util.List;

public class forloopperformancetest {
	static List<Integer> list= new ArrayList<>();
	static long startTime, endTime;
	static {
		for(int i=0;i<100_000_00;i++) {
			list.add(i);
		}
	}
	public static void main(String[] args) {
		startTime=Calendar.getInstance().getTimeInMillis();
		for(Integer i : list) {};
		endTime= Calendar.getInstance().getTimeInMillis();
		System.out.println("adv for loop took="+ (endTime - startTime)+ "ms");
		
		startTime=Calendar.getInstance().getTimeInMillis();
		for(int i=0 ;i<list.size();i++) {}
		endTime= Calendar.getInstance().getTimeInMillis();
		System.out.println("basic for loop took="+ (endTime - startTime)+ "ms");
		
		startTime=Calendar.getInstance().getTimeInMillis();
		int size =list.size();
		for(int i=0; i<=size;i++) {}
		endTime= Calendar.getInstance().getTimeInMillis();
		System.out.println("basic for loop took="+ (endTime - startTime)+ "ms");
		
		startTime=Calendar.getInstance().getTimeInMillis();
		for(Integer i=size;i>0;i--) {}
		endTime= Calendar.getInstance().getTimeInMillis();
		System.out.println("basic for loop took="+ (endTime - startTime)+ "ms");
		
	}

	
	

}
