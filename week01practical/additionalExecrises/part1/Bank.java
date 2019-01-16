
package additionalexecrises.part1;

class Bank {
	public static void main(String args[]){
		Account x1 = new Account();
		System.out.println("Account details x1");
		x1.printAcctName();
		System.out.println(x1.acctId);
		System.out.println(x1.balance);
		System.out.println(x1.active);
	}
}