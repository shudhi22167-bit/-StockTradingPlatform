package stocktrading;

public class Transaction {
	private String type;
	private stock stock;
	private int quantity;
	private double totalAmount;
	public Transaction(String type,stock stock,int quantity,double totalAmount) {
		this.type=type;
		this.stock=stock;
		this.quantity=quantity;
		this.totalAmount=totalAmount;
	}
	public String getType() {
		return type;
	}
	public stock getStock() {
		return stock;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	

}
