

/**
 *
 * @author Sumit Kumar
 */
import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		
		Account obj = new Account("TO THE ATM", "******");
		obj.showMenu();	

	}

}

class Account{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	Account(String cname , String cid) {
		customerName = cname;
		customerId = cid;
	}
	
	
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Your Previous Deposited Amount is : " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Your Previous Withdrawal is : " +Math.abs(previousTransaction));
		}
		
		else {
			System.out.println("No Transaction Occured");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("WELCOME " +customerName);
		System.out.println("Your ID is " +customerId);
		System.out.println("\n");
                
                System.out.println("Please choose one of the option Below");
		
		System.out.println("1 : Check Your Balance");
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println("4 : Previous Transaction");
		System.out.println("5 : Exit");
		
		do {
			
			System.out.println("Enter Your Option");
			
			option = scanner.next().charAt(0);
                        
                        
			
			
			switch (option) {
			
			case '1' -> System.out.println("Your Current Balance is = "+balance);
				
			case '2' -> {
                            System.out.println("Enter an amount to be deposited : ");
                            
                            
                            int amount = scanner.nextInt();
                            deposit(amount);
                            System.out.println("Your Money has been successfully depsited");
                        }
				
			case '3' -> {
                            System.out.println("Enter an amount to withdraw ");
                            
                            
                            int amount2 = scanner.nextInt();
                            withdraw(amount2);
                            System.out.println("Please collect your cash");
                        }
				
			case '4' -> getPreviousTransaction();
				
			case '5' -> System.out.println("=========================================================================================================");

			default -> System.out.println("Invalid Option!! Please Enter Correct Opton...");
			}			
		}
		while(option != '5');
			System.out.println("Thank You for Using our Services.....!!");
                        System.out.println("Please Visit Again ");
                        
                        
	}
}

