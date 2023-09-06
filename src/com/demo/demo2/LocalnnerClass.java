package com.demo.demo2;

public class LocalnnerClass {
	private int data =20;
	void message() {
		class XYZ{
			void show() {
				System.out.println("the value of data is"+data);
				
			}
		}
		XYZ obj= new XYZ();
		obj.show();
	}
	public static void main(String[] args) {
		LocalnnerClass obj2= new LocalnnerClass();
		obj2.message();
	}

}
