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
	}
  
  
}
