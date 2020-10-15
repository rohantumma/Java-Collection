package day4exception;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1= new Account(1,100.00f);
		account1.deposite(100);
		System.out.println(account1);
		account1.deposite(100);
		System.out.println(account1);
		account1.deposite(100);
		System.out.println(account1);
		try {
			account1.withdraw(1000);
		} catch (insuffBalance e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(account1);
		
	}

}
