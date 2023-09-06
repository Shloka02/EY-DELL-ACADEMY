package com.demo.demo2;

class Machine{
	void start() {
		System.out.println("mavhine started");
	}
	void stop() {
		System.out.println("machine stopped");
	}
}
class Camera extends Machine{
	@Override
	void start() {
		System.out.println("camera started");
	}
	void snap() {
		System.out.println(" photo clicked");
	}
}
public class Typecastingconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m= new Machine();
		m.start();
		m.stop();
		
		Camera c = new Camera();
		c.start();
		c.stop();
		c.snap();
		
		Machine pc= new Camera();
		pc.start();
		pc.stop();
		
		//upcasting automatically
		Machine m2= c;
		m2.start();
		m2.stop();
		
		
		//downcasting
		Machine m3= new Camera();
		Camera c2=(Camera)m3;
		c2.start();
		c2.stop();
		c2.snap();
		

	}

}
