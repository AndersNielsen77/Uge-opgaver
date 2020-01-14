package uge1;
public class Opgave7 {
	
	public static void main(String[] args) {
		tag();
		box();
		
		System.out.println("I D T UI I D T UI");
		System.out.println("ILyngbyI ILyngbyI");

		
		box();
		tag();
		}
		
		private static void tag() {
			for (int i = 0; i < 1; i++) {
				System.out.println("   /\\       /\\   ");
				System.out.println("  /  \\     /  \\   ");
				System.out.println(" /    \\   /    \\   ");
				}
		}
		
		private static void box() {
			for (int i = 0; i < 1; i++) {
				System.out.println("+------+ +------+");
				System.out.println("I      I I      I");
				System.out.println("I      I I      I");
				System.out.println("+------+ +------+");
				}
		}

}
