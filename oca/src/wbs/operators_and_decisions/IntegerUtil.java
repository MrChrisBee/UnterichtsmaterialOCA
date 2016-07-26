package wbs.operators_and_decisions;

import java.util.ArrayList;
import java.util.List;

public class IntegerUtil {

	public static int countBits(int n) {
		/**
		 * gibt die Anzahl der Einserbits von n zurück
		 */

		int anzahlDerEinsen = 0;
		int aktWert = 1;
		while (n != 0) {
			if ((n & aktWert) != 0) { // Achtung Falle!! nicht auf 1 prüfen
										// funzt nur für aktWert = 1
				n = n - aktWert;
				anzahlDerEinsen++;
			}
			aktWert = aktWert << 1;
		}
		return anzahlDerEinsen;
	}

	// wir schreiben die Methode highestOneBit(). Sie liefert eine Zahl, in der
	// genau ein Bit (das mit dem höchsten wert)gesetzt ist

	public static int highestOneBit(int n) {
		/**
		 * gibt den Wert des höchst wertigsten Bits der übergebenen Zahl aus
		 */
		// erzeuge den größten möglichen Vergleichswert
		int maxOneBit = (1 << 31); // richtig?? 30 oder 31 ?
									// der Vergleich mit der
									// Integer-Methode highestOneBit stimmt
									// zumindest in meinen getesteten Fällen
									// bei negativen Werten kommt nicht das
									// richtige ergebnis
		System.out
				.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out
				.println("maxOneBit in dezimaler Schreibweise : " + maxOneBit);
		System.out.println("maxOneBit in dualer Schreibweise : "
				+ Integer.toBinaryString(maxOneBit));

		while (maxOneBit > 0) {
			if ((maxOneBit & n) != 0) {
				return maxOneBit;
			}
			maxOneBit = maxOneBit >>> 1;
		}
		return maxOneBit;
	}

	// wir schreiben die Methode lowestOneBit(). Sie liefert eine Zahl, in der
	// genau ein Bit (das mit dem niedrigsten Wert) gesetzt ist

	public static int lowestOneBit(int n) {
		int minOneBit = 1;
		while (minOneBit > 0) {
			if ((minOneBit & n) != 0) {
				return minOneBit;
			}
			minOneBit = minOneBit << 1;
			// schieb das Bit eins weiter
		}
		return minOneBit;
	}

	/*
	 * wir schreiben zwei methoden 
	 * indexOfHighestOneBit()
	 * => liefert die Position des höchsten Einserbits
	 * => die Zählung beginnt bei 0
	 * => für die Zahl 0 liefern wir -1
	 * => indexOfHighestOneBit(100) => 6
	 * => indexOfHighestOneBit(0) => -1
	 * => indexOfLowestOneBit()
	 * => analog zu indexOfHighestOneBit()
	 */
	public static int indexOfHighestOneBit(int n) {
		/**
		 * gibt den Index des höchst wertigsten Bits der übergebenen Zahl aus
		 */
		// erzeuge den größten möglichen Vergleichswert
		int maxOneBit = (1 << 31);
		int index = 31;
		while (maxOneBit != 0) {
			if ((maxOneBit & n) != 0) {
				return index;
			}
			maxOneBit = maxOneBit >>> 1;
			index--;
		}
		return -1;
	}

	public static int indexOfLowestOneBit(int n) {
		/**
		 * gibt den Index des niederichst wertigsten Bits der übergebenen Zahl
		 * aus
		 */
		// erzeuge den kleinsten möglichen Vergleichswert
		int minOneBit = 1;
		int index = 0;
		while (minOneBit != 0) {
			if ((minOneBit & n) != 0) {
				return index;
			}
			minOneBit = minOneBit << 1;
			index++;
		}
		return -1;
	}

