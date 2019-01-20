
package week02practical;
//Module 1 Java Basics
public class Account {
	String acctName;
	long acctId;
	double balance;
	boolean active;
	
	void printAcctName(){
		System.out.println(acctName);
	}
	
	static Account createNewAccount(){
		//System.out.println("Debug method create new account");
		Account ac = new Account();
		ac.acctName = "Brian";
		return ac;
	}
	//rest of the code

}