/**
 * Jaxon Bauer
 * 
 * Assignment 3 - Savings Account Class
 * 
 * Subclass of Account parent class
 */

package assg3_bauerj21;

public class SavingsAccount extends Account
{
	/**
	 * Instance Variables
	 */
	
	private static double interestRate;
	static double overdraft = 0;
	
	/**
	 * Single Parameter Constructor referring to parent class Account
	 */
	
	public SavingsAccount(String acctNo)
	{
		super(acctNo);
		interestRate = 0;
	}
	
	/**
	 * Three Parameter Constructor referring to the parent class Account
	 */
	
	public SavingsAccount(String acctNo, double balance, double interestRate)
	{
		super(acctNo, balance);
		SavingsAccount.interestRate = interestRate;
	}
	
	/**
	 * Get / Set methods used to call and store values for interestRate and interest
	 */
	
	public double getInterestRate()
	{
		return SavingsAccount.interestRate;
	}
	
	public void setInterestRate(double interestRate)
	{
		SavingsAccount.interestRate = interestRate;
	}
	
	public void addInterest()
	{
		System.out.println(String.format("Balance before interest: $%.2f\nInterest rate: %%%.2f", this.getBalance(), getInterestRate() * 100));
		System.out.println(String.format("Balance after interest has been added: $%.2f\n", this.getBalance() * (1 + this.getInterestRate())));
	}
	
	/**
	 * toString method used to convert given information into a string and return it to the screen
	 */
	
	public String toString()
	{
		return displayInfo();
	}
	
	/**
	 * displayInfo method used to format the information regarding a given account
	 */
	
	public String displayInfo()
	{
		return String.format("Account number: %s\n" + "Current balance: $%.2f\n" + "Interest rate: %%%.2f\n", this.getAcctNo(), this.getBalance(), this.getInterestRate() * 100);
	}
}