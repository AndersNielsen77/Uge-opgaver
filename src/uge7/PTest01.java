package uge7;

public class PTest01 {
	public static void main(String[] args) {
		try {
			Positiv t = new Positiv(5);
			System.out.println(t.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
