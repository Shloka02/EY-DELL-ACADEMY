package com.aug22;

public class MethodReferenceeg {
	@FunctionalInterface
	public static interface Converter<F,T>{
		T convert(F from);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter<String, Integer> intConverter= (from)->Integer.valueOf(from);
		Integer convertedValue= intConverter.convert("123");
		System.out.println("integer is"+convertedValue);
		
		//same with method reference
		Converter<String,Integer>intConverter2=Integer::valueOf;
		Integer convertedValue2= intConverter2.convert("123");
		System.out.println("integer value is"+convertedValue2);
		
		StartingAlphabet obj = new StartingAlphabet();
		Converter<String, String> strCon= obj::startsWith;
		String value= strCon.convert("Java");
		System.out.println(value);
		
		PersonFactor<Person>personObject= Person::new;
		Person person= personObject.create("Core","Java");
		System.out.println("person name is"+person.firstName+" "+ person.lastName);

	}
	static class StartingAlphabet{
		String startsWith(String str) {
			return String.valueOf(str.charAt(0));
			
		}
	}
	interface PersonFactor<P extends Person>{
		P create(String firstName, String lastName);
	}

}
class Person{
	String firstName;
	String lastName;
	public Person() {}
	public Person(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName= lastName;
	}
}
