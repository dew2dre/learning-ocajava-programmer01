package week07practical;
import java.util.ArrayList;

//SavingsAccount
class SavingsAccount extends Account{
	double interestRate;

	public SavingsAccount(String acctName, double balance){
		super(acctName, balance);
	}
	
	
	public void deposit(double amt)throws BankException{
	 if (amt <= 0)
		 throw new BankException ("Zero or negative amt deposit");
	 else
		 balance += amt;		
	}
	
	public void withdraw(double amt) {//throws BankException{
	 if (amt <= 0)
		 throw new ClassCastException("Zero or negative amt withdrawal");
	 else
		 balance -= amt;
	}
	
	public void interest(){
		balance += balance * this.interestRate;
	}
	
	public void advantageSports()
	{
		balance += 100; 
	}
	/*
	public ArrayList<Account> getAllSavingsAccounts(){
		
		return this.accounts;
	}*/
}
