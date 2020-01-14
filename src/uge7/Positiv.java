package uge7;

public class Positiv {
	private int t;

	public Positiv(int t) throws Exception {
		// Add body
		if (t < 0) {
			throw new Exception();
		}
		this.t = t;
	}

	public String toString() {
		return Integer.toString(t);
	}
	
	public int get() {
		return t;
	}
}
