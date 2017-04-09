package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex1Test {

    private Ex1 ex;

    @Before
    public void setUp() { this.ex = new Ex1(); }

    @Test
    public void verifyNumbers() {
        Double[] numbers = new Double[]{1.0, 3.4, -1.3};
        assertEquals("Biggest: 3.4\nLowest: -1.3", this.ex.verifyNumbers(numbers));
    }
}
