package core.intro.methods;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n, a, b, c;
		int count = 0;
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any integer:");
		n = s.nextInt();
		a = n;
		c = n;
		while (a > 0) {
			a = a / 10;
			count++;
		}
		while (n > 0) {
			b = n % 10;
			sum = (int) (sum + Math.pow(b, count));
			n = n / 10;
		}
		if (sum == c) {
			System.out.println("Entered number is Armstrong.");
		} else {
			System.out.println("Entered number is not Armstrong.");
		}
	}
}
