package oops_concepts;

public interface BankAccount {
	
	int savingaccount = 2345600;
	int currentaccount = 1624689;
	}


	interface savingaccounts extends BankAccount{
	int savingloan = 209567;
	int profitsavingaccount=88000;
	int totalprofitsavingaccount =savingaccount-profitsavingaccount;


	}

	interface currentaccounts extends BankAccount{
	int currentloan = 45000;
	int profitcurrentaccount=134567;
	int totalprofitcurrentaccount =currentaccount-profitcurrentaccount;

	}

	class totaltax implements savingaccounts,currentaccounts {
	public static void main(String[] args) {
	int totaltax=(totalprofitsavingaccount+totalprofitcurrentaccount );
	System.out.println("Total Tax : "+totaltax);
	}


}
