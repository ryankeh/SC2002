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
  
  
}
