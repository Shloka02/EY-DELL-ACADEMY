package com.aug23;

public class DeadlockSituation {
	public static void main(String[] args) {
		final String resource1="A";
		final String resource2="B";
		Thread t1= new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 : locked resource1 ");
					try {
						Thread.sleep(1000);
						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource2){
						System.out.println("Thread1 : looking for resource 2");
					}
				}
			}
		};
		Thread t2= new Thread() {
			public void run() {
				synchronized(resource2){
					System.out.println("thread2 : locked resource2");
					try {
						Thread.sleep(1000);
						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource1) {
						System.out.println("thread2: looking for resource 1");
					}
					
				}
			}
		};
		t1.start();t2.start();
	}

}
