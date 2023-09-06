package com.aug22;
@FunctionalInterface
interface isFunctional{
	void show(String data);
}


public class LambdaExpressioneg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isFunctional obj = new isFunctional() {
			@Override
			public void show(String data) {
				System.out.println("using anaonymous inner"+ data);
			}
		};
		obj.show("class way of implementation");
		isFunctional obj2= (demoData)->{
			System.out.println("eliminating anonymous inner"+demoData);
		};
		obj2.show("class way of implementation- Through Lamda Expression");

	}

}
