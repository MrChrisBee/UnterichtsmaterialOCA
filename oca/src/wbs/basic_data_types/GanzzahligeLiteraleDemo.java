package wbs.basic_data_types;

public class GanzzahligeLiteraleDemo {

	public static void main(String[] args) {

		int n1 = 50; // dezimal
		int n2 = 0b0110010; // dual 1 2 4 8 16 32
		int n3 = 062; // oktal 1 8
		int n4 = 0x32; // hexadezimal 1 16

		/*
		 * wir initialisieren alle 4 Variablen mit der Zahl 50, wobei wir einen
		 * binären, einen oktalen, einen dezimalen und einen hexadezimalen
		 * Literal verwenden
		 */
		if (n1 == n4) {
			System.out.println("Die Werte sind gleich!!!");
		} else
			System.out.println("Passt nicht !!!");
		// int n5 = 12222222222; compiler Fehler wegen Überschreitung des
		// Wertebereichs für den Zieltyp int
		// long n5 = 12222222222; compiler Fehler wegen Überschreitung des
		// Wertebereichs des LiteralTypes
		long n5 = 12222222222L; // so klappt es ein LongLiteral kann diese Zahl
								// aufnehmen
		long n6 = 1222222222; // das klappt auch (die Zahl passt in einen
								// Literal für int) und int geht ohne Verluste
								// in long
		
		System.out.println(n3 + " "  + n5 + " " + n6);
		System.out.println(n4 + " " + n2);
	}

}
