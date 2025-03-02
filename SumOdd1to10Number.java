package Day05;

public class SumOdd1to10Number {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i += 2;
		}
		System.out.println("The sum of odd numbers from 1 to 10 is : " + sum);
	}
}
