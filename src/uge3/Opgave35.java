package uge3;

public class Opgave35 {
	public static void main(String[] args)  {
		int num = 3;
		System.out.println(Factorial.factorial(3));
	}
	public static int factorial(int n) {
		int a = 1, i;
		for (i=2; i<=n; i++)
			// a = a* i
			a *= i;
		return a;
	}
}