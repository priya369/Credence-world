package com.bank.bankapp;

public class BankProcess extends account{
public BankAccount []accounts;
public int numofAccounts;
public BankProcess() {
accounts =new BankAccount[100];
numofAccounts=0;
}
@Override
int openSavingAccount(String name, double balance,String location) {
      BankAccount b=new BankAccount(name, balance, location);
	  accounts[numofAccounts]=b;
	  numofAccounts++;
	return b.getAccountNUM();
}
@Override
int openCurrentAccount(double balance,String name,String location) {
	BankAccount b=new BankAccount(balance, name, location);
	accounts[numofAccounts]=b;
	  numofAccounts++;
	return b.getAccountNUM();
}
public void withDrawnForm(int accNum,double amount) {
      
	for (int i = 0; i <numofAccounts; i++) {
		if(accNum==accounts[i].getAccountNUM()) {
			accounts[i].withdraw(amount);
			System.out.println("amount successfully withdrawn");
		} else
		{
			System.out.println("Account Number is NOT FOUND!!");
		}
	}
	
}
public void depositeTO(int accNum,double amount) {
	for (int j= 0; j<numofAccounts; j++) {
		if(accNum==accounts[j].getAccountNUM()) {
			accounts[j].deposite(amount);
			System.out.println("amount deposited successfully");
		}
		else {
	System.out.println("Account number is NOT FOUND!!");
		}
	}
}
public void AccountDetails(int accNum) {
	for (int i = 0; i <numofAccounts; i++) {
		if(accNum==accounts[i].getAccountNUM()) {
			accounts[i].getInfo();
		}
		else
			System.out.println("Account Number is NOT FOUND!!");
	}
}

public void TransactionDetails(int accNum) {
	for (int i = 0; i <numofAccounts; i++) {
		if(accNum==accounts[i].getAccountNUM()) {
			   System.out.println("Transaction details:");
			for (int j = 0; j <accounts[i].getNumberofTransaction(); j++) {
			  System.out.println("TR_NO "+ (j+1) +":"+accounts[i].getTransaction(j));
		}
		}
		else {
			System.out.println("account number is NOT FOUND!!");
		}
	}
}
	public void withtransdetail(int accNum) {
	for (int i = 0; i <numofAccounts; i++) {
		if(accNum==accounts[i].getAccountNUM()) {
			accounts[i].withtrandetail();
		}
		else {
			System.out.println("account NUmber is NOT FOUND!!");
		}
	}
}
	public void depositetransDetails(int accNum) {
		for (int i = 0; i <numofAccounts; i++) {
			if(accNum==accounts[i].getAccountNUM()) {
				accounts[i].DepositetransDetails();
			}
			else {
				System.out.println("Account Number is NOT found!!");
			}
	}
	}
}
