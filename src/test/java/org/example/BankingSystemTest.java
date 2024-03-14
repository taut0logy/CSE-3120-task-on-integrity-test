package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {
    @Test
    void transactionTest() {
        BankAccount a=new BankAccount(1);
        BankAccount b=new BankAccount(2);
        BankingSystem s=new BankingSystem(1234);
        a.addBalance(100);
        s.transaction(a,b,50,1234);
        assertEquals(50,b.getBalance());
        assertEquals(50,a.getBalance());
    }
    @Test
    void transactionExcTest() {
        BankAccount a=new BankAccount(1);
        BankAccount b=new BankAccount(2);
        BankingSystem s=new BankingSystem(1234);
        a.addBalance(100);
        assertThrows(IllegalArgumentException.class,()->s.transaction(a,b,50,123));
    }
}