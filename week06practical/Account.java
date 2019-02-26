package week06practical;

import java.util.function.*;
import java.util.ArrayList;

//Module 1 Java Basics
abstract public class Account {
	String acctName;
	long acctId;
	double balance;
	boolean active;
	static ArrayList<Account> accounts;
	ArrayList<Transaction> transactions = new ArrayList<>();
	
	public Account(){
		this.accounts = new ArrayList<Account>();
	}
	void printAcctName(){
		System.out.println(acctName);
	}
     

	public void deposit(double Amt,ArrayList<Transaction> arrList){};
	public void withdraw(double amt,ArrayList<Transaction> arrList){};
	
	public void getTransactions(ArrayList<Transaction> transactionList, Predicate<Transaction> rule){
		//System.out.println("debug: getTransactions method");
		//System.out.println("list size: "+this.transactions.size());
		
		for(Transaction transaction : transactionList){
			if(rule.test(transaction)){
				System.out.println(transaction.toString());
			}
		}
		
	}	
	
}