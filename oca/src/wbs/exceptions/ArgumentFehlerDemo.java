package wbs.exceptions;

public class ArgumentFehlerDemo {
	/*
	 * das Programm wird mit beliebig vielen Argumenten aufgerufen
	 * jedes Argument wird in einen int umgewandelt
	 * am Ende wird die Summe alle Zahlen ausgegeben 
	 * und die Anzahl der Argumente die nicht in einen Int umgewandelt werden konnten
	 * bsp.: 30 20 30 dd dfr 
	 * ausgabe: 80 2
	 *  
	 */

	public static void main(String[] args) {
		double summe = 0;
		int countErrors = 0;
		for (String arg : args) {
			try {
				summe +=  Double.parseDouble(arg);
			} catch (NumberFormatException e) {
				countErrors++;
			}
		}
		System.out.println("Es gab " + countErrors + " nicht Zahlen Werte \nund die Summe ist: " + summe);
	}
}
