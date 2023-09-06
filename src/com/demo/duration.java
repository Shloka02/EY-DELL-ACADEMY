package com.demo;

public class duration {
	long startValue , endValue;
	duration(long startValue, long endValue){
		if( startValue > endValue) {
			throw new IllegalArgumentException("strt value is big");
		}
		this.startValue= startValue;
		this.endValue= endValue;
		
	}
	long duration() {
		return endValue- startValue;
		
	}
	public static void main(String[] args) {
		duration obj =new duration(19, 21);
		System.out.println("duration is "+obj.duration());
	}

}
