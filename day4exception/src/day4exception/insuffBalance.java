package day4exception;

public class insuffBalance extends Exception {
	
	public insuffBalance(String message)
	{
		super(message);
	}
	
	public insuffBalance()
	{
		message="Insuff Balance\n";
	}
	//class filed
	String message;
}
