package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void addBalanceTest() {
        BankAccount a=new BankAccount(1);
        a.addBalance(100);
        assertEquals(100,a.getBalance());
    }
    @Test
    void deductBalanceTest() {
        BankAccount a=new BankAccount(1);
        a.addBalance(100);
        a.deductBalance(50);
        assertEquals(50,a.getBalance());
    }
    @Test
    void deductBalanceExcTest() {
        BankAccount a=new BankAccount(1);
        assertThrows(IllegalArgumentException.class,()->a.deductBalance(50));
    }

}