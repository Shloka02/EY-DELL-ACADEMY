package com.demo.demo2;

public class MemberInnerClassStatic {
	private int data=10;
	class ABC{
		
		void show() {
			System.out.println("The value of data is"+ data);
		}
	}
	public static void main(String[] args) {
		MemberInnerClassStatic obj = new MemberInnerClassStatic();
		MemberInnerClassStatic.ABC obj2= obj. new ABC();
		obj2.show();
	}

}
