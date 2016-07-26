package wbs.constructors_methods_encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Wir schreiben die Methode diffMinMax(). Sie wird mit mindestens einem Argument aufgerufen und
 * liefert die Differenz zwischen dem größtem und dem kleinsten Wert
 * bsp.: diffMinMax(1,6,8,10) => 9
 * 
 * Wir schreiben die Methode concat(). Sie kann mit beliebig vielen Strings, StringBuffern oder StringBuildern
 * als Argument aufgerufen werden, und liefert einen String, der aus dem Aneinanderhängen aller übergebenen 
 * Argumente besteht
 * 
 *  bsp.: concat("einz","zwei",new StringBuilder("drei"))
 *  
 *  Wir schreiben die Methode isGewinn(). Sie wird mit mindestens einem int als Argument aufgerufen und 
 *  liefer true oder false. Das Ergebnis ist abhängig von der Aussage zur Gewinnstellung im Nimspiel. 
 *  
 *   Die Methode wirft eine IllegalArgumentException wenn die Argumente nicht korrekt sind
 *   (Werte kleiner 1 sind nicht erlaubt)
 *
 */

public class VarArgsDemoCB {

	public static void main(String[] args) {
		System.out.println(diffMinMax(8, 1, 99));
		System.out.println(concat("einz","zwei",new StringBuilder("drei")));
		System.out.println(isGewinn(2,3,4,5));
	}

	private static boolean isGewinn(int erster, int... i) throws IllegalArgumentException {
		boolean result = false;
		boolean wirfExc = false;
		Integer zwischenwert = erster;
		if (erster < 1) wirfExc = true;
		for(int wert:i) {
			if(wert < 1) {
				wirfExc = true;
			}
			zwischenwert = zwischenwert ^ wert;
		}
		if (wirfExc) throw new IllegalArgumentException("Es dürfen nur Werte größer 0 geprüft werden");
		if (zwischenwert > 0) {
			result = true;
		} 
		
		return result;
	}

	private static StringBuilder concat(CharSequence... str) {
		StringBuilder sb =new StringBuilder();
		for(CharSequence cs:str) {
			sb.append(cs);
		}
		return sb;
	}

	private static int diffMinMax(int i, int... l) {
		int result = 0;
		List<Integer> myList = new ArrayList<>();
		myList.add(i);
		for (int val : l) {
			myList.add(val);
		}
		Collections.sort(myList);
		result = myList.get(myList.size() - 1) - myList.get(0);

		return result;
	}

}
