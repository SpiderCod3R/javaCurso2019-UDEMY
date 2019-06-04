package cursoJava2019.exercises.ex02.entities;

public class Account {
	private double TAX= 5.0;
	
	Holder holder;
	private Long number;
	private double cash;
	
	public Account() {
		
	}

	public Account(Holder holder, Long number) {
		this.holder = holder;
		this.number = number;
	}
	
	public Account(Holder holder, Long number, double initial_deposit) {
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
				+ holder.getName()
				+ " Balance: $ "
				+ String.format("%.2f", cash);
	}
}