	/*
	 * Wir schreiben eine Methode die die Quersumme eines int Berechnet
	 * die Quersumme ist dabei die Summe der Ziffernwerte
	 * z.B. 12345 => 15
	 * z.B. 981 => 18
	 * 
	 */
	public static int querSumme(int zahl) {
		int wert = 0;
		int ziffer = 0;
		do {
			ziffer = (zahl % 10);
			zahl = zahl / 10;
			wert = wert + ziffer;
		} while (zahl != 0);

		return wert;
	}

	public static int querSummeGZ(int zahl) {
		int q = 0;
		for (; zahl != 0; zahl /= 10) {
			q += zahl % 10;
		}
		return q;
	}

	/*
	 *  nimm eine Zahl
	 *  wenn die Zahl ungerade ist multipliziere mit 3 und addiere 1
	 *  wenn die Zahl gerade ist dann dividiere durch 2
	 *  mach das solange bis du bei 1 angekommen ist
	 *  wir schreiben eine Methode die ermittelt nach wievielen Schriiten für eine 
	 *  gegebene Zahl der Endwert 1 erreicht wird
	 */

	public static int colatzZahl(int zahl) {
		int ergebnis = 0;
		if (zahl < 1) {
			throw new IllegalArgumentException(
					"Nur positive ganzzahlige Werte erlaubt!");
		}
		do {
			if ((zahl % 2) > 0) {
				// ungerade Zahl
				zahl = zahl * 3;
				zahl++;
			} else
			// gerade
			{
				zahl /= 2;
			}
			ergebnis++;
		} while (zahl != 1);
		return ergebnis;
	}

	/*
	 * Wir schreiben eine Methode collatzZahl2(). Sie liefert für eine gegebene Zahl die
	 * Folge aller Zahlen, die durchlaufen werden, bis der Endwert erreicht ist.
	 */

	public static List<Integer> collatzZahl2(int zahl) {
		if (zahl < 1) {
			throw new IllegalArgumentException(
					"Nur positive ganzzahlige Werte erlaubt!");
		}
		List<Integer> returnList = new ArrayList<>();
		do {
			if ((zahl % 2) > 0) {
				// ungerade Zahl
				zahl = zahl * 3;
				zahl++;
			} else
			// gerade
			{
				zahl /= 2;
			}
			returnList.add(zahl);
		} while (zahl != 1);

		return returnList;
	}

	/*
	 * Wir schreiben eine Methode reverse(int). Sie liefert zu einem int einen Int in dem die Reihenfolge der Ziffern umgedreht ist 
	 * Wenn wir also 12345 herein geben soll 54321 heraus kommen
	 */

	public static int reverse(int zahl) {

		if (zahl < 10)
			return zahl;
		int reverseZahl = 0;

		while (zahl != 0) {
			reverseZahl *= 10;
			reverseZahl += zahl % 10;
			zahl /= 10;
		}

		return reverseZahl;
	}

	public static int reverse2(int i) {
		// wenn es denn unbedingt ein Einzeiler sein soll
		return Integer.parseInt(new StringBuffer(Integer.toString(i)).reverse()
				.toString());
	}

	/*
	 * 3. Variante: wir bauen den Hilfsstring Zeichenweise auf
	 * 
	 */
	public static int reverse3(int i) {
		StringBuffer hilfsBuffer = new StringBuffer();
		String zahlString = Integer.toString(i);
		for (int n = zahlString.length() - 1; n >= 0; n--)
			hilfsBuffer.append(zahlString.charAt(n));

		return Integer.parseInt(hilfsBuffer.toString());
	}

	/*
	 * Wir schreiben die Methode countDifferentDigits(int),
	 * sie zählt die Anzahl der verschiedenen Ziffern in einem int
	 * 
	 * bsp. 12345 => 5
	 * 
	 * mögliche Lösungswege	 
	 * erzeuge einen Array mit 10 Elementen
	 * int[] controllArray = {0,1,2,3,4,5,6,7,8,9};
	 */
	public static int countDifferentDigits(int i) {
		i = Math.abs(i);

		int[] controllArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		do {
			controllArray[i % 10] = 1;
			i /= 10;
		} while (i != 0);
		int counter = 0;
		for (int wert : controllArray) {
			counter += wert;
		}
		return counter;
	}

