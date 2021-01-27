package com.techelevator;
public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	

@Override
public int withdraw(int amountToWithdraw) {

		
		if ((this.getBalance() - amountToWithdraw) < 150 && 
				this.getBalance() - amountToWithdraw > 0) {
			super.withdraw(amountToWithdraw + 2);
			return this.getBalance();
		}
		if (this.getBalance() < amountToWithdraw) {
			return this.getBalance();
		}
		
		if (this.getBalance() > (this.getBalance() - amountToWithdraw)) {
			super.withdraw(amountToWithdraw);
			return this.getBalance();
		}

	else
		
		return this.getBalance();
	}
}