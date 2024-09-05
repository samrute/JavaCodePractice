package JavaCodePractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Map;


public class JavaStreamExample {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Numbers: " + numbers);

        // Filter out even numbers
        List<Integer> oddNumbers = numbers.stream()
            .filter(n -> n % 2 != 0)
            .collect(Collectors.toList());
        System.out.println("Odd numbers: " + oddNumbers);
        
        // Filter out odd numbers
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Even numbers: " + oddNumbers);


        // Map each number to its square
        List<Integer> squaredNumbers = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);

        // Reduce the list to the sum of its elements
        int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);
        
        // Sort the numbers in descending order
        List<Integer> sortedNumbers = numbers.stream()
        		.sorted((a,b) -> b-a)
        		.collect(Collectors.toList());
        System.out.println("Sorted numbers (descending): " + sortedNumbers);
        
        // Find the maximum value
        Optional<Integer> maxNumber = numbers.stream()
            .max(Integer::compareTo);
        maxNumber.ifPresent(max -> System.out.println("Maximum number: " + max));

        // Find the minimum value
        Optional<Integer> minNumber = numbers.stream()
            .min(Integer::compareTo);
        minNumber.ifPresent(min -> System.out.println("Minimum number: " + min));
        
        // Group numbers by even and odd
        Map<Boolean, List<Integer>> groupedByEvenOdd = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Grouped by even and odd: " + groupedByEvenOdd);
        
    }
}