package wbs.arrays_arraylist;

import java.util.Comparator;
import java.util.List;

/*
 * Die Klasse erlaubt einen Vergleich zweier Objekte mit beliebig vielen Stufen
 * Sie kann damit z.B. Verwendung finden für mehrstufiges sortieren
 * Sie soll für beliebige Objekttypen einsetzbar sein
 */


/*
 * Mehrstufenkomperator IS A Comperator (Implements oder Extends)
 * Mehrstufenkomperator HAS A Comperator (hat ein Feld oder lokale Variable)
 * 
 * Aufgrund der Klassendeklaration von MehrStufenComperator mit <T extends Comparable<T>>
 * ist diese Aufgabe nicht richtig gelöst. Es heißt ja hier für beliebige Objekttypen
 * Unsere Klasse lässt sich nun nur noch für Objekte nutzen die ein natural Ordering hat
 * also z.B. kein StringBuffer, StringBuilder ... 
 * 
 */

class BitCountPurComperator implements Comparator<Integer> {

	@Override
	public int compare(Integer erste, Integer zweite) {
		return Integer.bitCount(erste) - Integer.bitCount(zweite);
	}

}


	
	
public class MehrStufenComperator<T extends Comparable<T>> implements Comparator<T> {
 
	private List<Comparator<T>> comperatorList; 
	
	public MehrStufenComperator (List<Comparator<T>> cList) {
		this.comperatorList = cList;
	}
	
	@Override
	public int compare(T t1, T t2) {
		int result = 0;
		for(Comparator<T> aktComp: comperatorList) {
			result = aktComp != null ? aktComp.compare(t1, t2) : t1.compareTo(t2);
			if (result != 0)
				break;
		}
		
		return result;
	}
	
	

}
