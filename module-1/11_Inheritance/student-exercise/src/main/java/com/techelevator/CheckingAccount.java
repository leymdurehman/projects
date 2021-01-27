package com.techelevator;

public class CheckingAccount  extends BankAccount{

	
//public CheckingAccount() {
	
//	super();

	
	
	
public CheckingAccount (String accountHolderName, String accountNumber) {
	
super(accountHolderName, accountNumber);	
	
	
}
	
public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
super(accountHolderName, accountNumber, balance);
	
	
	
}	


@Override
public int withdraw(int amountToWithdraw) {
	
	
	
	int withdrawnBal = getBalance()- amountToWithdraw;
	

	
		if (  withdrawnBal < 0 && withdrawnBal > -100) {
			
			super.withdraw(amountToWithdraw + 10);	
			
			return this.getBalance();	
			
		} if (withdrawnBal > 0) {
		  
			super.withdraw(amountToWithdraw);	
			return this.getBalance();
			
		}  else			
				return this.getBalance();
		  
       
	//super.withdraw(amountToWithdraw);	
		
		
			}			




















	
}
