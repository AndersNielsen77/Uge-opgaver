package aflevering;

import java.util.*;

public class cprnummer {

	public static void main(String[] args) {

		// Opretter scanner og giver mulighed for at indtaste CPR nummer.
		// Antager at brugeren indtaster udelukkende tal uden mellemrum eller
		// bindestreg.
		Scanner console = new Scanner(System.in);
		String cprnr = console.next();

		// Indeler dag m�nede og �r som int.
		int dd = Integer.parseInt(cprnr.substring(0, 2));
		int mm = Integer.parseInt(cprnr.substring(2, 4));
		int aa = Integer.parseInt(cprnr.substring(4, 6));

		// Oprettet try - catch for at kunne varificere om cprnummeret er utilg�ngeligt.
		try {
			antalDageTjek(dd, mm, aa);
			sidsteTal(cprnr, dd, mm, aa);
		} catch (IllegalArgumentException e) {
			System.out.println("ikke et cprnummer");
		}

	}

	private static void antalDageTjek(int dd, int mm, int aa) {
		// Hele "m�neder" metoder gennemg�r om der fremg�r ulovlige intastet -
		// m�nede dage og �r i frohold til hinanden samt skud�r.
		if (mm > 12) {
			throw new IllegalArgumentException();
		}
		// Det vil v�re muligt kun at skrive "dd > 31" men for at illustrere m�nederne.
		if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)&&(dd > 31)) {
			throw new IllegalArgumentException();
		}
		if ((mm == 4 || mm == 6 || mm == 9 || mm == 11)&&(dd > 30)) {
			throw new IllegalArgumentException();
		}
		if ((mm == 2 && aa % 4 == 0)&&(dd > 29)) {
			throw new IllegalArgumentException();
		}
		if ((mm == 2 && aa % 4 != 0)&&(dd > 28)) {
			throw new IllegalArgumentException();
		}
	}

	public static void sidsteTal(String cprnr, int dd, int mm, int aa) {
		// Tjekker for om CPR nummeret er 10 l�ngder langt ellers
		// IllegalArgumentException.
		if (cprnr.length() == 10) {
			// Opretter string "SidsteTal" for det sidste tal.
			String SidsteTal = cprnr.substring(cprnr.length() - 1);

			// Laver "SidsteTal" om til en int.
			int SidsteTalInt = Integer.parseInt(SidsteTal);

			// Tjekker hvorvidt modelus til sidste tal restv�rdi er lig 0.
			if (SidsteTalInt % 2 == 0) {
				System.out.println("lige cprnummer");
			} else
				System.out.println("ulige cprnummer");
		} else
			throw new IllegalArgumentException();
	}
}