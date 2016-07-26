package wbs.exceptions;

public class Unchecked1Demo {

	public static void main(String[] args) {

		// Das Ergebnis eines Aufrufs dieser Klasse hängt ab vom ersten übergebenen Parameter
		// Es wird eine ArrayIndexOutOfBounds Exception geworfen wenn kein Parameter übergeben wurden
		// dann versucht die VM auf ein Feld eines nicht vorhandenen Arrays zuzugreifen
		// Wenn es sich bei den ersten Übergabeparameter nicht um eine reine Zahl mit maximal einem Vorzeichen
		// handelt wird eine NumberFormatException von parseInt geworfen.
		// besteht die übergabe im betreffenden Feld nur aus maximal einem Vorzeichen und einer Zahl die sich  
		// im Wertebereich von Int befindet wird diese ausgegeben
		
		// eine nicht behandelte Exception führt zum Abbruch des Programms
		// und der Ausgebe des ExceptionStackTraces 
		
		// sowohl ArrayIndexOutOfBounds als auf NumberFormat sind Subklassen von RuntimeException 
		// also uncheckedExceptions
		
		/*
		 * ACHTUNG! unterscheide Laufzeitfehler (exceptions) Compilerfehler !!!
		 */
		
		int zahl = Integer.parseInt(args[0]);

		System.out.println(zahl);

	}

}
