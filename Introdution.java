package com.pack;

import java.util.Date;
import java.awt;

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
	
	public static void pointer(String[] args) {
		Point point1 = new Point(x:1, y:1);
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2);
	}
	
	public static void string(String[] args) {
		//String message = new String("Hello World");
		String message = "Hello World"+"!!";
		System.out.println(message);
		//Hello World!!
		System.out.println(message.endsWith("!!"));
		//true
		System.out.println(message.startsWith("!!"));
		//false
		System.out.println(message.length());
		//13
		System.out.println(message.indexOf("o"));
		//4
		System.out.println(message.indexOf("z"));
		//-1
		System.out.println(message.replace("!","?"));
		//Hello World??
		System.out.println(message);
		//Hello World!!
		//strings are immutable, any methods that modify a string will always return a new string object
		System.out.println(message.toLowerCase());
		//hello world!!
		System.out.println(message.toUpperCase());
		//HELLO WORLD!!
		String message2 = "  Hello World"+"!!";
		System.out.println(message2.trim());
		//Hello World!!
		//trims white space before message
	}	
}
