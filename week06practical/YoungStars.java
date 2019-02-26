package week06practical;

public interface YoungStars{

	 default void advantageSports(Account acct){
		 acct.balance += 100;
	 };

}