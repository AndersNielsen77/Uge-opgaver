package aflevering2;

public class Broek {
	private int t;
	private int n;

//	S�tter vaerdierne for t og n.
	public Broek(int t, int n) {
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
		reducer(t, n);
	}

//	Minus Broek.
	public void minus(Broek f) {
		t = ((t * f.getnextn()) - (f.getnextt() * n));
		n = (n * f.getnextn());
		reducer(t, n);
	}

//	Gange Broek.
	public void gange(Broek f) {
		t = (t * f.getnextt());
		n = (n * f.getnextn());
		reducer(t, n);
	}

//	Divider Broek.
	public void divider(Broek f) {
		t = (t * f.getnextn());
		n = (n * f.getnextt());
		if (n == 0) {
			throw new IllegalArgumentException("Naevner m� ikke veare 0");
		}
		reducer(t, n);
	}

//	Tage reciprok v�rdi (Bytte n og t).
	public void reciprok() {
//		Hvis der ikke har vaeret en regne operation f�r er vaerdierne t og n = 0.
		if (t == 0) {
//			n = 0;
			throw new IllegalArgumentException("Taeller m� ikke veare 0");
		} else {
			int i = n;
			n = t;
			t = i;
			reducer(t, n);
		}
	}

	public void reducer(int t, int n) {
//		Reducere ikke hvis t eller n er lig 0.
		if (t == 0 || n == 0) {
			return;
		} else {
			int divider_tal = divtal(t, n);

			this.t = t / divider_tal;
			this.n = n / divider_tal;
			if (t < 0 && n < 0)
				t = t * -1;
			n = n * -1;
		}
	}

	public int divtal(int x, int y) {
		if (x == 0) {
			return y;
		}
		return divtal(y % x, x);
	}

//	To String (return t/n).
	public String toString() {
		return t + "/" + n;
	}
}