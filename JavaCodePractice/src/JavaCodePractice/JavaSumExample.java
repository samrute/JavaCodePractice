package JavaCodePractice;

import java.util.Scanner;


public class JavaSumExample {

	// Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }
    
    // Method to calculate the product of two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum of the two integers
        int result = sum(num1, num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        // Calculate the product of the two integers
        int multiplyResult = multiply(num1, num2);
        
        // Print the product result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + multiplyResult);

        // Close the scanner
        scanner.close();
    }
}
