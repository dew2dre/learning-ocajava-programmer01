
package week04practical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDateTime;

class Bank {
	
	 ArrayList<Transaction> myTransactions = new ArrayList<>();
	
	public static void main(String args[]){
		Bank b1 = new Bank();
		Account x1 = new Account();
		System.out.println("Account details x1 with Array");
		//x1.printAcctName();
		Transaction[] transactions = new Transaction[2];		
		x1.balance = 2000.00;
		 x1.withdraw(20,transactions,0);
		 x1.deposit(50,transactions,1);
		
        b1.allTransaction(transactions);
		//With ArrayList
		//ArrayList<Transaction> myTransactions = new ArrayList<>();
		Account x2 = new Account();
		System.out.println("\n Account details x2 with ArrayList");
		x2.balance = 3000.00;
		
		x2.deposit(324.13,b1.myTransactions);
		x2.withdraw(190,b1.myTransactions);
		x2.withdraw(175,b1.myTransactions);
		x1.deposit(239.78,b1.myTransactions);
		System.out.println("Type	Amount	Balance	Date");
		for(Transaction i: b1.myTransactions){
			System.out.println(i.transType + "	" + i.transAmt + "	"+ i.acctBalance
			+ " " + i.dateTime);
		}	
		
		LocalDateTime dt1 = LocalDateTime.now();
		
		b1.transactionHistory(dt1.getYear(),dt1.getMonthValue());
	
	}
	 void allTransaction(Transaction[] arrList){
		System.out.println("Type	Amount	Balance 	Date"); 
		for(Transaction i: arrList){
			System.out.println(i.transType + "	" + i.transAmt + "	"+ i.acctBalance
			+ " " + i.dateTime);
		}
	}
	void transactionHistory(int year, int month){
		List<Transaction> transList = new ArrayList<Transaction>();
		transList.addAll(this.myTransactions);		
		
		System.out.println("\n Transaction History"); 
		List<Transaction>arrList = transList.stream().filter(t ->t.dateTime.getMonthValue() == month && t.dateTime.getYear() == year).collect(Collectors.<Transaction> toList());
		
		System.out.println("Type	Amount	Balance 	Date");	
		 for(Transaction trns : transList){
			System.out.println(trns.transType + "	" + trns.transAmt + "	"+ trns.acctBalance
			+ "	 " + trns.dateTime.getMonth() + " " + trns.dateTime.getYear());
		 }
		 
	}
}