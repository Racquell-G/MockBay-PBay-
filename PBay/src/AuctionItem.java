
public class AuctionItem extends Item{

	private int daysLeft;
	private double currentBid;
	private User highBidder;
	
	public AuctionItem(String name, double cost, User currentOwner,  int days) {
		super (name, cost, currentOwner, true);
		daysLeft = days;
		this.currentBid = getListCost();
		this.highBidder = null;
	}
	
	public int getDaysLeft() {
		return daysLeft;
	}

	public double getCurrentBid() {
		return currentBid;
	}

	public void advanceDay () {
		if (getForSale() == true && daysLeft == 0) {
			getOwner().updateBalance(currentBid);
			highBidder.updateBalance(-currentBid);
			setOwner(highBidder);	
		} else if (getForSale() == true && daysLeft > 0) {
			daysLeft--;
		} else {
			
		}
	}
	
	public String makeBid (User u, double bid) {
		if (getForSale() == true && bid  > getCurrentBid()) {
			highBidder = u;
			currentBid = bid;
		}
		return this.highBidder.getName();
	}
	
	public void resetAuction (double startAmount, int numDaysLeft) {
		if (highBidder.equals(null) ) {
			currentBid = startAmount;
			daysLeft = numDaysLeft;
		}
	}
	
	public String toString () {
		if (getForSale() == true) {
			String s = this.getName() + " ($" + this.getListCost() + ", " + this.getOwner().getName() + ", " + this.getDaysLeft() + " days left)";
			return s;
		} else {
			String s = this.getName() + " ($" + this.getListCost() + ", none, " + this.getDaysLeft() + " days left)";
			return s;
		}
		
	}

}
