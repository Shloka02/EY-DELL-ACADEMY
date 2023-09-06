package com.aug28;

import java.time.LocalDate;
import java.time.LocalTime;


public class FunctionsOfLocalDateAPI {

	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println("year"+today.getYear()+"is a leap year or"+"not"+today.isLeapYear());
		System.out.println("current time is"+today.atTime(LocalTime.now()));
		
		System.out.println("10 days after todsy will be"+today.plusDays(10));
		System.out.println("3 weeks after todsy will be"+today.plusWeeks(3));
		System.out.println("20 days after todsy will be"+today.plusDays(20));

		System.out.println("10 days before todsy will be"+today.minusDays(10));
		System.out.println("13 weeks before todsy will be"+today.minusWeeks(3));
		System.out.println("20 months before todsy will be"+today.minusMonths(20));


	}

}
