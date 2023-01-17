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
  
  
}
