package csc372_week5_opt2;

import java.util.Scanner;

public class SumRecursion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = new int[5];
			
			for (int i = 0; i < numbers.length; i++) {
			    System.out.print("Enter number " + (i + 1) + ": ");
			    numbers[i] = scanner.nextInt();
			}
	
			int sum = sumNumbers(numbers, 0);
			System.out.println("The sum of all five numbers is: " + sum);
		}
    }
  
    public static int sumNumbers(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        } else {
            return numbers[index] + sumNumbers(numbers, index + 1);
        }
    }
}
