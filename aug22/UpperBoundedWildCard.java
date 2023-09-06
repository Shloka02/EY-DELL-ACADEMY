package com.aug22;

import java.util.ArrayList;
import java.util.List;


abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("draw rectangle");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("draw Square");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("draw circle");
	}
}	

public class UpperBoundedWildCard {
	public static void main(String[] args) {
		List<Rectangle>listRect= new ArrayList<>();
		listRect.add(new Rectangle());
		listRect.add(new Rectangle());
		
		List<Circle>listCircle= new ArrayList<>();
		listCircle.add(new Circle());
		
		drawShape(listRect);drawShape(listCircle);
	}
	static void drawShape(List<?extends Shape> list) {
		for(Shape s: list) {
			s.draw();
		}
		
	}

}
