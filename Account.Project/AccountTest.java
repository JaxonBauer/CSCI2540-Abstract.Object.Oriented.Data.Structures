/**
 * Jaxon Bauer
 * 
 * Assignment 3 - Account Test Class
 * 
 * Test cases for all classes, separated using divideLine method and printing what method is being
 used, as well as what class it is being called from to make it easier to read and grade.
 */

package assg3_bauerj21;

public class AccountTest 
{
	
	/**
	 * Used to divide each test case to make it easier to read.
	 * Prints a line of asterisks with space on both sides of the line printed. 
	 */
	
	public static void divideLine()
	{
		System.out.println("*********************************************************************************************************\n");
	}
	
	
	/**
	 * Main Method where all test cases are stored, showing how everything from
	 Account, CheckingAccount, and SavingsAccount work.
	 */
	
	public static void main(String arg[])
	{
		
		/**
		 * List of objects used for each class's test cases.
		 * 
		 * Account - a1 through a6
		 * 
		 * CheckingAccount - b1 through b6
		 * 
		 * SavingsAccount - c1 through c6
		 */
		
		/**
		 * Account Test Objects
		 * Creates 6 new accounts to use as test cases for the Account class.
		 */
		
		Account a1 = new Account("01");
		Account a2 = new Account("02");
		Account a3 = new Account("03");
		
		Account a4 = new Account("04", 50000);
		Account a5 = new Account("05", 75000);
		Account a6 = new Account("06", 450000);
		
		/**
		 * CheckingAccount Test Objects
		 * Creates 6 new checking accounts to use as test cases for the CheckingAccount class.
		 */
		
		CheckingAccount b1 = new CheckingAccount("07");
		CheckingAccount b2 = new CheckingAccount("08");
		CheckingAccount b3 = new CheckingAccount("09");
		
		CheckingAccount b4 = new CheckingAccount("10", 375000, 2000);
		CheckingAccount b5 = new CheckingAccount("11", 220000, 1000);
		CheckingAccount b6 = new CheckingAccount("12", 108000, 3000);
		
		/**
		 * SavingsAccount Test Objects
		 * Creates 6 new savings accounts to use as test cases for the SavingsAccount class.
		 */
		
		SavingsAccount c1 = new SavingsAccount("13");
		SavingsAccount c2 = new SavingsAccount("14");
		SavingsAccount c3 = new SavingsAccount("15");
		
		SavingsAccount c4 = new SavingsAccount("16", 405000, 0.0621);
		SavingsAccount c5 = new SavingsAccount("17", 207000, 0.125);
		SavingsAccount c6 = new SavingsAccount("18", 38000, -0.05);

		
/**
 * Account Test Cases
 */
		
		/**
		 * deposit method for Account class
		 * Takes a deposit amount and applies it to a given account.
		 * Updates balance after transaction is completed.
		 */
		
		System.out.println("\n\n***ACCOUNT CLASS DEPOSIT METHOD***\n\n");
		
		a1.deposit(0);
		divideLine();
		a2.deposit(-3000);
		divideLine();
		a3.deposit(50000);
		divideLine();
		a4.deposit(4086.34);
		divideLine();
		
		/**
		 * Withdraw method for Account class
		 * Takes a withdraw amount and applies it to a given account.
		 * Updates balance after transaction is completed.
		 */
		
		System.out.println("\n\n***ACCOUNT CLASS WITHDRAW METHOD***\n\n");
		
		a1.withdraw(3000.34);
		divideLine();
		a2.withdraw(-4000.09);
		divideLine();
		a4.withdraw(3000.23);
		divideLine();
		a5.withdraw(-4000.54);
		divideLine();
		a6.withdraw(0);
		divideLine();
		
		/**
		 * transfer method for Account class
		 * Used for withdrawing money from one account, and depositing it into another.
		 * Updates balance of both accounts after transaction is completed.
		 */
		
		System.out.println("\n\n***ACCOUNT CLASS TRANSFER METHOD***\n\n");
		
		a4.transfer(a6, 4000);
		divideLine();
		a5.transfer(a4, 9862.48);
		divideLine();
		a2.transfer(a5, 3000.0);
		divideLine();
		a5.transfer(a4, -4000.0);
		divideLine();
		
		/**
		 * displayInfo method for Account class
		 * Used to print a string to the screen in the desired format.
		 */
		
		System.out.println("\n\n***ACCOUNT CLASS DISPLAY INFO METHOD***\n\n");
		
		a6.displayInfo();
		divideLine();
		a4.displayInfo();
		divideLine();
		a5.displayInfo();
		divideLine();
		a2.displayInfo();
		divideLine();
		
		/**
		 * toString method for Account class
		 * formats the string and prints to the screen.
		 */
		
		System.out.println("\n\n***ACCOUNT CLASS TO STRING METHOD***\n\n");
		
		divideLine();
		System.out.println(a1.toString());
		divideLine();
		System.out.println(a2.toString());
		divideLine();
		System.out.println(a3.toString());
		divideLine();
		System.out.println(a4.toString());
		divideLine();
		System.out.println(a5.toString());
		divideLine();
		System.out.println(a6.toString());
		divideLine();
		
		/**
		 * equals method used to determine if two given accounts are the same or not
		 */
		
		System.out.println("\n\n***ACCOUNT CLASS EQUALS METHOD***\n\n");
		
		System.out.println(String.format("Account #%s = Account #%s (true or false):\t%b\n", a1.getAcctNo(), a1.getAcctNo(), a1.equals(a1)));
		divideLine();
		System.out.println(String.format("Account #%s = Account #%s (true or false):\t%b\n", a1.getAcctNo(), a6.getAcctNo(), a1.equals(a6)));
		divideLine();
		
/**
 * CheckingAccount Test Cases
 */
		
		/**
		 * toString method for Account class
		 * formats the string and prints to the screen
		 * used to show savings account information
		 */
		
		System.out.println("\n\n***CHECKING ACCOUNT CLASS TO STRING METHOD***\n\n");
		
		System.out.println(b1.toString());
		divideLine();
		System.out.println(b2.toString());
		divideLine();
		System.out.println(b3.toString());
		divideLine();
		System.out.println(b4.toString());
		divideLine();
		System.out.println(b5.toString());
		divideLine();
		System.out.println(b6.toString());
		divideLine();
		
		/**
		 * withdraw method used for CheckingAccount class
		 * takes an amount out of the given account
		 * does not change original account values
		 */
		
		System.out.println("\n\n***CHECKING ACCOUNT CLASS WITHDRAW METHOD***\n\n");
		
		b1.withdraw(3000.34);
		divideLine();
		b3.withdraw(-4000.09);
		divideLine();
		b4.withdraw(30000);
		divideLine();
		b6.withdraw(109000.43);
		divideLine();
		
		/**
		 * transfer method used for CheckingAccount class
		 * used to transfer money from one account to another
		 * does not change original account values
		 */
		
		System.out.println("\n\n***CHECKING ACCOUNT CLASS TRANSFER METHOD***\n\n");
		
		b1.transfer(b4, 1000);
		divideLine();
		b2.transfer(b4, -1000);
		divideLine();
		b5.transfer(b4, 222000);
		divideLine();
		b6.transfer(b1, 1090);
		divideLine();
		b4.transfer(b5, 1000);
		divideLine();
		
		/**
		 * transfer method from checking account to savings account, as well as from a savings account
		 to a checking account.
		 */
		
		b4.transfer(c1, 200);
		divideLine();
		c1.transfer(b3, 100);
		divideLine();
		
		/**
		 * displayInfo method used for CheckingAccount class
		 * overrides parent class Account's displayInfo method
		 * used to show the checking account information
		 */
		
		System.out.println("\n\n***CHECKING ACCOUNT CLASS DISPLAY INFO METHOD***\n\n");
		
		b1.displayInfo();
		divideLine();
		b2.displayInfo();
		divideLine();
		b3.displayInfo();
		divideLine();
		b4.displayInfo();
		divideLine();
		b5.displayInfo();
		divideLine();
		b6.displayInfo();
		divideLine();
		
/**
 * SavingsAccount Test Cases
 */
		
		/**
		 * toString method used for SavingsAccount class
		 * overrides parent class Account's toString method
		 * used to show the savings account information
		 */
		
		System.out.println("\n\n***SAVINGS ACCOUNT CLASS TO STRING METHOD***\n\n");
		
		System.out.println(c1.toString());
		divideLine();
		System.out.println(c2.toString());
		divideLine();
		System.out.println(c3.toString());
		divideLine();
		System.out.println(c4.toString());
		divideLine();
		System.out.println(c5.toString());
		divideLine();
		System.out.println(c6.toString());
		divideLine();
		
		/**
		 * addInterest method used for SavingsAccount
		 * used to calculate interest on a given account
		 * does not change original account values
		 */
		
		System.out.println("\n\n***SAVINGS ACCOUNT CLASS ADD INTEREST METHOD***\n\n");
		
		c1.addInterest();
		divideLine();
		c2.addInterest();
		divideLine();
		c3.addInterest();
		divideLine();
		c4.addInterest();
		divideLine();
		c5.addInterest();
		divideLine();
		c6.addInterest();
		divideLine();
		
		/**
		 * displayInfo method used for SavingsAccount
		 * overrides parent class Account's toString method
		 * used to show the savings account information
		 */
		
		System.out.println("\n\n***SAVINGS ACCOUNT CLASS DISPLAY INFO METHOD***\n\n");
		
		c1.displayInfo();
		divideLine();
		c2.displayInfo();
		divideLine();
		c3.displayInfo();
		divideLine();
		c4.displayInfo();
		divideLine();
		c5.displayInfo();
		divideLine();
		c6.displayInfo();
		divideLine();
	}
}
