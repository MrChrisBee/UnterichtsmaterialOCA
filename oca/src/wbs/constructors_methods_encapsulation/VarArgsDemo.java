package wbs.constructors_methods_encapsulation;

/*
 * wir schreiben die methode diffMinMax(). sie wird mit mindestens einem int- wert
 * als argument aufgerufen und liefert die differenz zwischen dem groessten wert
 * und dem kleinsten wert.
 * 
 * bsp.: diffMinMax(1,6,3,77,2,100,54) => 99
 */

/*
 * wir schreiben die methode concat(). sie wird mit beliebig vielen Strings, StringBuffern
 * oder StringBuildern als argument aufgerufen, und liefert einen String, der
 * aus dem aneinanderhängen aller übergebenen argumente besteht
 * 
 * bsp.: concat("lalla", new StringBuffer("blabla"), new StringBuilder("gaga"))
 * => lallablablagaga
 */

/*
 * wir schreiben die methode isGewinn(). sie wird mit beliebig vielen, aber mindestens
 * einem int als argument aufgerufen, und liefert true oder false, je nachdem, ob es sich
 * um zahlen handelt, die in einem nimspiel einer gewinnstellung entsprechen oder nicht
 * (für den spieler, der am zug ist)
 * 
 * die methode wirft eine IllegalArgumentException, wenn die argumente nicht korrekt sind
 * (werte < 1 sind nicht erlaubt)
 * 
 * bsp:
 * isGewinn(1, 2, 3) => false
 * isGewinn(134, 107, 550, 380, 12) => true
 */

public class VarArgsDemo {

	public static int diffMinMax(int zahl, int... zahlen) {
		int min = zahl;
		int max = zahl;
		for (int n : zahlen) {
			if (n < min) {
				min = n;
			} else if (n > max) {
				max = n;
			}
		}
		return max - min;
	}

	public static String concat(CharSequence... css) {
		StringBuilder sb = new StringBuilder();
		for (CharSequence cs : css) {
			sb.append(cs);
		}
		return sb.toString();
	}

	public static boolean isGewinn(int zahl, int... zahlen)
			throws IllegalArgumentException {
		if (zahl < 1) {
			throw new IllegalArgumentException("illegal argument...");
		}
		int bitMuster = zahl;
		for (int n : zahlen) {
			if (n < 1) {
				throw new IllegalArgumentException("illegal argument...");
			}
			bitMuster ^= n;
		}
		return bitMuster != 0;
	}

	public static int anzahlGewinnZuege(int zahl, int... zahlen) {
		if (zahl < 1) {
			throw new IllegalArgumentException("illegal argument...");
		}
		int bitMuster = zahl;
		int anzahlGewinnzuege = 0;
		for (int n : zahlen) {
			if (n < 1) {
				throw new IllegalArgumentException("illegal argument...");
			}
			bitMuster ^= n;
		}
		int highestOneBit = Integer.highestOneBit(bitMuster);
		anzahlGewinnzuege += ((zahl & highestOneBit) != 0 ? 1 : 0);
		for (int z : zahlen) {
			if ((z & highestOneBit) != 0) {
				anzahlGewinnzuege++;
			}
		}
		return anzahlGewinnzuege;
	}

	public static void main(String[] args) {
		System.out.println(diffMinMax(1, 6, 3, 77, 2, 100, 54));
		System.out.println(concat("lalla", new StringBuffer("blabla"),
				new StringBuilder("gaga")));
		int[] reihen1 = { 2, 3 };
		int[] reihen2 = { 9, 10, 11, 12 };
		System.out.println(isGewinn(1, reihen1) + " -> "
				+ anzahlGewinnZuege(1, reihen1));
		System.out.println(isGewinn(1, reihen2) + " -> "
				+ anzahlGewinnZuege(8, reihen2));

	}
}
