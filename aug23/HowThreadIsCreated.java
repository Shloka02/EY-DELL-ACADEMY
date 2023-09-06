package com.aug23;

public class HowThreadIsCreated extends Thread{
	public static void main(String[] args) {
		HowThreadIsCreated t1= new HowThreadIsCreated();
		t1.start();
	}
	public void run() {
		System.out.println("Iam running automatically");
	}

}
