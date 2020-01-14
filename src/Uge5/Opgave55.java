package Uge5;
public class Opgave55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(11231,0,13));
	}
	public static String find(int k, int n, int b){
		int i=1;
		int z;
		int x;
		if (n == 0 && b == 0) {
			return "Error";
		}
		if (n == 0) {
			return "0";
		}
		do {
			z=n+k+(i-1);
			n=z;
			i++;
			
			x = z%b;
			
		} while (x != 0);
		if (z < 0) {
			return "Overflow";
		}if (z == 0) {
			return("Error");
		}else
		return Integer.toString(z);
		}
	}
