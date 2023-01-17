package sce.cz2002.tkl.first;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("starting: ");
		float starting = scanner.nextFloat();
		System.out.print("ending: ");
		float ending = scanner.nextFloat();
		System.out.print("increment: ");
		float increment = scanner.nextFloat();
		
		System.out.println("US$ \t S$");
		System.out.println("---------------");
		for (float i=starting; i<=ending; i=i+increment) {
			double j = (double)i * 1.82;
			System.out.println((int)i + "\t" +j);
		}
		
		System.out.println("US$ \t S$");
		System.out.println("---------------");
		float placeholder = starting;
		while(placeholder<=ending) {
			double j = (double)placeholder * 1.82;
			System.out.println((int)placeholder + "\t" +j);
			placeholder=placeholder+increment;
		}
		
		if(ending<starting) {
			System.out.println("Error!");
		} else {
			System.out.println("US$ \t S$");
			System.out.println("---------------");
			float placeholder2 = starting;
			do{
				double j = (double)placeholder2 * 1.82;
				System.out.println((int)placeholder2 + "\t" +j);
				placeholder2=placeholder2+increment;
			}while(placeholder2<=ending) ;
		}
		
	}
}
