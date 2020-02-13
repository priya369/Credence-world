package com.bank.bankapp;


public class BankAccount {
  String name;
  String location;
  double balance;
  int accountNUM;
 public static int savingaccNUM=1000;
  public static int currentaccNUM=5000;
  public double[] transaction;
  public double[] Wtransaction = new double[100];
  public String[] transactionSummary;
  public int numofTransaction;
     public BankAccount(String name,double balance,String location) {
    	 this.name=name;
    	 this.balance=balance;
    	 this.location=location;
    	 savingaccNUM++;
    	 accountNUM=savingaccNUM;
    	  transaction=new double[100];
    	 transactionSummary=new String[100];
    	 transaction[0]=balance;
    	 transactionSummary[0]="Amount $"+balance+" was deposited";
    	 numofTransaction=1;

}
     public BankAccount(double balance,String name,String location) {
    	 this.name=name;
    	 this.balance=balance;
    	 this.location=location;
    	 currentaccNUM++;
    	 accountNUM=currentaccNUM;
    	 transaction=new double[100];
    	 transactionSummary=new String[100];
    	 transaction[0]=balance;
    	 transactionSummary[0]="Amount $"+balance+" was deposited";
    	 numofTransaction=1;
	}
     public void getInfo() {
    	 System.out.println("\nName: "+name+"\nLocation: "+location+"\nAccount Number:"+accountNUM+"\nBalance: "+balance);
     }
    public int getAccountNUM() {
		return accountNUM;
    }
    public int getNumberofTransaction() {
		return numofTransaction;
    	
    }
    public void withdraw(double amount) {
    	balance=balance-amount;
    	System.out.println("successfully withdrawn "+"\nyour account balance is:"+balance);
    	Wtransaction[numofTransaction]=amount;
    	transactionSummary[numofTransaction]="Amount $"+amount+" was withdrawn";
        numofTransaction++;
    }
    public void deposite(double amount) {
    	if(amount<=0) {
    		System.out.println("amount should not be zero");
    	}
    	else {
    	balance=balance+amount;
    	System.out.println("successfully  Deposited "+"your account balance is:"+ balance);
    	transaction[numofTransaction]=amount;
    	transactionSummary[numofTransaction]="Amount $"+amount+" was deposited";
        numofTransaction++;
    }
}
public void transfering(double amount) {
	balance=balance-amount;
	
}
    public String getTransaction(int n) {
    	String transaction=transactionSummary[n];
    	if(transaction==null) {
    		return "No transaction existing in this account number.";
    	}
    	else {
		return transaction;
    }
    }
public void withtrandetail() {
	double amount = 0;
	for (int i = 0; i < numofTransaction; i++) {
		amount=amount+Wtransaction[i];
	}
	System.out.println("Total withdrawl transaction is :"+ amount);
}
public void DepositetransDetails() {
	double amount=0;
	for (int i = 0; i <numofTransaction; i++) {
		amount=amount+transaction[i];
	}
	System.out.println("Total deposite transaction is: "+ amount);
}
	 
 }


