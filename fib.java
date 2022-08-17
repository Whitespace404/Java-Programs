// Write a program to print the first 10 numbers
// of the Fibbonaci series using a for loop

public class fib {
	public static void main(String args[]) {
		int n1 = 0;
		int n2 = 1;

		for (int iterations = 1; iterations < 10; iterations++) {
		System.out.println(n1);
			int sum = n1 + n2;

			n1 = n2;
			n2 = sum;
		}
	}
}
