package wbs.liskov;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Was müssen wir berücksichtigen wenn wir eine Subklasse zu einer Klasse entwickeln
 * deren Konstruktor eine Checked Exception deklariert
 * 
 * 
 * Merke: Der Konstruktor der Subklasse kann eine allgemeinere (checked) Exception deklarieren,
 * aber keine Speziellere, also genau andersherum als bei Methoden!
 * Er kann auch zusätzliche checked Exceptions deklarieren!
 */

class Base5 {
	public Base5() throws IOException {
		/*
		 *  der Konstruktor von Base5 garantiert das
		 *  er im ungünstigsten Fall eine IOException wirft
		 *  er macht keine Garantie für erbende Klassen  
		 */
		if (Math.random() > 0.5) {
			throw new IOException();
		}
		
	}
}

class Sub5 extends Base5 {
	
	public Sub5() throws IOException, FileNotFoundException{
		/*
		 * offensichtlich muss beim Konstruktor der ableitenden Klasse
		 * eine allgemeinere oder die gleiche Exception deklariert werden als in der  
		 * Basisklasse
		 * Damit das ganze Funktioniert muss der Konstruktor hier wenigstens 
		 * die Exception werfen die in der Basisklasse definiert wurde 
		 * es gehen auch mehrere checked Exceptions
		 * 
		 */
		
	}
	
//	public Sub5() throws FileNotFoundException {
//		/*
//		 * Die FileNotFound ist spezieller als IO 
//		 * nach den Regeln der Liskov ist mir das nicht Klar
//		 *  
//		 * Vielleicht so rum: es wird vom Konstruktor der Basisklasse sicher gestellt
//	 	 * das Exceptions vom Typ IOException geworfen werden können
//	     * erbe ich davon muss ich wenigstens das Abfangen meine zusätzlichen Methoden
//	     * können aber auch weitere Exceptions auslösen
//		 */
//		
//	}
//	
	
	
}
