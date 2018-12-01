//Hannah Estes, Katrina Bueno, Mostofa Adib Shakib, Payal Pawar

public class CheckingAccount extends Account {
	
	public CheckingAccount(String pin, String ssn, String accountNumber, double balance, double lastDepositAmt) throws pinException, ssnException{
		super(pin, ssn, accountNumber, balance, lastDepositAmt);
	}

}
