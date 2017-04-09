package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex7Test {

    private Ex7 ex;

    @Before
    public void setUp() { this.ex = new Ex7(); }

    @Test
    public void bhaskara() {
        assertArrayEquals(new Double[]{3.0, -7.0}, this.ex.bhaskara(1, 4, -21));
    }
}
