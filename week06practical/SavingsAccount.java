package week06practical;
import java.util.ArrayList;

//SavingsAccount
class SavingsAccount extends Account{
	double interestRate;

	public SavingsAccount(){
		super();
	}
	
	public void deposit(double amt){
		
		if(amt > 0.00){
			String type = new String("CR");
			super.transactions.add(new Transaction(type,amt,balance));
		}
		
	}
	
	public void withdraw(double amt){
		
		if(amt <= balance){
			String type = new String("DR");
		
			super.transactions.add(new Transaction(type,amt,balance));
		}
		
	}
	
	public void interest(){
		balance += balance * this.interestRate;
	}
	
	public void advantageSports()
	{
		balance += 100; 
	}
	
	public ArrayList<Account> getAllSavingsAccounts(){
		
		return this.accounts;
	}
}
