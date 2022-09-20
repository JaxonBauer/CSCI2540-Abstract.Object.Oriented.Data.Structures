/**
 * Jaxon Bauer
 * 
 * Assignment 3 - Savings Account Class
 * 
 * Subclass of Account parent class (SavingsAccount extends Account)
 */

package assg3_bauerj21;

public class SavingsAccount extends Account
{
	/**
	 * Instance Variables
	 * @double interestRate - states the given interest rate for each savings account
	 * @double overdraft - states the overdraft limit allowed to each savings account
	 */
	
	private double interestRate;
	
	/**
	 * Single Parameter Constructor referring to parent class Account
	 * refers to parent class account and creates an object of the subclass SavingsAccount.
	 * Automatically sets the interest rate to 0.
	 * @param acctNo - The given account number
	 */
	
	public SavingsAccount(String acctNo)
	{
		super(acctNo);
		interestRate = 0;
	}
	
	/**
	 * Three Parameter Constructor referring to the parent class Account
	 * refers to parent class account and creates an object of the subclass SavingsAccount.
	 * @param acctNo - The given account number of the newly created savings account
	 * @param balance - The given balance of the newly created savings account
	 * @param interestRate - The given interest rate of the newly created savings account
	 */
	
	public SavingsAccount(String acctNo, double balance, double interestRate)
	{
		super(acctNo, balance);
		this.interestRate = interestRate;
	}
	
	/**
	 * Get / Set methods used to call and store values for interestRate and interest
	 * @return interest rate for getInterestRate
	 */
	
	public Double getInterestRate()
	{
		return this.interestRate;
	}
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	
	/*
	 * addInterest method used to apply interest rate to an account and show the result of the action
	 * Uses getBalance() and getInterestRate() to retrieve balance and interest rate in order
	 to do calculations and print them to the screen.
	 * Updates amount in account after transaction is complete.
	 */
	
	public void addInterest()
	{
		System.out.println(String.format("Balance before interest: $%.2f\nInterest rate: %%%.2f", this.getBalance(), getInterestRate() * 100));
		
		this.setBalance(this.getBalance() * (1 + this.getInterestRate()));
		
		System.out.println(String.format("Balance after interest has been added: $%.2f\n", this.getBalance()));
	}
	
	/**
	 * toString method used to convert given information into a string and return it to the screen
	 * Uses super declaration to call parent method and build upon it.
	 * @return string in the desired format
	 */
	
	public String toString()
	{
		return super.toString() + (String.format("Intereset rate: %%%.2f\n", this.getInterestRate() * 100));
	}
	
	/**
	 * displayInfo method used to format the information regarding a given account
	 * Uses super declaration to call parent method and build upon it.
	 * Prints end result to screen in desired format.
	 */
	
	public void displayInfo()
	{
		System.out.println(super.toString() + String.format("Interest rate: %%%.2f\n", this.getInterestRate() * 100));
	}
}