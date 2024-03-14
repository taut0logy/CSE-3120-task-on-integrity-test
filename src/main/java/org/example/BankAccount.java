package org.example;

public class BankAccount {
    private int id, balance;

    public BankAccount(int id) {
        this.id=id;
        this.balance=0;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addBalance(int value) {
        this.balance+=value;
    }

    public void deductBalance(int value) {
        if(this.balance<value) throw new IllegalArgumentException("Not enough balance in "+this.id);
        this.balance-=value;
    }
}
