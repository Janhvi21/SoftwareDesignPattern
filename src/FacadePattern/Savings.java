package FacadePattern;

import java.math.BigDecimal;

public class Savings implements iAccount{
    int AcccountNumber= (int) (Math.random()*100);
    Integer totalAmount;

    public Savings(Integer initAmount) {
        totalAmount = initAmount;
    }

    @Override
    public void deposit(Integer amount) {
        totalAmount+=amount;
    }

    @Override
    public void withdraw(Integer amount) {
        totalAmount-=amount;
    }

    @Override
    public void transfer(iAccount toAccount, Integer amount) {
        toAccount.deposit(amount);
        withdraw(amount);
    }

    @Override
    public int getAccountNumber() {
        return AcccountNumber;
    }

    @Override
    public Integer getBalance() {
        return totalAmount;
    }
}
