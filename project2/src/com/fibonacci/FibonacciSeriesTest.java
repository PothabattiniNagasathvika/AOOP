package com.fibonacci;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeriesTest {

    private FibonacciSeries fibonacciSeries = new FibonacciSeries();

    // Test case to check Fibonacci series up to 10
    @Test
    public void testFibonacciUpToTen() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8);
        List<Integer> result = fibonacciSeries.generateFibonacci(10);
        assertEquals(expected, result);
    }

    // Test case to check Fibonacci series up to 20
    @Test
    public void testFibonacciUpToTwenty() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13);
        List<Integer> result = fibonacciSeries.generateFibonacci(20);
        assertEquals(expected, result);
    }

    // Test case for Fibonacci series with a limit of 1
    @Test
    public void testFibonacciUpToOne() {
        List<Integer> expected = Arrays.asList(0, 1, 1);
        List<Integer> result = fibonacciSeries.generateFibonacci(1);
        assertEquals(expected, result);
    }

    // Test case for Fibonacci series with limit of 0
    @Test
    public void testFibonacciUpToZero() {
        List<Integer> expected = Arrays.asList(0, 1);
        List<Integer> result = fibonacciSeries.generateFibonacci(0);
        assertEquals(expected, result);
    }
}
