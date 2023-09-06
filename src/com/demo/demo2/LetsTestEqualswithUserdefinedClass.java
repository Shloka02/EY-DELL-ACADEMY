package com.demo.demo2;

import java.util.Objects;

class Employee{
	String firstName;

	@Override
	public int hashCode() {
		return Objects.hash(firstName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}

public class LetsTestEqualswithUserdefinedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		Employee e2= new Employee();
		
		e1.setFirstName("ABC");
		e2.setFirstName("ABC");
		
		if(e1.equals(e2)) {
			System.out.println("equals work with custom class");
		}else {
			System.out.println("equals does not work with custom class");
			
		}
		System.out.println("memory address"+e1.hashCode());
		System.out.println("memory address"+e2.hashCode());
		

	}

}