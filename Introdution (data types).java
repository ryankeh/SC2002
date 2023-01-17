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
	
	public static void escapeCharacters(String[] args) {
		String message = "Hello \"World\"";
		//use "\" to include double quotes within string
		// backslash is the escape character
		System.out.println(message);
		
		String message2 = "cc:\\Windows\\...";
		//use "\" to include backslash within string
		System.out.println(message2);
		
		String message3 = "hello \n \t world";
		//use "\n" for new line and "\t" for tab
		System.out.println(message3);
		
	}	

	public static void arrays(String[] args) {
		int[] numbers = new int[5];
		numbers[0]=1;
		numbers[1]=2;
		System.out.println(Arrays.toString(numbers));
		//[1, 2, 0, 0, 0] 
		
		int[] numbers2 = {2,3,5,1,4};
		System.out.println(Arrays.toString(numbers2));
		//[2, 3, 5, 1, 4]
		System.out.println(numbers2.length);
		//5
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		//[1, 2, 3, 4, 5]
	}
	
	public static void multiDimensionalArray(String[] args) {
		int[][] numbers = new int[2][3];
		numbers[0][0]=1;
		numbers[0][1]=2;
		System.out.println(Arrays.deepToString(numbers));
		//[[1, 2, 0], [0, 0, 0]]
		
		int[][] numbers2 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(numbers2));
		//[[1, 2, 3], [4, 5, 6]]
	}
	
	public static void constant(String[] args) {
		final float PI=3.14F;
		//final compiles the value as a constant, cannot be edited ltr
	}
	
	public static void arithmetic(String[] args) {
		int result = 10/3;
		System.out.println(result);
		//3
		double result2 = (double)10/(double)3;
		System.out.println(result2);
		//3.33333
		//order of operations: () -> */ -> +-
	}
	
	public static void casting(String[] args) {
		//byte>short>int>long>float>double
		String x ="1";
		int y = Integer.parseInt(x)+2;
		System.out.println(y);
		
		String x2 ="1.1";
		double y2 = Double.parseDouble(x2)+2;
		System.out.println(y2);
	}
	
	public static void math(String[] args) {
		int result = Math.round(1.1F);
		System.out.println(result);
		int result2 = (int)Math.ceil(1.1F);
		//ceil function returns double
		System.out.println(result2);
		int result3 = (int)Math.floor(1.1F);
		System.out.println(result3);
		// 1 2 1
		
		int result4 = Math.max(1, 2);
		System.out.println(result4);
		int result5 = Math.min(1, 2);
		System.out.println(result5);
		// 2 1
		
		double result6 = Math.random();
		System.out.println(result6);
		// gives random number from 0 to 1
		int result7 = (int)Math.round(Math.random()*100);
		System.out.println(result7);
		// gives random integer from 0 to 100
	}
	
	public static void formatNumber(String[] args) {
		// import java.text.NumberFormat;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(1234567.891);
		System.out.println(result);
		// $1,234,567.89
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		String result2 = percent.format(1234567.891);
		System.out.println(result2);
		// 123,456,789%
		
		String result3 = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result3);
		// 10%
	}
	
	public static void readingInput(String[] args) {
		//import java.util.Scanner;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		//println automatically adds a newline, use print to have input in the same line
		byte age = scanner.nextByte();
		System.out.println("You are " + age);
		
		System.out.print("Name: ");
		String name = scanner.nextLine().trim();
		//nextLine takes the whole line of user input regardless of spaces
		System.out.println("You are " + name);
	}

}
