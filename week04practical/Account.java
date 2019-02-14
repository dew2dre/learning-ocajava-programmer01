
package week04practical;

import java.util.ArrayList;

//Module 1 Java Basics
public class Account {
	String acctName;
	long acctId;
	double balance;
	boolean active;
	
	void printAcctName(){
	System.out.println(acctName);
	}
	public void deposit(double amt,Transaction[] arrList, int index){
		
		if(amt > 0.00){
			String type = new String("CR");
			arrList[index] = new Transaction(type,amt,this.balance);
		}
		
	}
		public void deposit(double amt,ArrayList<Transaction> arrList){
		
		if(amt > 0.00){
			String type = new String("CR");
			arrList.add(new Transaction(type,amt,this.balance));
		}
		
	}
	public void withdraw(double amt,Transaction[] arrList,int index){
		
		if(amt <= this.balance){
			String type = new String("DR");
		
			arrList[index] = new Transaction(type,amt,this.balance);
		}
		
	}
		public void withdraw(double amt,ArrayList<Transaction> arrList){
		
		if(amt <= this.balance){
			String type = new String("DR");
		
			arrList.add(new Transaction(type,amt,this.balance));
		}
		
	}
	
	
}