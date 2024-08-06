
public class User {

	private String name;
	private double accountBalance;
	
	public User (String name) {
		this.name = name;
		accountBalance = 0.00;
	}
	
	public String getName() {
		return name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public double updateBalance (double amount) {
		accountBalance += amount;
		return accountBalance;
	}

	public String toString () {
		String s = getName() + "'s" + " balance is" + " $" + getAccountBalance();
		return s;
	}
}
