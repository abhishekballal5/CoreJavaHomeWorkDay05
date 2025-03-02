package Day05;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = scanner.nextInt();

		long factorial = 1;

		int i = 1;
		while (i <= num) {
			factorial *= i;
			i++;
		}
		System.out.println("The factorial of " + num + " is: " + factorial);

		scanner.close();
	}
}
