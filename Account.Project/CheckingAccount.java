/**
 * Jaxon Bauer
 * 
 * Assignment 3 - Checking Account Class
 * 
 * Subclass of Account parent class (CheckingAccount extends Account)
 */

package assg3_bauerj21;

public class CheckingAccount extends Account
{
	/**
	 * Instance Variables
	 * @double overdraft - states the overdraft limit allowed to each account
	 * @double fee - a static value that states the fee for overdraft on each account
	 */
	
	private double overdraft;
	static double fee = 20.0;
	
	/**
	 * Single Parameter Constructor referring to parent class Account
	 * refers to parent class account and creates an object of the subclass CheckingAccount
	 * sets overdraft and balance to 0 automatically
	 * @param acctNo - The account number for each account
	 */
	
	public CheckingAccount(String acctNo)
	{
		super(acctNo);
		this.setBalance(0);
		this.setOverdraft(0);
	}
	
	/**
	 * Three Parameter Constructor referring to parent class Account
	 * refers to parent class account and creates an object of the subclass CheckingAccount
	 * @param acctNo - The account number for each account
	 * @param balance - The stated balance for the newly created account
	 * @param overdraft - the overdraft amount allowed to the newly created account
	 */
	
	public CheckingAccount(String acctNo, double balance, double overdraft)
	{
		super(acctNo);
		this.setBalance(balance);
		this.setOverdraft(overdraft);
	}
	
	/**
	 * Get / Set methods used to call and store values for overdraft and fee.
	 * @return overdraft amount for getOverdraft()
	 * @return fee amount for getFee()
	 */
	
	public Double getOverdraft()
	{
		return this.overdraft;
	}
	
	public void setOverdraft(double overdraft)
	{
		this.overdraft = overdraft;
	}
	
	public double getFee()
	{
		return CheckingAccount.fee;
	}
	
	public void setFee(double fee)
	{
		CheckingAccount.fee = fee;
	}
	
	/**
	 * toString method used to convert given information into a string and return it to the screen.
	 * Uses super declaration to call parent method and build upon it.
	 * @return string in the desired format
	 */
	
	public String toString()
	{
		return super.toString() + (String.format("Overdraft amount: $%.2f\n", this.overdraft));
	}
	
	/**
	 * Withdraw method used to take a given amount of money out of one's account.
	 * Updates amount in account after withdraw is complete.
	 * Bounds are set to avoid withdrawing negative money, or more money than is in the account.
	 * Messages will be printed to tell the user what is happening throughout the transaction.
	 * @param amount - amount desired to be withdrawn from the account
	 */
	
	public void withdraw(double amount)
	{
		if (amount < 0)
		{
			System.out.println("ERROR: Negative number detected. Cannot withdraw negative amount.\n");
		}
		else if(amount > this.getBalance() + this.getOverdraft())
		{
			System.out.println("ERROR: Desired amount exceeds the overdraft limit.");
			System.out.println("Transaction cannot be completed.\n");
		}
		else if (amount > this.getBalance() && amount < this.getBalance() + this.getOverdraft())
		{
			displayInfo();
			System.out.println(String.format("Transaction will be charged the overdraft fee of $%.2f\n", this.getFee()));
			System.out.println(String.format("Amount withdrawn: $%.2f\n", amount));
			
			this.setBalance(this.getBalance() - amount - getFee());
			
			System.out.println(String.format("New Balance: $%.2f\n", this.getBalance()));
		}
		else if (amount < this.getBalance())
		{
			displayInfo();
			System.out.println(String.format("Amount withdrawn: $%.2f\n", amount));
			
			this.setBalance(this.getBalance() - amount);
			
			System.out.println(String.format("New Balance: $%.2f\n", this.getBalance()));
		}
	}
	
	/**
	 * Transfer method used to move money from one account to another
	 * Bounds are set to where we cannot transfer more money than the overdraft limit allows.
	 * Bounds are also set to where we cannot withdraw negative money.
	 * We can have a negative value for our balance, but only if it stays under the allowed overdraft limit.
	 * The overdraft fee for each account is $20.00.
	 * @param account - the account object that we are transferring money to
	 * @param amount - the amount desired to be transferred
	 */
	
	public void transfer(Object account, double amount)
	{
		if(amount > this.getBalance() + this.getOverdraft())
		{
			System.out.println("ERROR: Desired amount exceeds the overdraft limit.");
			System.out.println("Transaction cannot be completed.\n");
		}
		else if(amount > this.getBalance() && amount < this.getBalance() + this.getOverdraft())
		{
			System.out.println(String.format("Amount before transfer (Account #%s): $%.2f", this.getAcctNo(), this.getBalance())); 
			System.out.println(String.format("Amount before transfer (Account #%s): $%.2f\n" + "\nAmount transferred: $%.2f\n", ((Account) account).getAcctNo(), ((Account) account).getBalance(),  amount));
			System.out.println(String.format("Transaction will be charged the overdraft fee of $%s\n", this.getFee()));
			
			this.setBalance(this.getBalance() - amount - fee);
			
			((Account) account).setBalance(((Account) account).getBalance() + amount);
			
			System.out.println(String.format("Amount after transfer (Account #%s): $%.2f", this.getAcctNo(), this.getBalance()));
			System.out.println(String.format("Amount after transfer (Account #%s): $%.2f\n", ((Account) account).getAcctNo(), ((Account) account).getBalance()));
		}
		else if (amount > 0 && amount < this.getBalance())
		{
			System.out.println(String.format("Amount before transfer (Account #%s): $%.2f", this.getAcctNo(), this.getBalance())); 
			System.out.println(String.format("Amount before transfer (Account #%s): $%.2f\n" + "\nAmount transferred: $%.2f\n", ((Account) account).getAcctNo(), ((Account) account).getBalance(),  amount));
			
			this.setBalance(this.getBalance() - amount);
			
			((Account) account).setBalance(((Account) account).getBalance() + amount);
			
			System.out.println(String.format("Amount after transfer (Account #%s): $%.2f", this.getAcctNo(), this.getBalance()));
			System.out.println(String.format("Amount after transfer (Account #%s): $%.2f\n", ((Account) account).getAcctNo(), ((Account) account).getBalance()));
		}
		else
		{
			System.out.println("ERROR: Negative number detected. Cannot transfer negative amount.\n");
		}
	}
	
	/**
	 * displayInfo method used to format the information regarding a given account.
	 * Uses super declaration to call parent method and build upon it.
	 * @return string in the desired format
	 */
	
	public void displayInfo()
	{
		System.out.println(super.toString() + String.format("Overdraft limit: $%.2f" + "\n", this.getOverdraft()));
	}
	
}
