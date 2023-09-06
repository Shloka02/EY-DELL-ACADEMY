package com.aug28;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;



public class LocalDateTimeClassConcepts {

	public static void main(String[] args) {
		  LocalDate today = LocalDate.now();

	        System.out.println("Current System Date is " + today);
	        LocalDate IndiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
	        System.out.println("Current India Date is " + IndiaDate);

	        LocalDate usDate = LocalDate.now(ZoneId.of("US/Central"));
	        System.out.println("Current US Date is " + usDate);

	        LocalDate firstDay2023 = LocalDate.of(2023, Month.JANUARY, 1);
	        System.out.println("First day of 2023 is " + firstDay2023);

	        LocalDate epochDay = LocalDate.ofEpochDay(1000);
	        System.out.println("1000th Day from Epoch Date is " + epochDay);
	        LocalDate hundredth_Day_of_2020 = LocalDate.ofYearDay(2020, 100);
	        System.out.println("100th Day from Epoch Date is " + hundredth_Day_of_2020);
	    }	 
	}

	 