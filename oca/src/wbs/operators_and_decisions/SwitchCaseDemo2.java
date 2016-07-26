package wbs.operators_and_decisions;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		// wir geben alle Argumente des Aufrufes aus (alle von Args)
		// und zwar ab dem 2. Argument
		// dabei soll gelten:
		// ist das 1. Argument toUpper
		// wir geben alles in Großbuchstaben aus
		// ist das 1. Argument toLower
		// wir geben alles in Kleinbuchstaben aus
		// ist das 1. Argument asItIs
		// wir geben alles in Unverändert aus

		// Fehlermeldungen, falls keine Argumente oder falls das erste Argument
		// ungültig ist

		if (args.length == 0) {
			System.out.println("Keine Argumente übergeben!");
		} else
			switch (args[0].toUpperCase()) {
			case "TOUPPER":
				for (int n = 1; n < args.length; n++) {
					System.out.print(args[n].toUpperCase() + " ");
				}
				break;
			case "TOLOWER":
				for (int n = 1; n < args.length; n++) {
					System.out.print(args[n].toLowerCase() + " ");
				}
				break;
			case "ASITIS":
				for (int n = 1; n < args.length; n++) {
					System.out.print(args[n].toString() + " ");
				}
				break;
			default:
				System.out
						.println("So geht das aber nicht:\n"
								+ "Entweder toUpper, toLower oder asItIs und nicht irgendeinen Mist eingeben!");
			}
	}

}
