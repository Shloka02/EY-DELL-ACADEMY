package day3;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("method main");
		try {
			ExceptionPropagation obj =new ExceptionPropagation();
			obj.a();
		}catch(InterruptedException e) {
			System.out.println("main method"+ e.getMessage());
		}

	}
	void a() throws InterruptedException{
		System.out.println("method A");
		b();
	}
	void b() throws InterruptedException{
		System.out.println("method B");
		c();
		throw new InterruptedException("Thread Exception");
	}
	void c() {
		System.out.println("method c");
	}

}
