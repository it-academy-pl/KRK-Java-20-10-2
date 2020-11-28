package pl.itacademy.bank.restricted;

import java.math.BigDecimal;

public class Account {
    private String number;
    private BigDecimal balance;

    boolean topUp(BigDecimal amount) {
        return false;
    }

    boolean withdraw(BigDecimal amount) {
        return false;
    }

    String getNumber() {
        return "";
    }
}