	public static int countDifferentDigitsGZ(int zahl) {
		int result = 0;
		if (zahl == 0)
			return 1;
		for (; zahl != 0; zahl /= 10) {
			result |= (1 << (zahl % 10));
		}
		return Integer.bitCount(result);
	}

	/*
	 * Wir schreiben eine Methode echteTeiler(int)
	 * die zu einer gegebenen Zahl alle echten Teiler ausgibt
	 * 
	 * bsp.: 6 => 1,2,3
	 * bsp.: 28 => 1,2,4,7,14
	 * bsp.: 24 => 1,2,3,6,8,12
	 * 
	 * ich muss nur bis zur Hälfte der Zahl nach Teilern suchen
	 * ich finde einen Teiler indem ich der reihe nach prüfe ob die Zahl 
	 * geteilt durch den Prüfling einen rest hat. Hat diese Prüfung ergeben 
	 * das es keinen rest gibt wird der Wert zu einer ArrayList hinzu gefügt 
	 * die auch meinen Rückgabewert darstellt 
	 * 
	 * 
	 * 
	 */
	public static List<Integer> echteTeiler(final int pruefling) {
		final List<Integer> teilerMenge = new ArrayList<>();
		for (int teiler = 1; teiler <= pruefling / 2; teiler++) {
			if ((pruefling % teiler) == 0) {
				// Teilung ohne rest möglich => echter teiler
				teilerMenge.add(teiler);
			}
		}
		return teilerMenge;
	}

	/*
	 * Wir schreiben die Methode istVollkommen(). Sie ermittelt ob eine Zahl gleich der Summe 
	 * ihrer echten Teiler ist. Dann nennt man Sie vollkommen.
	 * 
	 *     z.B. 6 => 1,2,3        6 = 1+2+3  			6 ist eine vollkomene Zahl
	 *     z.B. 28 => 1,2,4,7,14  28 = 1+2+4+7+14  		28 ist auch eine vollkommene Zahl
	 *     
	 *      in der Demo-Klasse  geben wir alle vollkomenen Zahlen zwischen 1 und 10000 aus
	 */

	public static boolean istVollkommen(final int pruefling) {
		int vergleichsWert = 0;
		for (int teiler : echteTeiler(pruefling)) {
			vergleichsWert += teiler;
		}
		if (pruefling == vergleichsWert)
			return true;
		else
			return false;
	}

	/*
	 * wir schreiben eine Methode, die zu einer gegebenen Zahl alle Primfaktoren
	 * dieser Zahl liefert. Primfaktoren sind Teiler, die selbst keine Teiler haben.
	 * 
	 * bsp.: 10 => 2,5
	 * bsp.: 100 => 2,2,5,5
	 * bsp.: 49 => 7,7
	 * bsp.: 31 => 31
	 * 
	 * 
	 * Grundidee:
	 * teile durch 2 solange es ohne rest geht
	 * teile durch 3 solange ohne rest geht
	 * ...
	 * wir sind fertig wenn der Endwert 1 erreicht ist 
	 * Methodenname primFaktoren(int)
	 * 
	 */
	public static List<Integer> primFaktoren(int zahl) {
		List<Integer> primFaktoren = new ArrayList<>();
		for (int teiler = 2; zahl != 1; teiler++) {
			while ((zahl % teiler) == 0) {
				zahl = zahl / teiler;
				primFaktoren.add(teiler);
			} 
		}  
		return primFaktoren;
	} 

	public static List<Integer> primFaktoren2(int zahl) {
		List<Integer> primFaktoren = new ArrayList<>();
		if (zahl < 2 ) 
			throw new IllegalArgumentException("Also 'ne 2 sollte es wenigstens sein!");
		for (int teiler : echteTeiler(zahl)) {
			if (teiler != 1) {
				while ((zahl % teiler) == 0) {
					zahl = zahl / teiler;
					primFaktoren.add(teiler);
				}
			}
		}
		return primFaktoren;
	}

}
