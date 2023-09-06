package day3;

public class Finallywillalwayswork {
	public static void main(String[] args) {
		int result = sampleMethod();
		System.out.println("result is"+ result);
	}
	static int sampleMethod() {
		try {
			return 123;
			
		}finally {
			System.out.println("code just returning a integer 123");
		}
	}

}
