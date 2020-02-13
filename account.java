package com.bank.bankapp;
public abstract class account {
abstract int openSavingAccount(String name,double balance,String location);
abstract int openCurrentAccount(double balance,String name,String location);
}

