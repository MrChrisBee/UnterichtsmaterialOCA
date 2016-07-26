package wbs.intro;

public class StaticOrNotDemo {

	public static void main(String[] args) {
		double x = 4.0;
		String s1 = "Anton";
		String s2 = "Berta";
		
		/*
		 * Wir geben die Quadratwurzel von x aus
		 * siehe java.lang.Math
		 */
		
		System.out.println(Math.sqrt(x));
		/* in der API sind nur statische Methoden zu finden also kann diese Klasse nichts sinnvollen mit Objekten anstellen
		 * nach der Field Summary kommt eigentlich eine Constructor Summary, die ist hier gar nicht zu finden
		 * kein Konstruktor keine Objekte
		 * Methoden werden klein geschrieben Klassen groß wenn alle sich daran halten kann man also schon
		 * am ersten Zeichen erkennen das Groß geschriebene "Methodenaufrufkonstrukte" statische Aufrufe sind
		 * 
		 * Wenn das was wir berechnen NICHT von den Eigenschaften des Objektes abhängen geht es um eine Statische Methode  
		 */
		
		
		
		/*
		 * Wir geben das erste Zeichen von s1 aus
		 * siehe java.lang.String
		 */
		System.out.println(s1.charAt(0));
		/*
		 * Der String s1 ist ein Objekt, ich kann über das Objekt auf die Methoden der Klasse zugreifen, nicht Statisch
		 * Es gibt einen Haufen Einträge in der API bei der Constructor Summary, keiner davon ist Statisch
		 * es steht nichts vor Ihnen also denke ich das alle public oder default deklariert sind
		 */
		
		/*
		 * Wir geben das erste Zeichen von s2 aus
		 * siehe java.lang.String
		 * Alternativ nutze ich mal substring
		 */
		System.out.println(s2.substring(0, 1));
		/*
		 * Wieder geht mein Aufruf über das Objekt von dem ich etwas wissen will, 
		 */
		
	}

}
