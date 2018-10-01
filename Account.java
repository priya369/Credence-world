package bankaccountapp;

import java.util.Random;

public abstract class Account implements IBaseRate{
  private String name;
 private  String sSN;
 protected String accountNumber;
 private static int index=10000;
  private double balance;
	protected double rate;
	public Account(String name,String sSN,double initdeposit){
		this.name=name;
		this.sSN=sSN;
		balance=initdeposit;
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
	}
	
	public abstract void setRate() ;

	private String setAccountNumber(){
	String lasttwoOfSSN=sSN.substring(sSN.length()-2, sSN.length());
	int uniqueID=index;
	int randomNumber=(int)(Math.random()*Math.pow(10, 3));
		return lasttwoOfSSN+uniqueID+randomNumber;
		
	}
public void compound(){
	double accruedInterest=balance * (rate/100);
	balance= balance+ accruedInterest;
	System.out.println("Accrued interest: $"+accruedInterest);
	printBalance();
}
public void Deposit(double amount){
	balance=balance+amount;
	System.out.println("Depositing $"+ amount);
	printBalance();
}
public void withdraw(double amount){
	balance=balance-amount;
	System.out.println("withdrawing $"+amount);
	printBalance();
}
public void transfer(String towhere,double amount){
	balance=balance-amount;
	System.out.println("Transfering $"+amount+" to "+towhere);
	printBalance();
}
public void printBalance(){
	System.out.println("your balance is now: $"+ balance);
}
public void showInfo(){
	System.out.println(
			"Name: "+ name
			+"\nAccount Number: "+ accountNumber
			+"\nBalance: "+balance
			);
}
}
