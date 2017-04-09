package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import static org.junit.Assert.*;

public class Ex3Test {

    private Ex3 ex;

    @Before
    public void setUp() { this.ex = new Ex3(); }

    @Test
    public void verifyNumbers() {
        int[] numbers = IntStream.rangeClosed(1,20).toArray();
        List<Integer> expectedSquareNumbers = new ArrayList<>();

        for (int n : numbers) {
            expectedSquareNumbers.add(n);
        }

        assertEquals(expectedSquareNumbers, this.ex.listSquareNumbers());
    }
}
