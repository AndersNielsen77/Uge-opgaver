package aflevering2;

public class Broek2 {
	private int t;
	private int n;

//	S�tter vaerdierne for t og n.
	public Broek2(int t, int n) {
		this.t = t;
		this.n = n;
		
		if (n == 0) {
			throw new IllegalArgumentException("Naevner m� ikke veare 0");
		}
	}

//	Get for t.
	public int getnextt() {
		return t;
	}

//	Get for n.
	public int getnextn() {
		return n;
	}

//	Plus Broek.
	public void plus(Broek f) {
		t = ((t * f.getnextn()) + f.getnextt() * n);
		n = (n * f.getnextn());
		reducer();
	}

//	Minus Broek.
	public void minus(Broek f) {
		t = ((t * f.getnextn()) - (f.getnextt() * n));
		n = (n * f.getnextn());
		reducer();
	}

//	Gange Broek.
	public void gange(Broek f) {
		t = (t * f.getnextt());
		n = (n * f.getnextn());
		reducer();
	}

//	Divider Broek.
	public void divider(Broek f) {
		t = (t * f.getnextn());
		n = (n * f.getnextt());
		if (n == 0) {
			throw new IllegalArgumentException("Naevner m� ikke veare 0");
		}
		reducer();
	}

//	Tage reciprok v�rdi (Bytte n og t).
	public void reciprok() {
//		Hvis der ikke har vaeret en regne operation f�r er vaerdierne t og n = 0.
		if (t == 0 && n == 0) {
			int i = n;

			n = t;
			t = i;
			reducer();
//		Ugyldigt at divider med 0.
		} else if (t == 0) {
			throw new IllegalArgumentException("Taeller m� ikke veare 0");
		} else {
			int i = n;
			n = t;
			t = i;
			reducer();
		}
	}

	public void reducer() {
		int divtal = 0;

		for (int i = 1; i <= t || i <= n; i++) {
			if (t % i == 0 && n % i == 0) {
				divtal = i;
			}
		}
		t = t / divtal;
		n = n / divtal;
		if (t < 0 && n < 0) {
			t = t * -1;
			n = n * -1;
		}
	}
	
//	To String (return t/n).
	public String toString() {
		return t + "/" + n;
	}
}