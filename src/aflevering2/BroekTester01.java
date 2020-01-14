package aflevering2;

public class BroekTester01 {

	public static void main(String[] args) {
		Broek b = new Broek(0,2);
		Broek c = new Broek(1,3);
		b.minus(c);
		System.out.println(b);
	}

}