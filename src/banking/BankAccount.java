package banking;

/*
 * represents a checking/saving bank account for a customer
 * @author Kai Cheng
 */

public class BankAccount {

	//instance variables
	
	/*
	 * type of account (checking/savings)
	 */
	String accountType;
	
	/*
	 * balance for bank account
	 */
	double balance;
	
	/*
	 * customer for this account 
	 */
	Customer customer;
	
	//constructor
	
	/*
	 * creates a bank account of given type for given customer
	 * @param accountType for bank account
	 * @param customer for bank account
	 */
	
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	//method
	
	/*
	 * deposits the given amount
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	/*
	 * withdraws the given amount from balance
	 * @param amount to withdraw
	 * @throw Exception if given amount is larger than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance -= amount;
	}
	
	/*
	 * returns account type and balance for this bank account
	 * @return string with all the info
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	/*
	 * return the customer name and address for this bank account
	 * @return string with all the info
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
}
