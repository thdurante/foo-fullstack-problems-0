package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Ex4Test {

    private Ex4 ex;

    @Before
    public void setUp() { this.ex = new Ex4(); }

    @Test
    public void verifyNumbers() {
        List<Integer> expectedOddNumbers = new ArrayList<>();

        for(int i=1; i<=50; i++) {
            if(i % 2 != 0) { expectedOddNumbers.add(i); }
        }

        assertEquals(expectedOddNumbers, this.ex.listOddNumbers());
    }
}
