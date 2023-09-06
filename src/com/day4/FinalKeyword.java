package com.day4;

public final class FinalKeyword {
	final static String PAN_CARD_NUMBER;
	static {
		PAN_CARD_NUMBER="ABCDE4321";
	}
	final void display() {
		System.out.println("final method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword obj = new FinalKeyword();
		System.out.println("obj is"+ obj.PAN_CARD_NUMBER);

	}

}
