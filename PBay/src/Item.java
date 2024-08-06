
public class Item {

	private String name;
	private double listCost;
	private User  owner;
	private boolean forSale;
	
	public Item(String name, double cost, User owner, boolean forSale) {
		this.name = name;
		this.listCost = cost;
		this.owner = owner;
		this.forSale = forSale;
		
		this.listCost = Math.round (listCost * 100.00) / 100.00;
	}
	
	public String getName() {
		return name;
	}	
	
	public double getListCost() {
		return listCost;
	}
	
	public User getOwner() {
		return owner;
	}	

	public boolean getForSale() {
		return forSale;
	}	
	
	public void setOwner(User owner) {
		this.owner = owner;
	}	
	
	public void setListCost(double listCost) {
		this.listCost = listCost;
	}

	public void toggleForSale(boolean forSale) {
		this.forSale = forSale;
	}

	public void purchaseItem (User u, double p) { //Should this be void?
		u.updateBalance(p);
		setOwner(u);
		toggleForSale(false);
	}
	
	public String toString () {
		String s = getName() +  " ($" + getListCost() + " - " + getOwner().getName() + ")";  
		return s;
	}



}
