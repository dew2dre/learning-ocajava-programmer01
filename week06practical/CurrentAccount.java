package week06practical;
import java.util.ArrayList;
import java.text.DecimalFormat;

//CurrentAccount
class CurrentAccount extends Account implements InternetBanking {
	private static DecimalFormat df = new DecimalFormat("#.##");
	double overDraft;

		public void deposit(double amt){
		
		if(amt > 0.00){
			String type = new String("CR");
			balance += amt;
			super.transactions.add(new Transaction(type,amt,balance));
		}
		
		}

		public void withdraw(double amt){
			String type = new String("DR");	
			balance -= amt;		
			
		if(amt > balance){			
			this.overDraft = Double.parseDouble(String.format("%.3f",(balance - amt))); 
		}
		super.transactions.add(new Transaction(type,amt,balance));
		
	}
		public void benefitsOffer(){
			System.out.println("Offering  benefits to current account holders");
		}
}
