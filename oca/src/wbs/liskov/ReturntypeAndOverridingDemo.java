package wbs.liskov;

class Base4 {
	public Number m1() {
		return null;
	}

	public CharSequence m2() {
		return null;
	}
}

/*
 * Regel: Zwischen dem Return-Typ  der Überschreibenden Methode und dem
 * Return-Typ der überschriebenen Klasse muss eine IS A Beziehung bestehen
 */


class Sub4 extends Base4 {
	/*
	 * Wir erstellen funktionierende und nicht finktionierende Überschreibungen von m1 und m2
	 * 
	 * Meine These ist schon wiederlegt, ich habe gedacht mein Rückgabewert ist allgemeiner als der 
	 * von dem ich Erbe. Leider scheint es genau Umgekehrt. 
	 * Die Abgeleiteten Methoden mussen einen Rückgabewert liefer der gleich oder Spezieller ist als der 
	 * Rückgabewert der Elternklasse. 
	 * 
	 */
	public Integer m1() {
		return null; // ein Speziellerer Rückgabewert ist möglich
	}

	public String m2() {
		return null; // ein Speziellerer Rückgabewert ist möglich
	}
	//
	// public Object m1(){ // Das geht nicht Objekt ist allgemeiner als Number
	// return null;
	// }
	// public Object m2() { // Dito
	// return null;
	// }

}
