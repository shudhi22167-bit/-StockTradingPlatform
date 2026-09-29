package stocktrading;

public class User {
	private String username;
	private double balance;
	public User(String username,double balance) {
		this.username=username;
		this.balance=balance;
	}
	public String getUsername() {
		return username;
	}
	public double getBalance() {
		return balance;
	}
	public void addBalance(double amount) {
		balance +=amount;
	}
	public void deductBalance(double amount) {
		balance-=amount;
	}

}
