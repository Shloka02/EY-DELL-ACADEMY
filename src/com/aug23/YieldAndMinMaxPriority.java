package com.aug23;

public class YieldAndMinMaxPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread producerThread= new Producer();
		Thread consumerThread= new Consumer();
		producerThread.setPriority(Thread.MAX_PRIORITY);
		consumerThread.setPriority(Thread.MIN_PRIORITY);
		producerThread.start();
		consumerThread.start();

	}

}
class Producer extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("producer thread"+i);
			Thread.yield();
			
		}
	}
}
class Consumer extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("consumer thread"+i);
			Thread.yield();
			
		}
	}
}
