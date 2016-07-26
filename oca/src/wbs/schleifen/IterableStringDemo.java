package wbs.schleifen;

import java.util.Iterator;

public class IterableStringDemo {
	
	/*
	 * retroanalyse
	 * 
	 * was kann ich alles über die Klasse IterableString sagen?
	 * Sie Implementiert das Interface Iterable<Character>
	 * sie muss die Methode iterator() überschreiben und einen Iterator<Character> zurückgeben
	 * sie sollte nicht abstrakt sein da wir hier bereits mit Ihr arbeiten wollen ohne vorher einen Nachfahren zu erzeugen
	 * Sie muss einen Konstruktor mit einem Parametertyp der mit String kompatibel ist
	 * Sie muss ein Feld haben das eine Charsequenz halten kann
	 * wir brauchen eine Hilfsklasse, die das Interface Iterator<Character> implementiert  diese Hilfsklasse darf nicht 
	 * abstrakt sein muss also hasNext(), next() und remove() implementieren
	 */

	public static void main(String[] args) {
		IterableString s = new IterableString("leibelei");
		for(Character c: s) {
			System.out.println(c);
		}
		
		//so geht es auch das war vor foreach 
		System.out.println("**************************************");
		Iterator<Character> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	

	}

}
