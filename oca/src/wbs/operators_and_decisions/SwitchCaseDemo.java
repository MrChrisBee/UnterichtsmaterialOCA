package wbs.operators_and_decisions;

public class SwitchCaseDemo {

	// aufruf mit 2 Argumenten
	// java wbs.operators_and_dicisions.SwitchCaseDemo basis zahl

	// das 2. Aufrufargument wird in dem Stellenwertsystem angezeigt das dem 1.
	// Aufrufargument entspricht

	// bsp. wbs.operators_and_dicisions.SwitchCaseDemo 8 40 => 50
	// bsp. wbs.operators_and_dicisions.SwitchCaseDemo 2 10 => 1010

	// Achtung
	// Aufruf mit weniger als 2 oder mehr als 2 Argumenten ... (Fehlermeldung)
	// für basis lassen wir nur die folgenden werte zu: 2, 8, 10, 16 (ggf.
	// Fehlermeldung)
	// fehler beim parsen von basis oder zahl (ggf. Fehlermeldung)

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out
					.println("Bitte genau 2 Parameter (ganze Zahlen) übergeben!");

		} else {
			// hier gibt es exakt 2 Übergebene Argumente
			int basis = 0;
			int zahl = 0;
			try {

				basis = Integer.parseInt(args[0]);
				zahl = Integer.parseInt(args[1]);

				switch (basis) {
				case 2:
					System.out.println(zahl + " zur Basis " + basis + " ist "
							+ Integer.toBinaryString(zahl));
					break;
				case 8:
					System.out.println(zahl + " zur Basis " + basis + " ist "
							+ Integer.toOctalString(zahl));
					break;
				case 10:
					System.out.println(zahl + " zur Basis " + basis + " ist "
							+ zahl);
					break;
				case 16:
					System.out.println(zahl + " zur Basis " + basis + " ist "
							+ Integer.toHexString(zahl));
					break;
				default:
					System.out
							.println("Sie haben das falsche Zahlensystem angegeben. \n"
									+ "Nur 2,8,10 und 16 sind erlaubt.");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Die Parameter sind keine ganzen Zahlen");
			}

		}
	}

}
