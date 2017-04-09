package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex6Test {

    private Ex6 ex;

    @Before
    public void setUp() { this.ex = new Ex6(); }

    @Test
    public void listFactorial() {
        assertEquals(this.ex.listFactorial(), this.ex.listFactorial());
    }
}
