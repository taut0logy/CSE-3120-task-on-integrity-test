package org.example;

public class BankingSystem {
    private int password;
    public BankingSystem(int password) {
        this.password=password;
    }

    public void transaction(BankAccount from, BankAccount to, int amount, int pass) {
        if(pass!=this.password) throw new IllegalArgumentException("Wrong password");
        else {
            from.deductBalance(amount);
            to.addBalance(amount);
        }
    }
}
