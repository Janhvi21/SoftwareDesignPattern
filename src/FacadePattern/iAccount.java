package FacadePattern;

import java.math.BigDecimal;

public interface iAccount {
    public void deposit(Integer amount);
    public void withdraw(Integer amount);
    public void transfer(iAccount toAccount, Integer amount);
    public int getAccountNumber();
    public Integer getBalance();
}
