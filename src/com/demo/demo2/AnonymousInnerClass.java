package com.demo.demo2;
abstract class Sample{
	abstract void show() ;
	
		
	
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Sample obj=new Sample() {
			@Override
			void show() {
				System.out.println("Hello");
			}
			
		};
		obj.show();
	}

}
