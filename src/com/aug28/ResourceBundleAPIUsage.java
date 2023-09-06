package com.aug28;

import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleAPIUsage {

	public static void main(String[] args) {
		ResourceBundle rs= ResourceBundle.getBundle("com.aug28.TestBundle");
		displayValues(rs);
		
		Locale swedishLocale= new Locale("sv","SE");
		ResourceBundle rs2= ResourceBundle.getBundle("com.aug28.TestBundle",swedishLocale);
		displayValues(rs2);

	}
	static void displayValues(ResourceBundle bundle) {
		System.out.println("hello message:"+bundle.getString("my.hello"));
		System.out.println("hello message:"+bundle.getString("my.bye"));
		System.out.println("hello message:"+bundle.getString("my.question"));
		
	}

}
