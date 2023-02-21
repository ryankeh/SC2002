package Lab3;

public class PlaneSeat {
	private int seatId;
	private boolean assigned;
	private int customerId;
	
	public PlaneSeat(int seatId) {
		this.seatId = seatId;
		this.assigned = false;
	}
	
	public int getSeatID() {
		return seatId;
	}
	
	public int getCustomerID() {
		return customerId;
	}
	
	public boolean isOccupied() {
		return assigned;
	}
	
	public void assign(int customerId) {
		this.customerId = customerId;
		this.assigned = true;
	}
	
	public void unAssign() {
		this.customerId = 0;
		this.assigned = false;
	}
}
