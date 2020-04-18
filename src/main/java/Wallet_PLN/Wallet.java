package Wallet_PLN;

import java.math.BigDecimal;

public class Wallet {

    Money money;

    public Wallet(Money money) {
        this.money = money;
    }

    public void putmoney(BigDecimal money) {

        money.add(money);
    }

    public void takemoney(BigDecimal money) {

        money.subtract(money);
    }
}