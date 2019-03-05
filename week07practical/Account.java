package week07practical;

/*   * Simplified
/ basic version of class Account
  */
class Account {
  public String acctName;
  public double balance; 
 
 public Account(String acctName, double balance) {
	this.acctName = acctName;
	if(balance  > 0.0)
		this.balance = balance;
 } 
 /*
 public void withdraw(double amt) throws BankException {
	 if (amt <= 0)
		 throw new BankException ("Zero or negative amt withdrawal");
	 else
		 balance -= amt;
	 }*/
	  public void withdraw(double amt) {
		  if (amt <= 0)
			  throw new ClassCastException("Zero or negative amt withdrawal");
	  else
		  balance -= amt;
	  }
	 public void deposit(double amt) throws BankException {
	 if (amt <= 0)
		 throw new BankException ("Zero or negative amt deposit");
	 else
		 balance += amt;
	 } 
 public void printAcctName(){
		System.out.println(this.acctName);
	}
 public void printBalance(){
		System.out.println(this.balance);
	}
     
     
	}