package sce.cz2002.tkl.first;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choice: ");
		String choice = scanner.nextLine().trim();
		
		switch(choice) {
			case "A":
				System.out.println("Action movie fan");
				break;
			case "a":
				System.out.println("Action movie fan");
				break;
			case "C":
				System.out.println("Comedy movie fan");
				break;
			case "c":
				System.out.println("Comedy movie fan");
				break;
			case "D":
				System.out.println("Drama movie fan");
				break;
			case "d":
				System.out.println("Drama movie fan");
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}
