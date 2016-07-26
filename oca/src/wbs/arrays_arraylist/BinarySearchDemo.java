package wbs.arrays_arraylist;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchDemo {

	public static void main(String[] args) {
		/*
		 * wir bestücken ein 20-Elementiges Integer Array mit Zufallszahlen zwischen 1 und 50
		 * Wir sortieren dieses Array aufsteigend gemäss natural Ordering unter Verwendung einer 
		 * passenden Methode von Arrays
		 * 
		 */
		Integer michGibtEs;
		Integer michGibtEsNicht = 0;
		Integer[] myIntegerArray = new Integer[20];
		Random rnd = new Random();

		for (int i = 0; i < myIntegerArray.length; i++) {
			myIntegerArray[i] = rnd.nextInt(50) + 1;
		}
		
		michGibtEs = myIntegerArray[15];

		Arrays.sort(myIntegerArray);

		for (int i = 0; i < myIntegerArray.length; i++) {
			System.out.print(myIntegerArray[i] + " ");
		}
		System.out.println();
		

		for (int i = 1; i <= 50; i++) {
			if (Arrays.binarySearch(myIntegerArray, i) < 0) {
				michGibtEsNicht = i;
				break;
			}
		}

		/*
		 * Wir suchen dann ein Element das garantiert Enthalten ist, und ein Element das 
		 * garantiert nicht enthalten ist und geben jeweils den Index aus
		 */
		System.out.println("Garantiert enthalten ist: " + michGibtEs);
		System.out.println("Ergebnis der Suche nach "+ michGibtEs +": " + Arrays.binarySearch(myIntegerArray, michGibtEs));
		System.out.println("Garantiert NICHT enthalten ist: " + michGibtEsNicht);
		System.out.println("Ergebnis der Suche nach "+ michGibtEs +": " + Arrays.binarySearch(myIntegerArray, michGibtEsNicht));
		
		/*
		 * Wir provozieren mit binarySearch eine ClassCastException und fangen sie ab
		 */
		try {
			System.out.println(Arrays.binarySearch(myIntegerArray, "F"));
		} catch (ClassCastException e) {
			System.err.println("Es wurde eine Ausnahme beim Suchen ausgelöst!");
		}
		
	}
}
