package wbs.basic_data_types;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class MinMaxDemo {

	public static void main(String[] args) {
	
		/*
		 * wir geben für die Datentypen int und long den größtmöglichen und kleinstmöglichen Wert aus
		 * dazu verwenden wir die Konstanten der Wrapperklassen  
		 */
		
		System.out.println("Für Integer gelten folgende Grenzen");
		System.out.println("Kleinster möglicher Wert: " + MIN_VALUE + " Größter möglicher Wert:  "+ MAX_VALUE);

		System.out.println("Für Long gelten folgende Grenzen");
		System.out.println("Kleinster möglicher Wert: " + Long.MIN_VALUE + " Größter möglicher Wert:  "+ Long.MAX_VALUE);

		
	}

}
