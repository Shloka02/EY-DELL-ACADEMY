package com.aug21;
import java.util.Arrays;

import java.util.Comparator;

 

class Employee implements Comparable<Employee>{

    private int empId;

    private String empName;

    private int empAge;

    private int empSalary;

 

 

public int getEmpId() {

        return empId;

    }

 

 

    public void setEmpId(int empId) {

        this.empId = empId;

    }

 

 

    public String getEmpName() {

        return empName;

    }

 

 

    public void setEmpName(String empName) {

        this.empName = empName;

    }

 

 

    public int getEmpAge() {

        return empAge;

    }

 

 

    public void setEmpAge(int empAge) {

        this.empAge = empAge;

    }

 

 

    public int getEmpSalary() {

        return empSalary;

    }

 

 

    public void setEmpSalary(int empSalary) {

        this.empSalary = empSalary;

    }

    Employee(int empId,String empName,int empAge,int empSalary){

        this.empId=empId;

        this.empName=empName;

        this.empAge=empAge;

        this.empSalary=empSalary;

        

    }

    @Override

    public String toString() {

        return "id is" +this.empId +"Name is" +this.empName+ "and the age is"+this.empAge+"and salary is" +this.empSalary;

    }

    @Override

    public int compareTo(Employee o) {

        return this.empId-o.empId;

    }

    public static Comparator<Employee> ageComparator = new Comparator<> () {

        @Override

        public int compare(Employee o1,Employee o2) {

            return o1.getEmpAge() - (o2.getEmpAge());

        }

    };

    public static Comparator<Employee> nameComparator = new Comparator<> () {

        @Override

        public int compare(Employee o1,Employee o2) {

            return o1.getEmpName().compareTo(o2.getEmpName());

        }

    };

    public static Comparator<Employee> salaryComparator = new Comparator<> () {

        @Override

        public int compare(Employee o1,Employee o2) {

            return o1.getEmpSalary() - o2.getEmpSalary();

        }

    };

}    

 

 

public class SortingTheObjects {

    public static void main(String[] args) {

        

        Employee[] empArr = new Employee[4];

        empArr[0] = new Employee(123,"A",25,5000);

        empArr[1] = new Employee(101,"z",24,5500);

        empArr[2] = new Employee(134,"X",25,5400);

        empArr[3] = new Employee(130,"B",25,5800);

        

        Arrays.sort(empArr);

        System.out.println("Sorted emp array is"+Arrays.toString(empArr));

        

        Arrays.sort(empArr,Employee.ageComparator);

        System.out.println("Sorted emp array - age is"+Arrays.toString(empArr));

        

        Arrays.sort(empArr,Employee.nameComparator);

        System.out.println("Sorted emp array- name is"+Arrays.toString(empArr));

        

        Arrays.sort(empArr,Employee.salaryComparator);

        System.out.println("Sorted emp array- salary is"+Arrays.toString(empArr));

        

        

        

        

    }

        

        }