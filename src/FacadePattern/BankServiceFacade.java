package FacadePattern;

import java.math.BigDecimal;
import java.util.*;

public class BankServiceFacade {
    private Hashtable<Integer, iAccount> bankAccounts;

    public BankServiceFacade() {
        this.bankAccounts = new Hashtable<Integer, iAccount>();
    }

    public int createNewAccount(String type, Integer initAmount) {
        iAccount newAccount = null;
        switch (type) {
            case "checking":
                newAccount = new Checking(initAmount);
                break;
            case "savings":
                newAccount = new Savings(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                System.out.println("Invalid Account Type");
                break;

        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }
    public Integer showBalance(int accountNumber){
        return bankAccounts.get(accountNumber).getBalance();
    }
    public void transferMoney(int to, int from, Integer amount){
        iAccount toAccount=this.bankAccounts.get(to);
        iAccount fromAccount=this.bankAccounts.get(from);
        fromAccount.transfer(toAccount,amount);
    }
}
