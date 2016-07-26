package wbs.exceptions;

public class NumberUtil {

	/*
	 * Wir schreiben eine Methode, die einen als String
	 * übergebenen Bruch in einen double Umwandelt
	 * 
	 * bsp.: "3/4"  -> 0.75
	 * 
	 * wenn der Nenner des Strings 0 ist, wird eine kontrollierte Exception geworfen.
	 * Die Exception wird hier von der Methode geworfen
	 * 
	 * Notwendig dafür: eine Exception-Klasse MyBruchException
	 * 
	 * 
	 */

	public static double string2Double(String s) throws MyBruchException {
		String[] s2 = s.split("/");
		double result = Integer.parseInt(s2[0]);
		for (int i = 1; i < s2.length; i++) {
			int i2 = Integer.parseInt(s2[i]);
			if (i2 == 0) {
				throw new MyBruchException();
			}
			result /= i2;
		}
		return result;
	}
} 
   