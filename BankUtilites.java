package com.bank.bankapp;

import java.util.Scanner;

public class BankUtilites {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double balance;
	String name;
	int age;
	int accNUM;
	String location;
	int user_choice;
	int no;
	BankProcess bp=new BankProcess();
	do {
		   System.out.println("---------------WELCOME TO ONLINE BANKING----------------");
	       System.out.println("1.Open new bank account"+"   "+"2.Withdrawn");
	       System.out.println("3.Deposite "+"               "+"4.Account Details");
	       System.out.println("5.Transaction details");
	       System.out.println("<Enter your choice>:");
	        user_choice=sc.nextInt();
	switch(user_choice) {
	case 1:        System.out.println("Enter your name:");
		           name=sc.next();
	               System.out.println("Enter location :");
                   location=sc.next();
                   System.out.println("enter your age :");
                   age=sc.nextInt();
                   while(age<18) {
                	   System.out.println("\'Age must be 18+\'");
                       age=sc.nextInt();
                   }
                	            System.out.print("--------------Choose account type:------------");
                	   System.out.println("\n1.saving bank account"+"\n2.current bank account");
                	   user_choice=sc.nextInt();
                	   if(user_choice==1) {
                		   System.out.println("Enter initial amount for account opening:");
        		           balance=sc.nextDouble();
        		           while(balance<500) {
        		        	   System.out.println("\'FOR saving bank accont ,the minimum balance should be 500\'"+" deposite again");
            		           balance=sc.nextDouble();
        		           }
        		           System.out.println("your account is successfully created : "+bp.openSavingAccount(name, balance, location));
                	   }
                	   else if(user_choice==2) {
                		   System.out.println("enter initial amount for account opening");
        		           balance=sc.nextDouble();
        		           while(balance<5000) {
        		        	   System.out.println("\'For current bank account, minimum balance should be 5000\'"+" deposite again ");
            		           balance=sc.nextDouble();
        		           }
        		           System.out.println("your account is successfully created : "+bp.openCurrentAccount(balance, name, location));
    		           
                	   }
                	   else {
                		   System.out.println("you choose invalid option");
                	   }
             break;
		case 2:   System.out.println("Enter your account number: ");
		          accNUM=sc.nextInt();
		          System.out.println("Enter withdrawl amount: ");
		          balance=sc.nextDouble();
		          while(balance%100!=0) {
		         	   System.out.println("Enter withdrawl amount: ");
		   		          balance=sc.nextDouble();
		            }
		          bp.withDrawnForm(accNUM, balance);
		     break;
		case 3:  System.out.println("Enter your account Number:");
		         accNUM=sc.nextInt();
                 System.out.println("Enter deposite amount: ");
                 balance=sc.nextDouble();
			     bp.depositeTO(accNUM, balance);
			  break;
		case 4: System.out.println("Enter your account Number:");
                accNUM=sc.nextInt();
                bp.AccountDetails(accNUM);
			break;
		case 5:  System.out.println("---Transaction details----");
		        System.out.println("\n1.All Transaction details"+"\n2.Withdrawl transaction details"+"\n3.Deposite transaction details");
		        System.out.print("select option:");
		        user_choice=sc.nextInt();
		        if(user_choice==1) {
			             System.out.println("Enter your account Number:");
                         accNUM=sc.nextInt();
                        bp.TransactionDetails(accNUM);
		        }
		        else if(user_choice==2) {
		        	System.out.println("Enter your account Number:");
		               accNUM=sc.nextInt();
					bp.withtransdetail(accNUM);
		        }
		        else if(user_choice==3){
		        	System.out.println("Enter your account Number:");
		            accNUM=sc.nextInt();
		            bp.depositetransDetails(accNUM);
		        }
		        else {
		        	System.out.println("you enter wrong option");
		        }
			break;
		default:System.out.println("OUT OF SERVICE!!");
       
	}
	}while(user_choice!=6);
}
}