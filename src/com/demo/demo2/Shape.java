package com.demo.demo2;
abstract class Shape1 {
	  abstract void draw();
	int length, area, breadth, height,radius;
	double areaofcircle;
	
	void purpose() {
		System.out.println("calculate the area of different shapes");
	}
}
 class triangle extends Shape1{
	 @Override
	 void draw () {
		 purpose();
		 int breadth=20, height=30;
		 area=(breadth*height)/2;
		 System.out.println("area of triangle is"+area);
	 }
 }	 
 class rectangle extends Shape1{
	 @Override
	 void draw () {
		 int length=10, breadth=30;
		 area=length*breadth;
		 System.out.println("area of rectangle is"+area);
	 }
 }	
 class circlee extends Shape1{
	 @Override
	 void draw () {
		 int radius=10;
		 areaofcircle=Math.PI*radius*radius;
		 System.out.println("area of circlee is"+areaofcircle);
	 }
 }
 public class Shape{
	 public static void main(String[]args) {
		 triangle tr= new triangle();
		 tr.draw();
		 rectangle rect= new rectangle();
		 rect.draw();
		 circlee cir= new circlee();
		 cir.draw();
	 }
 }
	 



