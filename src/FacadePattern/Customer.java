package FacadePattern;

import java.math.BigDecimal;

/*
The facade design pattern is a means to hide the complexity of a subsystem by encapsulating it behind a unifying wrapper called a facade class;
removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the subsystem and the client classes;
handles instantiation and redirection of tasks to the appropriate class within the subsystem;
provides client classes with a simplified interface for the subsystem;
acts simply as a point of entry to a subsystem and does not add more functionality to the subsystem.
 */
public class Customer {
    public static void main(String[] args) {
        BankServiceFacade bankServiceFacade = new BankServiceFacade();
        int mySavings = bankServiceFacade.createNewAccount("savings", 500);
        int myInvestment = bankServiceFacade.createNewAccount("investment", 1000);
        bankServiceFacade.transferMoney(myInvestment, mySavings, 300);
        System.out.println(bankServiceFacade.showBalance(mySavings));
        System.out.println(bankServiceFacade.showBalance(myInvestment));
    }
}
