package wbs.interfaces;

public class IFunctionDemo {

	// Der Referenztyp (reference-type) von function ist IFunction
	// er wird hier nicht verändert, er steht zur compile-time fest und ändert
	// sich nie

	// beim ersten Aufruf der Methode f referenziert die Methode function ein
	// Objekt vom Typ Quadrat
	// der object-type ist jetzt also Quadrat

	// beim zweiten Aufruf der Methode f referenziert die Methode function ein
	// Objekt vom Typ Hoch3
	// der object-type ist jetzt also Hoch3

	// beim Aufruf einer Methode entscheidet der object-type und NICHT der
	// reference-type über die Wahl der Methodenimplementierung

	// MERKE 
	// Der reference-type eines Feldes oder einer Variable ändert sich nie
	// der object-type kann zur Laufzeit immer wieder ein anderer sein 
	
	public static void main(String[] args) {

		// wir deklarieren eine Variable vom Typ des Interfaces IFunction
		IFunction function;

		// wir weisen dieser Variablen eine Referenz auf ein Objekt vom Typ
		// Quadrat zu
		function = new Quadrat();

		// gebe das Quadrat von 5 mit Hilfe der definierten lokalen Variablen
		// aus
		System.out.println("Das Quadrat von 5 ist " + function.f(5));

		// wir weisen jetzt der variablen function eine Referenz auf ein Objekt
		// vom type HochDrei zu
		function = new Hoch3();

		// gebe die 3. Potenz von 5 mit Hilfe der definierten lokalen Variablen
		// aus
		System.out.println("Die 3. Potenz von 5 ist " + function.f(5));
		
		
		// wir geben nun die 3. Potenzen aller ungeraden Zahlen zwischen 30 und 50 aus
		System.out.println("---------------------------------------------------------------");
		for(int i=31, j=1; i<50;i += 2,j++) {
			System.out.println(j + ". Die 3. Potenz von " + i + " ist " + function.f(i));
		}
		System.out.println("---------------------------------------------------------------");

		// durch die definition eines parametrisierten Konstruktors 
		// werden die in der Implementierung der Klasse LinareFunktion
		// definierten Felder a und b gesetzt womit das erzeugte Objekt
		function = new LineareFunktion(3,1);
		// function mit den oben genannten Werten für a und b erzeugt wird 
		// in function ist jetzt durch a, b und den Methodenrumpf alles weitere definiert
		
		// gebe für alle Zahlen von 1 bis 10 den Wert der Funktion y = 3 * x + 1 aus
		for (double i=1; i<=10; i++) {
		System.out.println( "3x + 1 bei einem x von " + i + " ist " + function.f(i));
		}
		System.out.println("---------------------------------------------------------------");
		// gebe für alle Zahlen von 1 bis 10 den Wert der Funktion y = 3 * x *x + 5 * x + 1 aus
		// Hinweis: eine Funktion in der Form ax²+bx+c heißt Parabel
		function = new Parabel(3,5,1);
		for (double i=1; i<=10; i++) {
			System.out.println( "3x² + 5x + 1 bei einem x von " + i + " ist " + function.f(i));
			}
		System.out.println("---------------------------------------------------------------");
		// gebe für alle Zahlen von 1 bis 10 den Wert der Funktion y = 4 * x *x + 7 * x + 3 aus
		function = new Parabel(4,7,3);
		for (double i=1; i<=10; i++) {
			System.out.println( "4x² + 7x + 3 bei einem x von " + i + " ist " + function.f(i));
			}
		System.out.println("---------------------------------------------------------------");
		/*
		 * Merke 
		 * 
		 * für eine Variable oder ein Feld dürfen die Methoden des reference-type aufgerufen werden!!
		 * Andernfalls gibt es einen Kompilierfehler
		 *  
		 */
		// Referenz-type: IFunktion
		// Objekt-type: Parabel
		function = new Parabel(3,5,1);
		//ok: die Funktion f() gehört zum Interface IFunktion
		System.out.println( "3x² + 5x + 1 bei einem x von 5 ist " + function.f(5));
		/* 
		 * folgendes geht nicht:
		 * System.out.println( function.getA());
		 * die Methode getA() gehört zwar zum Objekt-Type nicht aber zum 
		 * Reference-type des Objektes
		 * Will man auf Methoden des Objekt-Typ zugreifen muss man durch folgende Konstruktion:  
		 */
		System.out.println( "Der Wert von a ist derzeit " + ((Parabel) function).getA());
		/*
		 * eine Umwandlung -> Casting nutzen
		 */
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		System.out.println("---------------------------------------------------------------");
		

		
	} 

}
