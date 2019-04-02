package fr.arolla.java8esgi.gcd;
public class Pgcd {
	
	public static void main(String[] args) {
		
		if (args.length != 2) {
            System.err.println("2 arguments attendus : <a> <b>");
            System.exit(1);
        }
        Pgcd pgcd = new Pgcd();
        int divisor = pgcd.computeGcd();

        System.out.println(divisor);
		
		
		
		
		
		
	}
	 public int computeGcd() {
	        int a = 16;
			int b = 28;
			return computeGcd(a, b);
	    }
	private static int computeGcd(int a, int b) {
	     a = 16;
	     b = 28;
	     if (b == 0) {
	    	 return a;
	     }
	     else {
	    	 return computeGcd (b, a % b);
	     }
	}

}


