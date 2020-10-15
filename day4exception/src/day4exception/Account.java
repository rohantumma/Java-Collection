/**
 * 
 */
package day4exception;

/**
 * @author rohan
 *
 */
public class Account {
	
	
	
	
	/**
	 * @param accountNumber
	 * @param balanc
	 */
	public Account(int accountNumber, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	//
	public void deposite(int amount)
	{
		balance+=amount;	
	}
	
	public void withdraw(int amount) throws insuffBalance
	{
		
		if(balance- amount<0) {
			
			throw new insuffBalance("INSUFF Balance");	
			//throw new insuffBalance("INSUFF Balance");
			
		}
		else {
			System.out.println("withdrow allowd");
			balance-=amount;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}



	
	// class fileld
	
	int accountNumber;
	float balance;
	

}
