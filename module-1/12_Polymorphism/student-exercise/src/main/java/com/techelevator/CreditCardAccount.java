package com.techelevator;

public class CreditCardAccount implements Accountable {

	
	
private	String accountHolder;
private String accountNumber;
private int debt;


public CreditCardAccount (String accountHolder, String accountNumber) {
	
this.accountHolder = accountHolder;	
this.accountNumber = accountNumber;	
	
	
};



public String getAccountHolder() {
	return accountHolder;
}

public String getAccountNumber() {
	return accountNumber;
}

public int getDebt() {
	return debt;
}


@Override
public int getBalance() {
	
	return (getDebt() * -1);
}
	
public int pay(int amountToPay) {
	this.debt = getDebt() - amountToPay;
	
	return this.debt;
	
}

public int charge(int amountToCharge) {
	
	this.debt = getDebt() + amountToCharge;
	
	return this.debt;
}








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
