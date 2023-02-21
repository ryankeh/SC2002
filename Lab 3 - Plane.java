package Lab3;

public class Plane {
	private int numEmptySeat=12;
	int i, j, counter=0;
	private PlaneSeat[] seat = new PlaneSeat[12];
	private PlaneSeat[] sortSeat = new PlaneSeat[12];
	
	public Plane() {
		for(i=0;i<12;i++){
			seat[i] = new PlaneSeat(i+1);
		}
	}
	
	public void sortSeats() {
		for(i=0;i<12;i++) {
			sortSeat[i] = seat[i];
		}
		for(j=0;j<11;j++) {
			for(i=0;i<11;i++) {
				if(sortSeat[i].getCustomerID() > sortSeat[i+1].getCustomerID()) {
					PlaneSeat temp = sortSeat[i];
					sortSeat[i] = sortSeat[i+1];
					sortSeat[i+1] = temp;				
				}
			}
		}

		return;
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are "+ numEmptySeat +" empty seats");
		return;
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty:");
		for(i=0;i<12;i++) {
			if(seat[i].isOccupied()==false) {
				System.out.println("SeatID " + seat[i].getSeatID());
			}
		}
		return ;
	}
	
	public void showAssignedSeats(boolean bySeatId) {
		if(bySeatId) {
			for(i=0;i<12;i++) {
				if(seat[i].isOccupied()){
					System.out.println("SeatID " + seat[i].getSeatID()+ " assigned to CustomerID " + seat[i].getCustomerID()+".");
				}
			}
		}
		else {
			sortSeats();
			for(i=0;i<12;i++) {
				if(sortSeat[i].isOccupied()){
					System.out.println("SeatID " + sortSeat[i].getSeatID()+ " assigned to CustomerID " + sortSeat[i].getCustomerID()+".");
				}
			}
			return ;
		}
	}
	
	public void assignSeat(int seatId, int customerId) {
		if(seat[seatId-1].isOccupied()){
			System.out.println("Seat already assigned to a customer.");
			return;
		}
		seat[seatId-1].assign(customerId);
		numEmptySeat--;
		System.out.println("Seat Assigned!");
		return;
	}
	
	public void unAssignSeat(int seatId) {
		seat[seatId-1].unAssign();
		numEmptySeat++;
		return;
	}

}
