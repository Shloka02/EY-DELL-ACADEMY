package com.aug23;
class Reentrant{
	public synchronized void m() {
		n();
		System.out.println("Iam in m synchronized method");
		
	}
	public synchronized void n() {
		System.out.println("Iam in n synchronized method");
	}
}

public class ReentrantThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Reentrant r= new Reentrant();
		new Thread() {
			public void run() {
				r.m();
			}
		}.start();

	}

}
