package com.aug24;

public class ThisKeywordUsage {
	int data=30;
	void display() {
		int data=20;
		System.out.println("local variable is"+data);
		this.data=data;
		
		
	}

}
