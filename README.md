# Stock Trading Platform

## Project Overview

Stock Trading Platform is a Java-based application that simulates a basic stock trading environment. It allows users to view available market stocks, buy and sell stocks, manage their portfolio, and track transaction history.The application is developed using Object-Oriented Programming (OOP) concepts, with separate classes for stocks, users, transactions, and portfolio management.The project provides a simple menu-driven interface through which users can perform different stock trading operations.

##Features:

- View available stock market data
- Buy stocks with quantity selection
- Sell owned stocks
- Check current portfolio holdings
- Track transaction history
- View portfolio performance
- Manage user account balance
- Validate stock quantities and trading conditions 
- Display appropriate massages for invalid operations
- Menu-driven console interface

## Technologies used:

- Java
- Object-oriented programming(OOP)
- ArrayList
- Scanner
- Eclipse IDE
- GitHub

## Flowchart:

<img src="C:\Users\shudh\OneDrive\Pictures\Screenshots\stock_trading_platform (2).png"height>

## How to Run:

1. Open the project in Eclipse IDE.
2. Make sure Java is installed and configured.
3. Open the `Main.java` file from the `stockTrading` package.
4. Run the program as a Java Application.
5. Select an option from the menu by entering the corresponding number.
6. Follow the instructions displayed in the console.

## Usage:

The application provides a menu-driven interface with the following options:

1. **View Market** – Displays available stocks, company names, and current prices.
2. **Buy Stock** – Allows the user to purchase a selected stock by entering its symbol and quantity.
3. **Sell Stock** – Allows the user to sell stocks owned in the portfolio.
4. **View Portfolio** – Displays the user's current stock holdings and available balance.
5. **View Transactions** – Displays the complete history of buy and sell transactions.
6. **View Portfolio Performance** – Calculates and displays the current stock value, available balance, and total portfolio value.
7. **Exit** – Closes the application.

## Validation and Error Handling:

- Prevents buying stocks when the user has insufficient balance.
- Prevents selling stocks that are not owned by the user.
- Prevents selling more shares than the user owns.
- Prevents buying or selling with zero or negative quantities.
- Displays an appropriate message when an invalid stock symbol is entered.
- Displays appropriate messages for invalid trading operations.

## OOP Concepts Used

The project uses the following Object-Oriented Programming concepts:

- **Classes and Objects** – Separate classes are used to represent stocks, users, transactions, and portfolios.
- **Encapsulation** – Data members are kept private and accessed through methods.
- **Abstraction** – Trading operations such as buying, selling, and portfolio management are handled through methods.
- **Composition** – The Portfolio class manages stocks, quantities, transactions, and a user.

## Author

**Diksha**

Java Programming Internship — CodeAlpha
