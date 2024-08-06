
public class SaleItem extends Item{

	private double discount;
	
	public SaleItem(String name, double cost, User owner, double discount) {
		super (name, cost, owner, true);
		this.discount = discount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getDiscount() {
		double newDiscount = discount * 100;
		String percentage = String.valueOf(newDiscount) + "%";
		return percentage;
	}

	public void purchaseItem (User u) {
		this.purchaseItem(u, getListCost() * discount);
	}
	
}
