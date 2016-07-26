package wbs.exceptions;

import java.math.BigInteger;

public class FakultaetDemo {
/*
 * Wir schreiben eine Methode die die Fakultät einer Zahl berechnet.
 * !4 = 1*2*3*4 = 24
 * Wir liefern das Ergebnis als BigInteger
 * Methodenname: fakultaet(int n)
 * 
 * fakultaet(0) -> 1
 * fakultaet(1) -> 1
 * 
 * die Methode wirft eine IllegalArgumentException wenn das Aufrufargument < 0 ist
 */
	
	public static void main(String[] args) {
		/*
		 * Wir geben die Fakultät aller Aufruf Argumente aus. 
		 * Ist ein Argument fehlerhaft wird eine Meldung ausgegeben und mit dem Nächsten fortgesetzt
		 */
		int x;
		for(String arg:args) {
			
			try {
				x = Integer.parseInt(arg);
			} catch (NumberFormatException e) {
				System.out.println("Das Argument " + arg + " ist ungültig! ");
				continue;
			}
			if (x < 0 ) {
				throw new IllegalArgumentException();
			}
			if (x == 0 || x == 1) {
				System.out.println("Die Fakultät von " + x + " ist 1 !");
				continue;
			}
			// hier ist x definitiv größer 1
			System.out.println("Die Fakultät von " + x + " ist " + fakultaet(x).toString() + " !");
			
		}
		 
		

	}
	
	private static BigInteger fakultaet(int n ){
		// sollte nur mit werten > 1 aufgerufen werden
		BigInteger result = new BigInteger("2");
			while (n > 2) {
				result = result.multiply(new BigInteger(n+""));
				n--;
			}
		return result; 
	}

}
