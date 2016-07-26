package wbs.arrays_arraylist;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Random;

class BitCountComperator implements Comparator<Integer> {

	@Override
	public int compare(Integer erste, Integer zweite) {
		int result;
		result = Integer.bitCount(erste) - Integer.bitCount(zweite);
		if (result == 0) {
			result = erste - zweite;
		}
		return result;
	}
	
}
class ExoticStringComperator implements Comparator<String> {
	
	private BitSet myLeftBitSet = new BitSet(16);
	private BitSet myRightBitSet = new BitSet(16);

	@Override
	public int compare(String o1, String o2) {
		int result;
			result = o1.length() - o2.length();
			if (result == 0) {
				myLeftBitSet.clear();
				myRightBitSet.clear();
				for(int i=0; i< o1.length(); i++ ) {
					myLeftBitSet.set(o1.charAt(i)); 
				}
				for(int i=0; i< o2.length(); i++ ) {
					myRightBitSet.set(o2.charAt(i)); 
				}
				result = myLeftBitSet.cardinality() - myRightBitSet.cardinality();
			}
			if (result == 0) {
				result = o1.compareTo(o2);	
			}
		return result;
	}
}
	



public class SortArrayDemo {
	
/*
 * 1. Aufgabe: 
 * Wir bestücken ein Integer Array mit den Zahlen von 1 bis 100
 * dann sortieren wir das Array und geben es aus.
 * 	1. Sortierkriterium: die Anzahl der einserbits
 * 	2. Sortierkriterium: Natural Ordering
 * 
 * 2. Aufgabe:
 * Wir bestücken ein String Array mit 100 Strings
 * jeder String ist die Hexadezimale String Repräsentation 
 * einer Zufallszahl zwischen 1 und 100 
 * dann sortieren wir das array und geben es aus
 * 	1. Sortierkriterium: die Länge des Strings (aufsteigend)
 * 	2. Sortierkriterium: die Anzahl der verschiedenen Zeichen in einem String
 *  3. Sortierkriterium: das Natural Ordering von String 
 *  Tipp: die Klasse BitSet aus util könnte nützlich sein für das 2. Kriterium,
 *  insbesondere set() und cardinality()
 *  String.compare(a,b)
 *  wir nennen den Comperator ExoticStringComperator
 * 
 */
	
	public static void main(String[] args) {
		Integer [] ganzVieleInts  = new Integer [100];
		Random rnd = new Random();
		for(int i = 0; i < 100; i++) {
			ganzVieleInts[i] = i+1;
		}
		
		
		Arrays.sort(ganzVieleInts, new  BitCountComperator());
		int anzahlBits = 0;
		
		for(int einInt: ganzVieleInts) {
			if (Integer.bitCount(einInt) > anzahlBits) {
				System.out.println();
				System.out.println();
				System.out.println("Die folgenden Werte haben " + ++anzahlBits + " Bits die auf 1 gesetzt sind.");
			}
			System.out.print(einInt + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("************************ Der 2. Teil **************************************");
		System.out.println();
		System.out.println();
		
		
		String [] s1 = new String [100];
		
		for (int i = 0; i < 100; i++) {
			// erzeuge einen Zufallsstring als Hexrepräsentation einer Zufallszahl
			s1[i] = Integer.toHexString((rnd.nextInt(1000000) + 1));
		}
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1, new ExoticStringComperator());
		System.out.println(Arrays.toString(s1));
	}

}
