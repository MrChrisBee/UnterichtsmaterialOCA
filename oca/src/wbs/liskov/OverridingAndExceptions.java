package wbs.liskov;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

class Base1 {
	public void m1() {

	}

	public void m2() throws IOException {

	}

	public void m3() throws FileNotFoundException {

	}
}

/*
 * Wir liefern für jede der mETHODEN VON bASE!  jeweils eine Korrekte 
 * und eine nicht korrekte Überschreibung mit Blick auf Exceptions
 * 
 *  Vererbte Methoden müssen sich bei Ihren Exceptions an den Eltern Orientieren
 *  Wenn die Basisklasse sagt das Sie keine Exceptions Wirft dann darf auch 
 *  die davon erbende Klasse keine Exception werfen
 */
class Sub1 extends Base1 {
	public void m1() throws ArrayIndexOutOfBoundsException { // unchecked geht immer
		

	}

	public void m2() throws FileNotFoundException { // ist eine Spezialisierung 

	}

	public void m3() throws NoSuchElementException {
		// Spezieller ist nicht also Runtime
	}

}

class Sub2 extends Base1 {
//	public void m1() throws IOException {  // eine Generalisierung - verallgemeinerung
//		// m1 hat versprochen keine Exceptions zu werfe 
//		// daran muss sich eine Erbende Klasse halten
//	}

//	public void m2() throws Exception {
//		// m2 hat versprochen nicht mehr als eine FnF Exception zu werfen 
//		// Exception ist allgemeiner 
//	}

//	public void m3() throws SQLException {
//		
//	}

}
