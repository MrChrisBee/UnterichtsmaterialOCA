package wbs.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Random;



	


public class RandomNumberHelperDemo {
	
	/*
	 *	wir schrieben ein Methode die einen Zufälligen int Wert liefert für eine 
	 *  vorgegebene Zahl von n Stellen. In der Zahl sollen ALLE ZIFFERN VERSCHIEDEN sein.
	 *  Die Methode wirft ggf. eine IllegalArgumentExc. 
	 */
	
	static Random rnd = new Random();
	static BitSet myBitSet = new BitSet(9);
	static List<Integer> quellList = new ArrayList<>();
	static int[] maxiWert = { 2, 1, 4, 7, 4, 8, 3, 6, 4, 7 };
	static Integer[] vorgaben = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	
	public static void main(String[] args) {
		int[] zahlenLängeArray = { 8, 3, 1, 10, 10 };
		try {
			for (int länge : zahlenLängeArray) {
				if (länge == 10) {
					zeigDieZahl(10, true);
				} else if (länge > 0 & länge < 10) {
					zeigDieZahl(länge, false);
				} else
					throw new IllegalArgumentException(
							"Falsche Parameter: Die Anzahl der zu Erzeugenden Ziffern muss im Bereich 1 .. 10 liegen!");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void zeigDieZahl(int anzahl, boolean kontrolleNotwendig) {
		int woBinIch = 0;
		myBitSet.clear();
		Integer[] myResult = new Integer[anzahl];
		if (kontrolleNotwendig) {
			quellList = erzeugeWerteArray(1, 2);      // nur 1,2
		} else {quellList = erzeugeWerteArray(0, 9);} // 0..9	
		do {
			// myBitSet & vorgaben immer zusammen behandeln (r&w) hier schreiben			
			myResult[woBinIch] = 
					quellList.get(rnd.nextInt(quellList.size()));
			myBitSet.set(myResult[woBinIch]);
			if (kontrolleNotwendig) { // spezialfall länge = 10 ? 
				if (myResult[woBinIch] < maxiWert[woBinIch]) {
					kontrolleNotwendig = false;
				}
			}
			woBinIch++;
			// erzeuge die quellList für den nächsten Durchlauf
			if (!kontrolleNotwendig) {
				// maximale Anzahl freier Werte zurückgeben
				quellList = erzeugeWerteArray(0, 9);
			} else {
				// hier nur bis zu maxiWert[woBinIch] erzeugen
				quellList = erzeugeWerteArray(0, maxiWert[woBinIch]);
			}
		} while (woBinIch < anzahl);
		System.out.println("Eine Zufallszahl mit " + anzahl + " Ziffern ist : " + Arrays.toString(myResult));
	}

	private static List<Integer> erzeugeWerteArray(int von, int maxWert) {
		/*
		 * liefere mir eine List mit allen Werten ab Position 
		 * der Wert darf maximal maxWert haben
		 */
		List<Integer> resultList = new ArrayList<>();
		int j = 0;
		for (int i = von; i < 10; i++) {
			// myBitSet & vorgaben immer zusammen behandeln (r&W) hier lesen
			if (!myBitSet.get(i)) {
				j = vorgaben[i];
				if (j > maxWert)
					break;
				resultList.add(j);
			}
		}
		return resultList;
	}
}
 