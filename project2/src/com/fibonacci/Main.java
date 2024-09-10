package com.fibonacci;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the FibonacciSeries class
        FibonacciSeries fibonacciSeries = new FibonacciSeries();

        // Read user input for the limit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        scanner.close();

        // Generate the Fibonacci series up to the given limit
        List<Integer> fibonacciNumbers = fibonacciSeries.generateFibonacci(limit);

        // Print the generated Fibonacci numbers
        System.out.println("Fibonacci series up to " + limit + ": " + fibonacciNumbers);
    }
}
