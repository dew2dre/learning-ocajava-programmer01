package week06practical;
import java.util.function.*;
import java.util.ArrayList;
public class Test{

	public static void main(String...args){
		//Testing 6.1
		//using interestRate and overdraft to test
		
		SavingsAccount savings = new SavingsAccount();
		savings.balance = 50.00;
		savings.interestRate = 0.05;
		savings.acctName = "My Savings Account";
		System.out.println("Savings Account Test");
		savings.printAcctName();
		savings.interest();
		System.out.println("Balance after interest is applied: " + savings.balance);
		
		//Transaction[] transactions = new Transaction[2];
		CurrentAccount currAccount = new CurrentAccount();
		currAccount.balance = 17.76;
		currAccount.acctName = "My Current Account";
		currAccount.withdraw(20);
		currAccount.deposit(80);
		currAccount.deposit(45);
		currAccount.deposit(300);
		currAccount.withdraw(23);
		currAccount.deposit(1000);
		currAccount.withdraw(101);
		currAccount.withdraw(128);
		currAccount.printAcctName();
		System.out.println("Current Account Balance: " + currAccount.balance);
		System.out.println("Show all Transactions");
		Predicate<Transaction> predicateAllTransaction =  e -> e instanceof Transaction;
		//System.out.println("Balance after overdraft: " + currAccount.overDraft);
		//System.out.println("transactions size: " +((Account)currAccount).transactions.size());
		((Account)currAccount).getTransactions(((Account)currAccount).transactions,predicateAllTransaction);
		System.out.println("Show withdraw over $100 Transactions");
		Predicate<Transaction> predicateWithdrawOverHundred = t -> t.transactionAmt > 100 && t.transactionType.equalsIgnoreCase("DR");
		((Account)currAccount).getTransactions(((Account)currAccount).transactions,predicateWithdrawOverHundred);
		
		
		YoungStars y1 = new KidsSavingsAccount();
	
		//YoungStars y2 = new CurrentAccount();
		//(((SavingsAccount)KidsSavingsAccount)YoungStars).balance = 45.23;
		//System.out.println(y1);
		
	}

}