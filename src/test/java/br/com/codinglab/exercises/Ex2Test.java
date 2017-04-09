package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;
import java.util.stream.IntStream;
import static org.junit.Assert.*;

public class Ex2Test {

    private Ex2 ex;

    @Before
    public void setUp() { this.ex = new Ex2(); }

    @Test
    public void listNumbers() {
        int[] expected = IntStream.rangeClosed(1,20).toArray();
        assertArrayEquals(expected, this.ex.listNumbers());
    }
}
