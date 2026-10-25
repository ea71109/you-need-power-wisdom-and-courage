package org.example;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumberCalculator {

    public int value(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        if ( n <= 1)
        {
            return n;
        }
        return n + value(n-1);
    }

    public int add(int n, int m)
    {
        return value(n) + value(m);
    }

    public int subtract(int n, int m)
    {
        return value(n) - value(m);
    }

    public int multiply(int n, int m)
    {
        return value(n) * value(m);
    }

    public double divide(int n, int m)
    {
        // treating m as the denominator
        if (m == 0)
        {
            throw new IllegalArgumentException("Can't divide by zero.");

        }
        return (double) value(n) / value(m);
    }

    public List<Integer> sequence(int n)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
        {
            list.add(value(i));
        }
        return list;
    }
}
