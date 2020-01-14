package uge1;
public class Opgave14 {
	
	public static void main(String[] args) {
		tag();
		box();
		
		System.out.println("I D T UI I D T UI I D T UI");
		System.out.println("ILyngbyI ILyngbyI ILyngbyI");

		
		box();
		tag();
		}
		
		private static void tag() {
			for (int i = 0; i < 1; i++) {
				minPrint("   /\\     ");
				minPrint("  /  \\    ");
				minPrint(" /    \\   ");
				}
		}
		
		private static void box() {
			for (int i = 0; i < 1; i++) {
				minPrint("+------+");
				minPrint("I      I");
				minPrint("I      I");
				minPrint("+------+");
				}
		}
		
		private static void minPrint(String tekst) {
			System.out.print(tekst);
			System.out.print(tekst);
			System.out.println(tekst);

		}

}
