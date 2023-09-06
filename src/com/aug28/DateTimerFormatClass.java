package com.aug28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;


public class DateTimerFormatClass {

	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println("defaul format is"+ today);
		
		System.out.println("according to pattern1"+today.format(DateTimeFormatter.ofPattern("dd::MM::uuuu")));
		
		System.out.println("according to pattern 2"+today.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		LocalDateTime dateTime= LocalDateTime.now();
		
		System.out.println("current date with timestamp is"+dateTime);
		System.out.println("according to pattern2"+dateTime.format(DateTimeFormatter.ofPattern("d:MMM::uuuu HH::mm::ss")));;

	}

}
