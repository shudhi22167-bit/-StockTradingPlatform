package stocktrading;
import java.util.Scanner;
public class Main {
public static  void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	stock stock1=new stock("TCS","Tata Consultancy Services",3500);
	stock stock2=new stock("INFY","Infosys",1800);
	stock stock3=new stock("RELIANCE","Reliance Industries",2900);
	stock stock4=new stock("HDFC","HDFC Bank",1600);
	User user = new User("Diksha", 10000);
	Portfolio portfolio = new Portfolio(user);
	stock[] stocks= {stock1,stock2,stock3,stock4};
	int choice;
	while (true) {
	    System.out.println("\n---- STOCK TRADING PLATFORM ----");
	    System.out.println("1. View Market");
	    System.out.println("2. Buy Stock");
	    System.out.println("3. Sell Stock");
	    System.out.println("4. View Portfolio");
	    System.out.println("5. View Transactions");
	    System.out.println("6. View Portfolio Performance");
	    System.out.println("7. Exit");
     System.out.print("Enter your choice: ");
	    choice = sc.nextInt();
	    switch (choice) {
	    case 1:
	    	displayMarket(stocks);
	    	break;
	    case 2:
	        System.out.print("Enter stock symbol: ");
	        String buySymbol = sc.next();
	        System.out.print("Enter quantity: ");
	        int buyQuantity = sc.nextInt();
	        stock buyStock = findStock(stocks, buySymbol);
	        if (buyStock == null) {
	            System.out.println("Stock not found.");
	        } else {
	            portfolio.buyStock(buyStock, buyQuantity);
	        }
	        break;
	    case 3:
	        System.out.print("Enter stock symbol: ");
	        String sellSymbol = sc.next();
	        System.out.print("Enter quantity: ");
	        int sellQuantity = sc.nextInt();
	        stock sellStock = findStock(stocks, sellSymbol);
	        if (sellStock == null) {
	            System.out.println("Stock not found.");
	        } else {
	            portfolio.sellStock(sellStock, sellQuantity);
	        }
	        break;
	    case 4:
	        portfolio.displayPortfolio();
	        break;
	    case 5:
	        portfolio.displayTransactions();
	        break;
	    case 6:
	        portfolio.displayPerformance();
	        break;
	    case 7:
	        System.out.println("Thank you for using Stock Trading Platform.");
	        sc.close();
	        return;
	     default:
	    		System.out.println("Invalid choice");
	    }
	}
	}
public static stock findStock(stock[] stocks, String symbol) {
   for (stock stock : stocks) {
        if (stock.getSymbol().equalsIgnoreCase(symbol)) {
            return stock;
        }
    }
    return null;
}
public static void displayMarket(stock[] stocks) {
	System.out.println("\n----Market Data----");
	for(stock stock: stocks) {
		System.out.println(stock.getSymbol()+"-"+stock.getName()+"- Price:"+stock.getPrice());
	}
}
}
