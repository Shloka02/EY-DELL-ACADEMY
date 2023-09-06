package com.aug21.annotations;
@JasonSerialisable
public class Person {
	@JasonElement
	private String firstName;
	@JasonElement(key= "personAge")
	private String address;
	
	public Person(String firstName,String lastName) {
		super();
		this.firstName= firstName;
		this,lastName= lastName;
	}
	public Person(String firstName, String lastName,String age) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	@Init
	private void initNames() {
		this.firstName= this.firstName.substring(0,1).
			toUpperCase()+this.firstName.substring(0,1);
		this.lastName= this.
		
	}
}
