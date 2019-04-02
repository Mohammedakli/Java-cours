
public class Pgcd {
	public static void main(String[] args) {}
	static int computeGcd(int a, int b) {
	     a = 16;
	     b = 26;
	     if (b == 0) {
	    	 return a;
	     }
	     else {
	    	 return computeGcd (b, a % b);
	     }
	}

}


