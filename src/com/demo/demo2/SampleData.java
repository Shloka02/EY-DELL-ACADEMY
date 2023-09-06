package com.demo.demo2;

@FunctionalInterface

interface SomeData{

    void fullName(String firstName, String lastName);

}

 

public class SampleData implements SomeData {

     

    @Override

        // TODO Auto-generated method stub

        public void fullName(String firstName, String lastName) {

            System.out.println("Name is " + firstName + " "+ lastName);

        }

        public static void main(String[] args) {

            

            SampleData obj = new SampleData();

            obj.fullName("ABC", "XYZ");

        }

        

 

    }