package wbs.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListUndSet {

	public static void main(String[] args) {

		// erzeuge ein Objekt vom Typ List<String>
		List<String> myList = new ArrayList<>();

		// füge ein paar Elemente an die List an
		myList.add("Hallo");
		myList.add("Leute");
		myList.add("");
		myList.add("Jetzt");
		myList.add("geht");
		myList.add("es");
		myList.add("los");
		myList.add("!!!");
		System.out.println(myList.size());
		// eine schicke Ausgabe
		for (String myErge : myList) {
			System.out.print(myErge + " ");
		}
		System.out.println();
		System.out
				.println("*******************************************************************************************");
		/*
		 * ERKENTNISSE für LIST Die Reihenfolge ist bleibend es kann leere
		 * Einträge geben
		 */

		// erzeuge ein Objekt vom Typ Set<String>
		Set<String> mySet = new HashSet<>();
		// gebe ein paar Elemente in die Set
		mySet.add("Hallo");
		mySet.add("Leute");
		mySet.add("");
		mySet.add("Jetzt");
		mySet.add("geht");
		mySet.add("es");
		mySet.add("los");
		mySet.add("!!!");
		System.out.println(mySet.size());
		for (String myErge : mySet) {
			System.out.print(myErge + " ");
		}
	}

}
