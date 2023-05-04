package oops;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(int accountNumber, String accountHolderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	}

	public void deposit(double amount) {
	        this.balance += amount;
	        System.out.println("Deposit successful. New balance:" + this.balance);
	}

	public void withdraw(double amount) {
	        if (this.balance - amount >= 0) {
	                this.balance -= amount;
	                System.out.println("Withdrawal successful. New balance:" + this.balance);
	        } else {
	                System.out.println("Insufficient funds!");
	        }
	}

	public boolean isBalanceBelow(double limit) {
	        if (this.balance < limit) {
	                return true;
	        } else {
	                return false;
	        }
	}

	public static void main(String[] args) {
	        BankAccount account = new BankAccount(34567, "priya", 800.00);
	        account.deposit(500.00);
	        account.withdraw(200.00);
	        System.out.println(account.isBalanceBelow(1100.00));
	}

	}


