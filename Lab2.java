package sce.cz2002.tkl.first;
import java.util.Scanner;
import java.util.Random;
public class Lab2p1 {
	public static void main(String[] args){
		int choice, m, n, result, digit;
		long longNumber, longResult;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			switch (choice) {
				case 1: mulTest();
					break;
				case 2: 
					System.out.println("Enter numerator: ");
					m = sc.nextInt();
					System.out.println("Enter denominator: ");
					n = sc.nextInt();
					System.out.println( m + "/" + n +" = " + divide(m,n));
					break;
				case 3: 
					System.out.println("Enter numerator: ");
					m = sc.nextInt();
					System.out.println("Enter denominator: ");
					n = sc.nextInt();
					System.out.println( m + "%" + n +" = " + modulus(m,n));
					break;
				case 4: 
					System.out.println("Enter positive integer: ");
					n = sc.nextInt();
					result = countDigits(n);
					if(result==-1) {
						System.out.println("n : " + n + " - Error input!!");
					}
					else {
						System.out.println("n : " + n + " - count = " + result);
					}
					break;
				case 5:
					System.out.println("Enter positive integer: ");
					n = sc.nextInt();
					System.out.println("Enter digit: ");
					digit = sc.nextInt();
					result = position(n,digit);
					System.out.println("position = " + result);
					
					break;
				case 6:
					System.out.println("Enter positive number: ");
					longNumber = sc.nextLong();
					longResult = extractOddDigits(longNumber);
					if(longResult==-1) {
						System.out.println("oddDigits = Error input!!");
					}
					else if(longResult==0) {
						System.out.println("oddDigits = -1");
					}
					else {
						System.out.println("oddDigits = " + longResult);
					}
					break; 
				case 7: System.out.println("Program terminating ….");
			}
		}while (choice < 7);
	}
	
	public static void mulTest(){
		int input, answer, counter=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			int a = (int)(Math.random()*9+1);
			int b = (int)(Math.random()*9+1);
			System.out.print("How much is "+a+" times "+b+"? ");
			input = sc.nextInt();
			answer = a*b;
			if(input==answer) {
				counter+=1;
			}
		}
		System.out.println("----------");
		System.out.println( counter +" answers out of 5 are correct.");
	}
	
	public static int divide(int m, int n){
		int quotient=0,k;
		k=m;
		while(true) {			
			if (k<n) {
				break;
			}
			k=k-n;
			quotient++;
		}
		return quotient;
	}
	
	public static int modulus(int m, int n){
		int remainder;
		remainder=m;
		while(true) {			
			if (remainder<n) {
				break;
			}
			remainder-=n;
		}
		return remainder;
	}
	
	public static int countDigits(int n) {
		int count=0;
		if(n>=0) {
			while(n>0) {
				n=n/10;
				count++;
			}
			return count;
		}
		else {
			return -1;
		}
	}
	
	public static int position(int n, int digit) {
		int negativeCase=-1, position=1;
		while(n>0) {
			if(n%10==digit) {
				return position;
			}
			n=n/10;
			position++;
		}
		return negativeCase;
	}
	
	public static long extractOddDigits(long n) {
		long result=0, count=0;
		if(n>0) {
			while(n>0) {
				if(n%2==1) {
					result+=((n%10)*Math.pow(10,count));
					count++;
				}
				n=n/10;
			}
			return result;
		}
		else return -1;
	}

}
