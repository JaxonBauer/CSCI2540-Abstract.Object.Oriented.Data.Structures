/**
 * Jaxon Bauer
 * 
 * Assignment 3 - Account Class
 * 
 * Parent class for Checking Account and Savings Account
 */

package assg3_bauerj21;

public class Account 
{
	
	/**
	 * Private Instance Variables
	 */
	private String acctNo;
	private Double balance;
	
	/**
	 * Single Parameter Constructor
	 */
	public Account(String acctNo)
	{
		this.balance = 0.0;
		this.acctNo = acctNo;
	}
	
	/**
	 * Double Parameter Constructor
	 */
	
	public Account(String acctNo, double balance)
	{
		this.acctNo = acctNo;
		this.balance = balance;
	}
	
	/**
	 * Get / Set Methods used to call and store values for acctNo and balance
	 */
	public String getAcctNo()
	{
		return this.acctNo;
	}
	
	public Double getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	/**
	 * Deposit method used to add money to one's account.
	 */
	public void deposit(double amount)
	{
		if(amount < 0)
		{
			System.out.println("ERROR: Negative number detected. Cannot deposit negative amount.");
		}
		else
		{
			System.out.println(String.format("Balance before deposit: $%.2f\n" + "\nDeposit amount: $%.2f\n" + "\nBalance after deposit: $%.2f\n", this.balance, amount, this.balance + amount));
		}
	}
	
	/**
	 * Withdraw method used to remove money from one's bank account.
	 * Does not change the original value of the object.
	 * Bounds are set to avoid withdrawing negative money, or more money than is in the account.
	 * Messages will be printed to tell the user what is happening throughout the transaction.
	 */
	
	public void withdraw(double amount)
	{
		this.getBalance();
		
		if(amount > balance)
		{
			System.out.print("ERROR: Desired amount to be withdrawn exceeds balance of account. ");
			System.out.println("Transaction could not be completed.\n");
		}
		else if(amount < 0)
		{
			System.out.println("ERROR: Negative amount detected. Cannot withdraw negative amount.\n");
		}
		else
		{
			System.out.println(displayInfo());
			System.out.println(String.format("Amount withdrawn: $%.2f", amount));
			System.out.println(String.format("New Balance: $%.2f" + "\n", balance - amount));
		}
	}
	
	/**
	 * Transfer method used to move money from one account to another while not changing original values.
	 * Bounds are set to where we cannot transfer more money than there is in the account.
	 * Bounds are also set to where we cannot withdraw negative money.
	 */
	
	public void transfer(Object account, double amount)
	{	
		this.getBalance();
		
		if(amount > balance)
		{
			System.out.print("ERROR: Desired amount to be transferred exceeds balance of account.");
			System.out.println("Transaction could not be completed.\n");
		}
		else if(amount < 0)
		{
			System.out.println("ERROR: Negative amount detected. Cannot transfer negative amount.\n");
		}
		else
		{
			System.out.println(String.format("Amount before transfer (Account #%s): $%.2f\n" + "Amount before transfer(Account #%s): $%.2f\n" + "\nAmount transferred: $%.2f\n", this.getAcctNo(), this.getBalance(), ((Account) account).getAcctNo(), ((Account) account).getBalance(),  amount));
			System.out.println(String.format("Amount after transfer (Account #%s): $%.2f\n" + "Amount after transfer(Account #%s): $%.2f\n", this.getAcctNo(), this.getBalance() - amount, ((Account) account).getAcctNo(), ((Account) account).getBalance() + amount));
		}
	}
	
	/**
	 * displayInfo method used to format the information regarding a given account.
	 */
	
	public String displayInfo()
	{
		return String.format("Account number: " + this.acctNo + "\n" + "Current balance: $%.2f\n", this.balance);
	}
	
	/**
	 * toString method used to convert given information into a string and return it to the screen.
	 */
	
	public String toString()
	{
		return displayInfo();
	}
	
	/**
	 * Equals method used to determine whether two listed accounts are the same or not.
	 */
	
	public boolean equals(Object account)
	{
		
		if(this.getAcctNo() == ((Account) account).getAcctNo())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
