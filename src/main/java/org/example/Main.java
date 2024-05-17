package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Parallel stream to double each number and print
        numbers.parallelStream()
                .map(n -> n * 2)
                .forEach(System.out::println);  // Output: may vary due to parallel execution
    }
}