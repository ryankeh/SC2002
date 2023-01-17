package com.pack;

public class Main {
	public static void logicalOperators(String[] args) {
		int temperature = 22;
		boolean isWarm = temperature > 20 && temperature < 30;
		System.out.println(isWarm);
		
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasHighIncome||hasGoodCredit)&&!hasCriminalRecord;
		System.out.println(isEligible);
	}
	
	public static void ifStatement(String[] args) {
		int temp=32;
		if(temp>30) {
			System.out.println("It's a hot day");
			System.out.println("Drink Water");			
		} else if (temp>20&&temp<=30) {
			System.out.println("Beautiful day");
		} else {
			System.out.println("Cold day");
		}
		//It's a hot day
		//Drink water
		
		int income=120_000;
		boolean hasHighIncome = (income > 100_000);
		System.out.println(hasHighIncome);
		//true
		
		String className = income > 100_000 ? "First":"Economy";
		System.out.println(className);
		//First
	}
	
	public static void switchStatement(String[] args) {
		String role = "admin";
		switch(role) {
			case "admin":
				System.out.println("You're an admin");
				break;
			case "moderator":
				System.out.println("You're a moderator");
				break;
			default:
				System.out.println("You're an guest");
		}
		
	}
	
	public static void forLoop(String[] args) {
		for (int i=0; i<5; i++) {
			System.out.println("Hello World "+i);
		}
		//Hello World 0
		//Hello World 1
		//Hello World 2
		//Hello World 3
		//Hello World 4
		
		for (int i=5; i>0; i--) {
			System.out.println("Hello World "+i);
		}
		//Hello World 5
		//Hello World 4
		//Hello World 3
		//Hello World 2
		//Hello World 1
		
	}
	
	public static void whileLoop(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(!input.equals("quit")) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			if(input.equals("quit"))
				break;
			if(input.equals("pass"))
				continue;
			System.out.println(input);
		}
		
	}
  
  
}
