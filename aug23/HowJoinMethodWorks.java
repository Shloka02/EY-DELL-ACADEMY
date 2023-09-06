package com.aug23;

public class HowJoinMethodWorks extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HowJoinMethodWorks t1= new HowJoinMethodWorks();
		HowJoinMethodWorks t2= new HowJoinMethodWorks();
		HowJoinMethodWorks t3= new HowJoinMethodWorks();
		
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();

	}
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("runnin thread name is"+Thread.currentThread().getName());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
