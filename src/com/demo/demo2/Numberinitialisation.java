package com.demo.demo2;

public class Numberinitialisation {
	int number1;
	static int number2;
	
	static {
		System.out.println("static initializer");
		number2=100;
		
	}
	Numberinitialisation(){
		number1=78;
	}
	public static void main(String[] args) {
		System.out.println("main method");
		
		System.out.println("value of number2 is"+number2);
		Numberinitialisation obj = new Numberinitialisation();
		System.out.println("value of number1 is"+obj.number1);
	}

}
