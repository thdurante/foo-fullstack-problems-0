package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Slide1Test {

    private Slide1 ex;

    @Before
    public void setUp() { this.ex = new Slide1(); }

    @Test
    public void verifyNumbers() {
        Double[] numbers = new Double[]{1.0, 3.4, -1.3};
        assertEquals("Biggest: 3.4\nLowest: -1.3", this.ex.verifyNumbers(numbers));
    }

    @Test
    public void listNumbers() {
        int[] expected = IntStream.rangeClosed(1,20).toArray();
        assertArrayEquals(expected, this.ex.listNumbers());
    }

    @Test
    public void listSquareNumbers() {
        int[] numbers = IntStream.rangeClosed(1,20).toArray();
        List<Integer> expectedSquareNumbers = new ArrayList<>();

        for (int n : numbers) {
            expectedSquareNumbers.add(n);
        }

        assertEquals(expectedSquareNumbers, this.ex.listSquareNumbers());
    }

    @Test
    public void listOddNumbers() {
        List<Integer> expectedOddNumbers = new ArrayList<>();

        for(int i=1; i<=50; i++) {
            if(i % 2 != 0) { expectedOddNumbers.add(i); }
        }

        assertEquals(expectedOddNumbers, this.ex.listOddNumbers());
    }

    @Test
    public void sumNumbers() {
        assertEquals(1275, this.ex.sumNumbers());
    }

    @Test
    public void listFactorial() {
        assertEquals(this.ex.listFactorial(), this.ex.listFactorial());
    }

    @Test
    public void bhaskara() {
        assertArrayEquals(new Double[]{3.0, -7.0}, this.ex.bhaskara(1, 4, -21));
    }
}
