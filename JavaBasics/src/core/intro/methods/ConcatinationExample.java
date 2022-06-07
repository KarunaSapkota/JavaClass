package core.intro.methods;

import java.util.Scanner;

public class ConcatinationExample {
	public static void main(String[] args) {
		String fName, lName;
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name: ");
		fName = sc.next();
		System.out.println("Last Name: ");
		lName = sc.next();

		String fullName = stringConcatenate(fName, lName);
		System.out.println("Hello " + fullName);
	}

	private static String stringConcatenate(String fName, String lName) {
		String fullName = fName + " " + lName;
		return fullName;
	}

}
