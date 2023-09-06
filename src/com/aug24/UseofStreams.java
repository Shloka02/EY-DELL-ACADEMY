package com.aug24;

import java.util.ArrayList;
import java.util.Collections;

public class UseofStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>countries= new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("china");
		
		Collections.sort(countries);
		for(String country: countries) {
			country= country.toUpperCase();
			if(!country.startsWith("C")){
				System.out.println("country name not starting with C"+country);
				
			}
			
		}
		countries.stream().map(s-> s.toUpperCase()).
		filter(s-> !s.startsWith("c")).sorted().
		forEach(s-> System.out.println(s));

	}

}
