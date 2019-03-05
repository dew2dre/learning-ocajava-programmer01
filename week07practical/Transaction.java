package week07practical;
import java.time.LocalDateTime;

public class Transaction{
	
	LocalDateTime dateTime;
	String transactionType;
	double transactionAmt;
	double acctBalance;
	double balanceAfterTransaction;
	
 Transaction(String type, double amt, double balance) {
	 this.dateTime = LocalDateTime.now();
	 this.transactionType = type;
	 this.transactionAmt = amt; 
	 this.balanceAfterTransaction = balance;
	 } 
 
 public String toString() {   
	return ("DateTime : " + dateTime +     " Type : " + transactionType +     " Amount : " + transactionAmt +     " Balance : " + balanceAfterTransaction);
	}
}