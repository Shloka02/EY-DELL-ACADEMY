package com.aug24;
interface TestInterface{
	public void show() {
		default void show() {
			System.out.println("only for one class,default method is defined"+"so that other classes dont have to impkement this");
			
		}
		
	
}

public class DefaultKeywordFunctionality implements TestInterface {
	@Override
	public void square(int a) {
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		DeafultKeywordFunctionality obj= new DefaultKeywordFunctionality();
		
	}
}

}
