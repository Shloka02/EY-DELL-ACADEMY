package com.aug23;
class SharedResource{
	void print(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	SharedResource sR;
	MyThread1(SharedResource sR){
		this.sR=sR;
	}
	public void run() {
		sR.print(5);
	}
	
}
class MyThread2 extends Thread{
	SharedResource sR;
	MyThread2(SharedResource sR){
		this.sR=sR;
	}
	public void run() {
		sR.print(5);
	}
	
}


public class CodeWithoutSynchronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource obj = new SharedResource();
		
		MyThread1 t1= new MyThread1(obj);
		MyThread2 t2= new MyThread2(obj);
		
		t1.start();t2.start();

	}

}
