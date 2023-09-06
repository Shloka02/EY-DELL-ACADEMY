package day3;

import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleMethod();
		System.out.println("Rest of code ....");

	}
	static void sampleMethod() {
		try {
			throw new IOException("device error");
		}catch (IOException e) {
			System.out.println("Exception");
		}
	}

}
