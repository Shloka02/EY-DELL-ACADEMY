package com.aug23;

class Customer{
	int amount=10000;
	public synchronized void withdraw(int amount) {
		System.out.println("user has come to withdraw"+amount);
		if(this.amount<amount) {
			System.out.println("less balance....");
		
		    try {
			wait();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		this.amount-=amount;
		System.out.println("withdraw completed...");
}
	public synchronized void deposit(int amount) {
		System.out.println("user has come to deposit");
		this.amount+=amount;
		System.out.println("deposit completed for amount"+ amount);
		notify();
	}
}

public class BankingApplication {
	public static void main(String[] args) {
		final Customer c1= new Customer();
		new Thread() {
			public void run() {
				c1.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c1.deposit(10000);
			}
		}.start();
	}

}
