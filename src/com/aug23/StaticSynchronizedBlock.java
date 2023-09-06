package com.aug23;
class SharedResource3{
	 synchronized static void print(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyThread5 extends Thread{
	
	public void run() {
		SharedResource3.print(5);
	}
	
}
class MyThread6 extends Thread{
	
	public void run() {
		SharedResource3.print(10);
	}
	
}
class MyThread7 extends Thread{
	
	public void run() {
		SharedResource3.print(15);
	}
	
}
class MyThread8 extends Thread{
	
	public void run() {
		SharedResource3.print(20);
	}
	
}



public class StaticSynchronizedBlock {
	public static void main(String[] args) {
		MyThread5 t1= new MyThread5();
		MyThread6 t2= new MyThread6();
		MyThread7 t3= new MyThread7();
		MyThread8 t4= new MyThread8();
		t1.start();t2.start();t3.start();t4.start();
		
		
	}

}
