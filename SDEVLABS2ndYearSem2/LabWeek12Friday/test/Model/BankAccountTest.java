package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    BankAccount b;

    @Before
    public void setUp() throws Exception {
        Thread a = new Thread();
        a.start();
        a.join();
        b = new BankAccount("John",1000);
    }

    @Test
    public void testBankAccount()
    {
        assertEquals("John",b.getAccountName());
        assertEquals(1000,b.getBalance());
    }



}