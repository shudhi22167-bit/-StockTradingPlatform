package stocktrading;
import java.util.ArrayList;
public class Portfolio {
	private User user;
	private ArrayList<stock> stocks;
	private ArrayList<Integer> quantities;
	private ArrayList<Transaction> transactions;
    public Portfolio(User user) {
    	this.user=user;
    	this.stocks=new ArrayList<>();
    	this.quantities=new ArrayList<>();
    	this.transactions=new ArrayList<>();
    }
    public void buyStock(stock stock, int quantity) {
    	if(quantity <=0) {
    		System.out.println("Quantity must be greater than 0");
    		return;
    	}
        double totalCost = stock.getPrice() * quantity;
        if (user.getBalance() < totalCost) {
            System.out.println("Insufficient balance.");
            return;
        }
        user.deductBalance(totalCost);
        int index = stocks.indexOf(stock);
        if (index == -1) {
            stocks.add(stock);
            quantities.add(quantity);
        } else {
            quantities.set(index, quantities.get(index) + quantity);
        }
        Transaction transaction =
                new Transaction("BUY", stock, quantity, totalCost);
        transactions.add(transaction);
        System.out.println("Stock purchased successfully.");
    }
    public void sellStock(stock stock,int quantity) {
    	if(quantity<=0) {
    		System.out.println("Qunatity must be greater than 0.");
    		return;
    	}
    	int index=stocks.indexOf(stock);
    	if(index==-1) {
    		System.out.println("You do not own this stock.");
    		return;
    	}
    	if(quantities.get(index)<quantity) {
    		System.out.println("Not enough shares to sell.");
    		return;
    	}
    	double totalAmount=stock.getPrice() * quantity;
    	user.addBalance(totalAmount);
    	quantities.set(index,quantities.get(index)-quantity);
    	 if (quantities.get(index) == 0) {
    	        stocks.remove(index);  
    	        quantities.remove(index);
    	    }

    	    Transaction transaction =
    	            new Transaction("SELL", stock, quantity, totalAmount);

    	    transactions.add(transaction);

    	    System.out.println("Stock sold successfully.");
    	}
    public void displayPortfolio() {
    	if(stocks.isEmpty()) {
    		System.out.println("Portfolio is empty");
    		return;
    	}
    	System.out.println("\n------Your Portfolio------");
    	
    	for(int i=0;i<stocks.size();i++) {
    		stock stock =stocks.get(i);
    		
    		System.out.println("Symbol:"+ stock.getSymbol());
    		System.out.println("Company:"+stock.getName());
    		
    		System.out.println("Quantity:"+quantities.get(i));
    		System.out.println("Current Price:"+stock.getPrice());
    		System.out.println("---------------");
    	}
    	System.out.println("Available Balance:"+user.getBalance());
    }
    public void displayTransactions() {
    	if(transactions.isEmpty()) {
    		System.out.println("No transactions found.");
    		return;
    	}
    	System.out.println("\n-----Transaction History----");
    	
    	for(Transaction transaction : transactions) {
    		System.out.println("Type:"+transaction.getType());
    		System.out.println("Stock:"+transaction.getStock().getSymbol());
    		System.out.println("Quantity:"+transaction.getQuantity());
    		System.out.println("Total Amount:"+transaction.getTotalAmount());
    		System.out.println("---------------------------");
    	}
    }
    public void displayPerformance() {
    	double PortfolioValue=0;
    	for(int i=0;i<stocks.size();i++) {
    		PortfolioValue += stocks.get(i).getPrice()*quantities.get(i);
    	}
    	double totalValue = PortfolioValue +user.getBalance();
    	
    	System.out.println("\n-----Portfolio Performance-----");
    	System.out.println("Stock Vlaue:"+PortfolioValue);
    	System.out.println("Available Balance:"+user.getBalance());
    	System.out.println("Total Portfolio Value:"+totalValue);
    	
    	}
    }
    

