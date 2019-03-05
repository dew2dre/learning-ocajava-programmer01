package week07practical;

public class BankException extends Exception{  
	public BankException() {   
		super();
	}
    public BankException(String excepMsg) {
		super(excepMsg);
	}
}