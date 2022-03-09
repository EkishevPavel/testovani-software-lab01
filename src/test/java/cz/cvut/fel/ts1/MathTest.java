package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @Test
    public void factorialTest(){
        Math m = new Math();
        assertEquals(m.factorial(3),6);
    }
}
