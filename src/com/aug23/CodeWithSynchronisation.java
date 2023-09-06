package com.aug23;

class SharedResource2{
	 synchronized void print(int n) {
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

class MyThread3 extends Thread{
	SharedResource2 sR2;
	MyThread3(SharedResource2 sR, SharedResource2 sR2){
		this.sR2=sR2;
	}
	public void run() {
		sR2.print(5);
	}
	
}
class MyThread4 extends Thread{
	SharedResource2 sR2;
	MyThread4(SharedResource2 sR2){
		this.sR2=sR2;
	}
	public void run() {
		sR2.print(10);
	}
	
}


public class CodeWithSynchronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedResource2 obj = new SharedResource2();
		
		MyThread3 t3= new MyThread3(obj, obj);
		MyThread4 t4= new MyThread4(obj);
		
		t3.start();t4.start();

	}

}
