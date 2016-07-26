package wbs.exceptions;

public class ParseDigitsDemo {
	/*
	 * Wir schreiben die Methode parseDigits().
	 * Sie wandelt einen String in einen Int um.
	 * Der String muss folgenden Aufbau haben:
	 * 
	 * one_zero_one_one  --> 1011
	 * 
	 * four-four-one-zero --> 4410
	 * 
	 * im Falle eines Fehlers wirf eine IllegalArgumentException
	 * 
	 * Deklaration, Test, Hauptlogik, Implementierung
	 * 
	 */

	public static void main(String[] args) {
		String[] zahlenInTextform = { "null", "neun", "one_zero_one_one", "one_one_one", "four_four_one_zero",
				"six_five_nine_tree_", "einz_einz_null2" };
		try {
			for (String zIT : zahlenInTextform) {
				System.out.println(parseDigits(zIT));
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static int parseDigits(String zahlAlsText) throws IllegalArgumentException {
		String unsereZahl = "";
		String[] zahlenListe = null;
		zahlAlsText = zahlAlsText.toLowerCase();

		// teile den String in die einzelnen Teile String.split
		try {
			zahlenListe = zahlAlsText.split("_");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (String tempZahl : zahlenListe) {
			// @formatter:off
			switch (tempZahl) {
			case "one":		case "eins":	unsereZahl += "1";	break;
			case "two":		case "zwei":	unsereZahl += "2";	break;
			case "three":	case "drei":	unsereZahl += "3";	break;
			case "four":	case "vier":	unsereZahl += "4";	break;
			case "five":	case "fünf":	unsereZahl += "5";	break;
			case "six":		case "sechs":	unsereZahl += "6";	break;
			case "seven":	case "sieben":	unsereZahl += "7";	break;
			case "eight":	case "acht":	unsereZahl += "8";	break;
			case "nine":	case "neun":	unsereZahl += "9";	break;
			case "zero":	case "null":	unsereZahl += "0";	break;
				default:
					throw new IllegalArgumentException("Ungültige Ziffer!");
			}
			// @formatter:on
		}
		return Integer.parseInt(unsereZahl);
	}
}
