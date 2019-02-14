package week04practical;
import java.time.LocalDateTime;

public class Transaction{
	
	LocalDateTime dateTime;
	String transType;
	double transAmt;
	double acctBalance;
	
	
	Transaction(String type,double amount, double balance){
		//check cr or db
		this.transType = type;
		this.transAmt = amount;
		this.dateTime = LocalDateTime.now();
		if(type.equalsIgnoreCase("DR")){
			
			this.acctBalance = balance - amount;
		}else{
		   this.acctBalance = balance + amount;
		}
		
	}
}