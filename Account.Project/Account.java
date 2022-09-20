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
	 * @string acctNo - the account number
	 * @double balance - the balance of the account
	 */
	
	private String acctNo;
	private Double balance;
	
	/**
	 * Single Parameter Constructor
	 * @param acctNo - The given account number
	 */
	
	public Account(String acctNo)
	{
		this.setBalance(0);
		this.acctNo = acctNo;
	}
	
	/**
	 * Double Parameter Constructor
	 * @param acctNo - the given account number
	 * @param balance - the given balance
	 */
	
	public Account(String acctNo, double balance)
	{
		this.acctNo = acctNo;
		this.balance = balance;
	}
	
	/**
	 * Get / Set Methods used to call and store values for acctNo and balance
	 * @return AcctNo  for  getAcctNo()
	 * @return Balance for getBalance()
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
	 * Deposit method used to add money to one's account
	 * Updates amount in account after deposit is complete.
	 * @param amount - the amount desired to deposit
	 */
	
	public void deposit(double amount)
	{
		if(amount < 0)
		{
			System.out.println("ERROR: Negative number detected. Cannot deposit negative amount.\n");
		}
		else
		{
			System.out.println(String.format("Balance before deposit (Account #%s): $%.2f\n" + "\nDeposit amount: $%.2f\n" + "\nBalance after deposit: $%.2f\n", this.acctNo, this.balance, amount, this.balance + amount));
			
			this.setBalance(balance + amount);
		}
	}
	
	/**
	 * Withdraw method used to remove money from one's bank account
	 * Updates amount in account after withdraw is complete.
	 * Bounds are set to avoid withdrawing negative money, or more money than is in the account.
	 * Messages will be printed to tell the user what is happening throughout the transaction.
	 * @param amount - the amount desired to withdraw
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
			displayInfo();
			
			System.out.println(String.format("Amount withdrawn: $%.2f", amount));
			
			this.setBalance(balance - amount);
			
			System.out.println(String.format("New Balance: $%.2f" + "\n", this.getBalance()));
		}
	}
	
	/**
	 * Transfer method used to move money from one account to another
	 * Updates amount in both accounts after transfer is complete.
	 * Bounds are set to where we cannot transfer more money than there is in the account.
	 * Bounds are also set to where we cannot withdraw negative money.
	 * @param account - the given account to transfer TO
	 * @param amount - desired amount to be transferred
	 */
	
	public void transfer(Object account, double amount)
	{
		
		if(amount > this.getBalance())
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
			
			this.setBalance(this.balance - amount);
			((Account) account).setBalance(((Account) account).getBalance() + amount);
			
			System.out.println(String.format("Amount after transfer (Account #%s): $%.2f\n" + "Amount after transfer(Account #%s): $%.2f\n", this.getAcctNo(), this.getBalance(), ((Account) account).getAcctNo(), ((Account) account).getBalance()));
		}
	}
	
	/**
	 * displayInfo method used to format the information regarding a given account
	 * Prints account information to the screen in the desired format.
	 */
	
	public void displayInfo()
	{
		System.out.println(String.format("Account number: %s\nCurrent balance: $%.2f\n", acctNo, balance));
	}
	
	/**
	 * toString method used to convert given information into a string and return it to the screen
	 * @return string in the format desired
	 */
	
	public String toString()
	{
		return String.format("Account number: %s\nCurrent balance: $%.2f\n", acctNo, balance);
	}
	
	/**
	 * Equals method used to determine whether two listed accounts are the same or not
	 * Checks to see if the object is an instance of Account type, then if it is, it is compared to the
	 other account in question.
	 * @param account - the given account to compare
	 * @return true or false
	 */
	
	public boolean equals(Object account)
	{
		
		if(account == null)
		{
			return false;
		}
		if(account instanceof Account)
		{
			Account temp = (Account)account;
			return (this.getAcctNo().equals(temp.getAcctNo()) && this.balance.equals(temp.balance));
		}
		else
			return false;
	}
}
