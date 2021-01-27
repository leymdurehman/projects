package com.techelevator;
public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
	
	
	// Methods
	// if this.getbalance < 150, this.withdraw + 2
	// if this.withdraw > this.balance return this.balance
	
	@Override
	public int withdraw(int amountToWithdraw) {
		
		int serviceCharge = 2;
		
		if ((this.getBalance() - amountToWithdraw) < 150 && 
				this.getBalance() - amountToWithdraw > 0) {
			super.withdraw(amountToWithdraw + serviceCharge);
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