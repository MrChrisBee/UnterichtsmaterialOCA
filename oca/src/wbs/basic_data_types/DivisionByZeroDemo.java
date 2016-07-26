package wbs.basic_data_types;

public class DivisionByZeroDemo {

	public static void main(String[] args) {

		/*
		 * Wir testen die Behauptung das eine Division durch 0 bei ganzzahligen
		 * Datentypen eine Exception liefert, bei gleitpunkten aber nicht
		 */

		double y;
		try {
			y = 7.0d / 0;			// obwohl hier eine Division durch 0 Stattfindet wird
			System.out.println(y);	// keine Exception ausgelöst sondern die Konstante PositivInfinity ausgegeben
			System.out.println(Double.isInfinite(y));
		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println("Mich wirst Du nicht sehen, ok vielleicht im SourceCode, aber Real neeeeeee!");
		}

		

		try {
			double x = 7 / 0; 		// hier passiert was erwartet wird >--> exception
			System.out.println(x);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
