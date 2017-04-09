package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex5Test {

    private Ex5 ex;

    @Before
    public void setUp() { this.ex = new Ex5(); }

    @Test
    public void sumNumbers() {
        assertEquals(1275, this.ex.sumNumbers());
    }
}
