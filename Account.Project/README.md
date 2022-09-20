***ACCOUNT PROJECT***

This project implements the use of parent class / subclass relationships, as well as overriding methods. It does not take user input. Instead, we make multiple test
objects to verify that all methods of each class are working properly and storing necessary values.

***Account Class***

* The parent class for the program.
* Uses multiple different constructors to create new objects of "Account" type.
* Includes methods such as deposit, withdraw, transfer, displayInfo, toString, and equals to perform different operations and save the results.

***Checking Account class***

* A subclass of "Account" class.
* Uses multiple different constructors to create new accounts of "CheckingAccount" type.
* Includes the same methods as the Account class, but overrides the parent methods to accomodate the need for other values in this new account type.

***Savings Account class***

* A subclass of "Account" class.
* Uses multiple different constructors to create new accounts of "SavingsAccount" type.
* Includes a new method called addInterest that shows the new balance of the account after annual interest is applied.
* overrides parent methods to accomodate the need for other values in this new account type.
