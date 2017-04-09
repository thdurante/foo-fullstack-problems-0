package br.com.codinglab.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Slide3Test {

    private Slide3 ex;

    @Before
    public void setUp() {
        this.ex = new Slide3();
    }

    @Test
    public void energyCost() {
        assertEquals((Double) 90.0, ex.energyCost(10.0, 10.0));
    }

    @Test
    public void finalGrade() {
        assertEquals((Double) 7.569, ex.finalGrade(2.5,7.8, 8.6, 10.0));
    }

    @Test
    public void isLeapYear() {
        assertTrue(this.ex.isLeapYear(1988));
        assertTrue(this.ex.isLeapYear(2048));
        assertTrue(this.ex.isLeapYear(2016));
        assertTrue(this.ex.isLeapYear(2052));

        assertFalse(this.ex.isLeapYear(2017));
        assertFalse(this.ex.isLeapYear(1999));
        assertFalse(this.ex.isLeapYear(2018));
        assertFalse(this.ex.isLeapYear(1845));
    }

    @Test
    public void sumOdds() {
        assertEquals(2550, this.ex.sumOdds());
    }
}
