package com.demo.demo2;

public class EmployeeData {
	int empId;
	String empName;
	
	static String orgAddress= "ABC XYZ";
	static void orgAddressChange() {
		orgAddress= "MNO PQR";
	}
	EmployeeData(int empId, String empName){
		this.empId=empId;
		this.empName= empName;
	}
	void display() {
		System.out.println("id of employee is"+ empId +"and name of emp is"+empName+" and org name is"+orgAddress);
		
	}
	public static void main(String[] args) {
		EmployeeData.orgAddressChange();
		EmployeeData e1= new EmployeeData(123," Jhon");
		EmployeeData e2= new EmployeeData(456," Charlie");
		
		e1.display();
		e2.display();
		
	}
	

}
