package book1.ch06.classes_and_objects;

public class Account {
	private double balance;
	
	public double getBalance() {
		// Return the balance of this account
		return this.balance;
	}
	
	public int credit(double amount) {
		// Make sure credit amount is valid
		if (!this.isValidAmount(amount, "credit")) {
			return -1;
		}
		
		// Credit the amount
		System.out.println("Crediting amount: " + amount);
		this.balance = this.balance + amount;
		return 1;
	}
	
	public int debit(double amount) {
		/// Make sure debit amount is valid
		if (!this.isValidAmount(amount, "debit")) {
			return -1;
		}
		
		// Make sure a minimum balance of zero is maintained
		if (this.balance < amount) {
			System.out.println("Insufficient fund. Debit attempted: " + amount);
			return -1;
		}
		
		// Debit the amount
		System.out.println("Debiting amount: " + amount);
		this.balance = this.balance - amount;
		return 1;
	}
	
	// Use a private method to validate credit/debit amount
	private boolean isValidAmount(double amount, String operation) {
		// Make sure amount is not negative, NaN or infinity
		if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
			System.out.println("Invalid " + operation + " amount: " + amount);
			return false;
		}
		return true;
	}
}
