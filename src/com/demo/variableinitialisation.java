package com.demo;

public class variableinitialisation {
	int num;
	
	variableinitialisation(){
		num=100;
		
	}
	variableinitialisation(int num){
		this.num=num;
	}
	public static void main(String[] args) {
		variableinitialisation obj = new variableinitialisation();
		System.out.println("value is"+ obj.num);
		
		variableinitialisation obj2= new variableinitialisation(1000);
		System.out.println("value is"+ obj2.num);
	}

}
