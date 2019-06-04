package cursoJava2019.exercises.ex01.entities;

public class Account {
	private double TAX= 5.0;
	
	private String holder;
	private Long number;
	private double cash;
	
	public Account() {
		
	}

	public Account(String holder, Long number) {
		this.holder = holder;
		this.number = number;
	}
	
	public Account(String holder, Long number, double initial_deposit) {
		this.holder = holder;
		this.number = number;
		deposit(initial_deposit);
	}
	
	public Long getNumber() {
		return number;
	}
	
	public double getBalance() {
		return cash;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public void deposit(double amount) {
		cash += amount;
	}
	
	public void withdraw(double amount) {
		cash -= (amount + this.TAX);
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder "
				+ holder
				+ " Balance: $ "
				+ String.format("%.2f", cash);
	}
}
