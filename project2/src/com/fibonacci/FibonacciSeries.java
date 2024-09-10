package com.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    
    public List<Integer> generateFibonacci(int limit) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 0, b = 1;
        
        
        fibonacciNumbers.add(a);
        
        if (limit > 0) {
            fibonacciNumbers.add(b);
        }
        
        
        while (b <= limit) {
            int next = a + b;
            if (next > limit) break;
            fibonacciNumbers.add(next);
            a = b;
            b = next;
        }
        return fibonacciNumbers;
    }
}
