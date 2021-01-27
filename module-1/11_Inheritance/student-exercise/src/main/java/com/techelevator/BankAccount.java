package com.techelevator;

public class BankAccount {

	
	
	
	
	
private String accountHolderName;	
	
private String accountNumber;

private int balance;
	
// constructor

public BankAccount(String accountHolderName, String accountNumber) {
	
this.accountHolderName = accountHolderName;	
this.accountNumber = accountNumber;	
	
	
}

public BankAccount (String accountHolderName, String accountNumber, int balance) {

	this.accountHolderName = accountHolderName;	
	this.accountNumber = accountNumber;	
	this.balance = balance;	
	
	
	
}
	
public String getAccountHolderName() {
	
	return this.accountHolderName;
	
}


public String getAccountNumber() {
	
	return this.accountNumber;
}

public int getBalance() {
	
	return this.balance;
}


//methods

public int deposit(int amountToDeposit) {
	
	this.balance = getBalance() + amountToDeposit;
	return this.getBalance();
	
}


public int withdraw(int amountToWithdraw) {
	
	this.balance = getBalance() - amountToWithdraw;
	

			
	return this.balance;
}























	
	
	
}
