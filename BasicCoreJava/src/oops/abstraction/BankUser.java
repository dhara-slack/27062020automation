package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		account(new SBI()); // SBI = Chrome
		account(new HDFC()); // HDFC = Firefox
		account(new ICICI()); // ICICI = Edge
		
		String name="dhara";
		RBI bank= new SBI();
		int a=10;
		
		message("Sudha");
		
		sum(a);
		message(name);
		account(bank);
		
		sum(20);
		message("piku");
		account(new SBI());
		
		
	}
		public static void account(RBI bank) 
		{
		bank.creditCard();   // Navigate
		bank.debitCard();    // click
		bank.savingAccount(); // enter data
		bank.currentAccount(); // Select option
		}
		public static void sum(int a)
		{
			
		}
		
		public static void message(String name)
		{
			System.out.println("");
		}
		
	
	
	
}
