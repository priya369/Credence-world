package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountapp {
	public static void main(String[] args) {  
		
	List<Account> accounts=new LinkedList<Account>();
	String file="";
	
	List<String[]> newAccountHolders=utilites.CSV.read(file);
	for (String[] accountHolder : newAccountHolders) {
	
	 String name=accountHolder[0];
	 String sSN=accountHolder[1];
	 String accountType=accountHolder[2];
	 double initdeposit=Double.parseDouble(accountHolder[3]);
	 if(accountType.equalsIgnoreCase("saving")){
		 accounts.add(new Savings(name, sSN, initdeposit));
	 }
	 else if(accountType.equalsIgnoreCase("checking")){
		 accounts.add(new Checking(sSN, sSN, initdeposit));
	 }
	 else{
		 System.out.println("Error reading account type");
	 }
	}
	for (Account acc:accounts) {
		System.out.println("\n********************************");
		acc.showInfo();
        
		
	}
		
	
	}
}
