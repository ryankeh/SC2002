package sce.cz2002.tkl.first;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("height: ");
		byte height = scanner.nextByte();
		
		if(height==0) {
			System.out.print("Error input!!");
		}
		else {
			for (int i=1; i<=height; i++) {
				for (int j=i; j>0; j--) {
					if(j%2==1) {
						System.out.print("AA");
					}
					else if(j%2==0) {
						System.out.print("BB");
					}
				}
				System.out.print("\n");
			}
		}
	}
}
