package com.pack;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		byte age = 30;
		long viewCount = 3_123_456_789L;
		float price = 10.99F;
		//need put L or F behind numbers to allow engine to read it as long/float values
		char letter = 'A';
		//for strings use double quotation marks
		boolean isEligbible = false;
		System.out.println(age);
	}
	
	public static void printDateTime(String[] args) {
		//import java.util.Date;
		Date now = new Date();
		//when dealing with reference types always have to allocate memory
		System.out.println(now);
		//Sout -> tab -> enter
	}
}
