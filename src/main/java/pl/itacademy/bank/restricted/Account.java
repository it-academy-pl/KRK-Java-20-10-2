package pl.itacademy.bank.restricted;

import java.math.BigDecimal;

public abstract class Account {
    private String number;
    private BigDecimal balance;

    void topUp(BigDecimal amount) {
    }

    BigDecimal withdraw(BigDecimal amount) {
        return BigDecimal.ZERO;
    }

    String getNumber() {
        return "";
    }

    BigDecimal getBalance() {
        return BigDecimal.ZERO;
    }
}
