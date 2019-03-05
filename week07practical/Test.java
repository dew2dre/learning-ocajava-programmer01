package week07practical;

class Test{

	public static void main(String[] args){
		
		try{
			/*Account acct1 = new Account("Nano", -976);
			//System.out.println("Account name: " + acct1.acctName);
			//System.out.println("Balance: " + acct1.balance);
			acct1.printAcctName();
			acct1.printBalance();
			acct1.withdraw(0.0);
			
			SavingsAccount sv1 = new SavingsAccount("Savings",-564);
			sv1.printAcctName();
			sv1.printBalance();
			sv1.withdraw(0.0);*/
			
			Account acc1 = new Account("A", 100);
			acc1.withdraw(-98);
		}
		catch(Exception e){//(BankException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finish");
		}
	} 
}