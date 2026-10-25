package org.example;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleNumberCalculatorTest {
    private TriangleNumberCalculator calculator = new TriangleNumberCalculator();

    @Test
    public void valueOfZeroTest()
    {
        assertEquals(0, calculator.value(0));
    }
    @Test
    public void valueOfOneTest()
    {
        assertEquals(1, calculator.value(1));
    }

    @Test
    public void valueOfTwoTest()
    {
        assertEquals(3, calculator.value(2));
    }

    @Test
    public void additionWithZeroTest()
    {
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void additionWithOneTest()
    {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void additionWithTwoTest()
    {
        assertEquals(6, calculator.add(2, 2));
    }

    @Test
    public void subtractWithZeroTest()
    {
        assertEquals(0, calculator.subtract(0, 0));
    }
    @Test
    public void subtractWithOneTest()
    {
        assertEquals(2, calculator.subtract(2, 1));
    }

    @Test
    public void subtractWithTwoTest()
    {
        assertEquals(7, calculator.subtract(4, 2));
    }

    @Test
    public void multiplyWithZeroTest()
    {
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    public void multiplyWithOneTest()
    {
        assertEquals(1, calculator.multiply(1, 1));
    }

    @Test
    public void multiplyWithTwoTest()
    {
        assertEquals(9, calculator.multiply(2, 2));
    }

    @Test
    public void divideWithZeroTest()
    {
        assertEquals(0, calculator.divide(0, 1));
    }

    @Test
    public void divideWithOneTest()
    {
        assertEquals(1, calculator.divide(1, 1));
    }

    @Test
    public void divideWithTwoTest()
    {
        assertEquals(5, calculator.divide(5, 2));
    }

    @Test
    public void sequenceWithZeroTest()
    {
        List<Integer> list = List.of();
        assertTrue(list.isEmpty());
    }

    @Test
    public void sequenceWithOneTest()
    {
        List<Integer> list = List.of(1);
        assertEquals(list, calculator.sequence(1));
    }

    @Test
    public void sequenceWithTwoTest()
    {
        List<Integer> list = List.of(1, 3);
        assertEquals(list, calculator.sequence(2));
    }

}
