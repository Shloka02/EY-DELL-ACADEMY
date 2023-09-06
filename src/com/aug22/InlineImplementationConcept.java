package com.aug22;
@FunctionalInterface
interface Sample{
	String print(String name);
}

public class InlineImplementationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=(name)->{return"welcome"+name;};
		System.out.println(obj.print("TO Lamda expression programming"));
		

	}

}
