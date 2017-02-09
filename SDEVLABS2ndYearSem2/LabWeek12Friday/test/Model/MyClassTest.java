package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testHello() throws Exception {
        MyClass myUnit = new MyClass();

        String result = myUnit.hello();

        assertEquals("hello", result);
    }
}