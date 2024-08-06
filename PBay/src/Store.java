
public class Store {

	public static void main(String[] args) {
		
		//Users
		User mike = new User ("Mike Trout");
		User tommy = new User ("Tommy Trombone");
		
		//Items
			//Regular
		Item bat = new Item ("Baseball Bat", 10.00, mike, true);
			//Auction
		AuctionItem toy1 = new AuctionItem ("Super Rare Action Figure", 200.00, tommy, 3);
			//Sale Item
		SaleItem puzzle1 = new SaleItem("10,000-piece puzzle", 100.00, mike, 0.25);
	
		//Actions
			//Mike's
		System.out.println(bat.toString());
		System.out.println(mike);
		mike.updateBalance(500.00);
		System.out.println(mike);
		bat.purchaseItem(mike, -bat.getListCost());
		System.out.println(mike);
		System.out.println(toy1);
		System.out.println(toy1.makeBid(mike, 205.09));
		toy1.advanceDay();
		toy1.advanceDay();
		toy1.getOwner();
		puzzle1.purchaseItem(mike);
		puzzle1.getOwner().getName();
		
	}

}
