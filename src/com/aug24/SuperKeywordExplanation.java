package com.aug24;

class Parent{
	void show() {
		System.out.println("parent class function show");
	}
	int data=10;
}
public class SuperKeywordExplanation extends Parent{
	@Override
	void show() {
		System.out.println("child class function show");
	}
	int data=20;
	void display() {
		System.out.println("value of current class object is"+this.data);
		System.out.println("value of immediate parent class object is"+super.data);
		this.show();
		super.show();
	}
	public static void main(String[] args) {
		SuperKeywordExplanation obj= new SuperKeywordExplanation();
		obj.display();
	}

}
