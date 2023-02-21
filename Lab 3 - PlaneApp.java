package Lab3;

import java.util.Scanner;

public class PlaneApp {
	public static void main(String[] args){
		int choice, m, n, i;
		Plane plane = new Plane();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
			
		do {
			System.out.println("Enter the number of your choice: ");
			choice = sc.nextInt();
			switch (choice) {
				case 1: 
					plane.showNumEmptySeats();
					break;
				case 2: 
					plane.showEmptySeats();
					break;
				case 3: 
					plane.showAssignedSeats(true);
					break;
				case 4: 
					plane.showAssignedSeats(false);
					break;
				case 5:
					System.out.println("Assigning Seat ..");
					System.out.println("Please enter SeatID: ");
					m = sc.nextInt();
					System.out.println("Please enter Customer ID: ");
					n = sc.nextInt();
					plane.assignSeat(m,n);
					break;
				case 6:
					System.out.println("Enter SeatID to unassign customer from:");
					i = sc.nextInt();
					plane.unAssignSeat(i);
					System.out.println("Seat Unassigned!");
					break; 
				case 7: System.out.println("Program terminating...");
			}
		}while (choice < 7);
	}

}
