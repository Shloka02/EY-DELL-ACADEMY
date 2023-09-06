package com.aug23;

public class HowThreadIsCreated2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HowThreadIsCreated2 obj= new HowThreadIsCreated2();
		Thread t1= new Thread(obj);
		t1.start();

	}
	@Override
	public void run() {
		System.out.println("I got called automatically");
	}

}
