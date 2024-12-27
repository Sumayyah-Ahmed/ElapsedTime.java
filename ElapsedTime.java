package demo;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("My First Java Project and I am so happy...Sumayyah");
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the limit
        System.out.print("Enter the limit for the sequence (e.g., 1048576): ");
        int limit = scanner.nextInt();
        
        // Start time
        long startTime = System.nanoTime();

        // Initialize variables
        int sum = 0;
        int current = 1;

        // Iterate through the sequence
        while (current <= limit) {
            sum += current;
            current *= 2;  // Multiply by 2 for the next term in the sequence
        }

        // End time
        long endTime = System.nanoTime();

        // Calculate the elapsed time
        long elapsedTime = endTime - startTime;

        // Output the sum and elapsed time
        System.out.println("Sum (Iterative): " + sum);
        System.out.println("Elapsed Time (Iterative): " + elapsedTime + " nanoseconds");

        // Close the scanner
        scanner.close();
    }
}

