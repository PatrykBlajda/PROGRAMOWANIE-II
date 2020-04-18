package Wallet_PLN;

import java.math.BigDecimal;

public class Money {

    private BigDecimal money;

    public Money(BigDecimal money) {
        this.money = money;
    }

    public void addMoney(BigDecimal cash) {

        this.money = this.money.add(cash);
    }

    public void subtractMoney(BigDecimal cash) {

        this.money = this.money.subtract(cash);
    }


}
