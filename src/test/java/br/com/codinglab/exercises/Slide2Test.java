package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Slide2Test {

    private Slide2 ex;

    @Before
    public void setUp() {
        this.ex = new Slide2();
    }

    @Test
    public void numberOfChars() {
        assertEquals(4, ex.numberOfChars("Test"));
    }

    @Test
    public void upper() {
        assertEquals("TEST", ex.upper("test"));
    }

    @Test
    public void roundCeil() {
        assertEquals((Double) 3.0, ex.roundCeil(2.3));
    }

    @Test
    public void roundFloor() {
        assertEquals((Double) 2.0, ex.roundFloor(2.3));
    }

    @Test
    public void roundNormal() {
        assertEquals(2.0, ex.roundNormal(2.3), 0);
    }

    @Test
    public void biggestAndLowest() {
        assertArrayEquals(new Double[]{2.5, 2.0}, ex.biggestAndLowest(2.0, 2.5));
    }

    @Test
    public void randomNumber() {
        System.out.println("Random number: " +ex.randomNumber());
    }

    @Test
    public void squareOfNumber() {
        assertEquals((Double) 4.0, ex.squareOfNumber(2.0));
    }

    @Test
    public void squareRootOfNumber() {
        assertEquals((Double) 8.0, ex.squareRootOfNumber(64.0));
    }

    @Test
    public void basicOperations() {
        System.out.println(ex.basicOperations(3.0, 6.0));
    }

    @Test
    public void nameAndPhoneValid() {
        assertTrue(ex.nameAndPhoneValid("Test", "999"));
        assertFalse(ex.nameAndPhoneValid("111", "xxx"));
    }

    @Test
    public void isCpf() {
        assertTrue("Valid cpf", ex.isCpf("52998224725"));
        assertTrue("Valid cpf", ex.isCpf("73412775134"));
        assertTrue("Valid cpf", ex.isCpf("43579531115"));

        assertFalse("Invalid cpf", ex.isCpf("12345678912"));
        assertFalse("Invalid cpf", ex.isCpf("11111111111"));
        assertFalse("Invalid cpf", ex.isCpf("00000000000"));
    }
}
