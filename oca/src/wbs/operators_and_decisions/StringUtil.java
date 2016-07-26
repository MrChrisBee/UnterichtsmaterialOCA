package wbs.operators_and_decisions;

public class StringUtil {
	/*
	 * wir schreiben eine Methode isPalindrom(String,boolen), mit der getestet werden kann, ob 
	 * ein Wort ein Palindrom ist oder nicht.
	 * über einen Schalter wird gesteuert ob der test caseSensitiv ist
	 * Otto ist je nach Schalter einmal true einmal false
	 */
	public static boolean isPalindrom(String testePalindrom, boolean ignoreCase) {
		if (ignoreCase) { // GROß klein Schreibung interessiert nicht
			testePalindrom = testePalindrom.toUpperCase();
			// String operation ist nicht so prickelnd aber für 1 mal vlt. ok
		}
		int laenge = testePalindrom.length();
		int positionMax = laenge / 2;
		for (int position = 1; position <= positionMax; position++) {
			if (testePalindrom.charAt(position - 1) != testePalindrom
					.charAt(laenge - position)) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Wir schreiben die Methode isSatzPalindrom
	 * Hinweis: die Klasse Character könnte hier interessant sein
	 */
	public static void isSatzPalindrom(String das) {
		StringBuffer sb = new StringBuffer();
		System.out.print(das + " ");

		for (int j = 0; j < das.length(); j++) {
			if (Character.isLetterOrDigit(das.charAt(j))) {
				sb.append(das.charAt(j));
			}
		}
		if (sb.length() == 0) {
			System.out.println(" ist kein Satzpalindrom");
		}
		if (isPalindrom(new String(sb), true)) {
			System.out.println(" ist ein Satzpalindrom");
		} else {
			System.out.println(" ist leider KEIN Satzpalindrom");
		}

	}
}
