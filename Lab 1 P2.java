package sce.cz2002.tkl.first;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Salary: ");
		int salary = scanner.nextInt();
		System.out.print("Merit points: ");
		byte meritPoint = scanner.nextByte();
		
		if(salary>=500 && salary<=649) {
			if(salary>=600 && meritPoint>=10) {
				System.out.println("Grade B");
			}
			else System.out.println("Grade C");
		
		} else if (salary>=650 && salary<=799) {
			if(salary>=700 && meritPoint>=20) {
				System.out.println("Grade A");
			}
			else System.out.println("Grade B");
		} else if (salary>=800 && salary<899) {
			System.out.println("Grade A");
		}
	}
}
