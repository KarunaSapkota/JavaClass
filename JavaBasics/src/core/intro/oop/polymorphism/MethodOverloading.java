package core.intro.oop.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(add(23, 45));
		System.out.println(add(34, 54, 44));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}
}