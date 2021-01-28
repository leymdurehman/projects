package com.techelevator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;




public class BankCustomer{

	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>();
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public List<Accountable> getAccounts() {
		
	
		
		return this.accounts;
	}

	
	
	public void addAccount(Accountable newAccount) {
		
		accounts.add(newAccount);
	
	}
	
	
	
	

	public boolean isVip() {
			
		int totalBal=0;
		int balanceFromAccountable = 0; 
		for (Accountable account : this.accounts) {
			balanceFromAccountable = account.getBalance();  	
		totalBal = totalBal +	balanceFromAccountable;
			if (balanceFromAccountable >= 25000) {
				return true;}
			
		}  if (totalBal >= 25000) {
		return true;}
		
	
	
	return false;
	

	
}
	
	
	
	
	
	
}