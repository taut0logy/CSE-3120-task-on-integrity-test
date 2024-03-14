package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainIT {
    @Test
    void integrityTest() {
        BankAccount a=new BankAccount(1);
        BankAccount b=new BankAccount(2);
        BankingSystem s=new BankingSystem(1234);
        assertThrows(IllegalArgumentException.class,()->s.transaction(a,b,50,1234));
    }
}
