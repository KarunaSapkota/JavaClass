package core.intro.methods;

import java.util.Scanner;

public class FunctionOverloading {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int dig = digits(num1);
		System.out.println("Number of digits in the given number is: " + dig);
		System.out.println("Enter base and the power: ");
		int b = sc.nextInt();
		int p = sc.nextInt();
		int res = power(b, p);
		System.out.println("The result is:" + res);
	}

	private static int power(int b, int p) {
		int res = 1;
		while (p != 0) {
			p--;
			res *= b;
		}
		return res;
	}

	private static int digits(int num1) {
		int count = 0;
		while (num1 != 0) {
			num1 /= 10;
			count++;

		}
		return count;
	}

}
