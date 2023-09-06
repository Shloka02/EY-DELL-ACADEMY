package com.aug22;
class MyGeneralizedClass<T>{
	T obj;
	
	void add(T obj) {
		this.obj= obj;
	}
	T get() {
		return obj;
	}
}

public class UseOfGenerics {
	public static void main(String[] args) {
		MyGeneralizedClass<Integer> intType= new MyGeneralizedClass<>();
		intType.add(21);
		intType.add(31);
		System.out.println(intType.get());
		
		MyGeneralizedClass<String> strType= new MyGeneralizedClass<>();
		strType.add("ABC");
		System.out.println(strType.get());
	}

}
