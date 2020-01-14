package uge4;

public class test {
	public static class JavaExample1 {

		public static void main(String[] args) {

			String name = "mkyong is learning Java 123";

			System.out.println(name.contains("Java"));      // true
			System.out.println(name.contains("java"));      // false
			System.out.println(name.contains("MKYONG"));    // false
			System.out.println(name.contains("mkyong"));    // true

			if (name.contains("Java")) {
				System.out.println("Hello Java");
			} else {
				System.out.println("abc...");
			}

		}

	}
}