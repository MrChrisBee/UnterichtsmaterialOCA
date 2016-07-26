package wbs.schleifen;


/*
 * Muss das Interface Iterable Implementieren
 * muss toString() von Objekt überschreiben
 * muss eine nicht Statische Methode anzahlPrimfaktoren haben
 * hat einen Konstruktor mit dem Parameter Integer
 * sie ist nicht abstrakt
 * es muss eine Möglichkeit geben das die Klasse Ihre Werte hinterlegt
 * das heißt vermutlich das sowohl die ganze Zahl vom Konstruktor als Integer 
 * als auch die einzelnen Primfaktoren in einer Liste<Integer> gesichert werden können  
 */


public class IterableZahlDemo {

	public static void main(String[] args) {
		IterableZahl zahl = new IterableZahl(12345); 
		System.out.println("zahl" + zahl);
		System.out.println("anzahl Primfaktoren: " + zahl.anzahlPrimfaktoren());
		System.out.println("Primfaktoren");
		for (Integer primfaktor : zahl) {
			System.out.println(primfaktor);
		}
	}

}
