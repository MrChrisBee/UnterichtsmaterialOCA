package wbs.interfaces;

import java.util.List;
import java.util.ArrayList;

public class FunctionUtilDemo {

	public static void main(String[] args) {
		// wir deklarieren eine Variable vom Typ des Interfaces IFunction
		IFunction function;

		/*
		 * Wir berechnen zwischen 0 und 1 den Flächeninhalt unter gem Graphen
		 * der folgenden Funktionen:
		 * 
		 * y=x y=x² y=2x²+3x+2 y=x³
		 * 
		 * die Intervallbreite soll 0.001 betragen
		 */

		/*
		 * Ich Teste die Funktion flaecheUnterGraph zum einfachen nachrechnen
		 * mit der Funktion y = x bei einem Bereich von 0 bis 1 sollte das
		 * Ergebnis sich mit feiner werdenden Intervall an 0,5 annähern
		 */
		System.out
				.println("--------------------------- y=x ---------------------------------");

		function = new LineareFunktion(1, 0);
		System.out.println(FunctionUtil.flaecheUnterGraph(function, 0.0, 1.0,
				0.001));
		System.out
				.println("--------------------------- y=x² ---------------------------------");

		/*
		 * etwas weniger gut nachprüfbar nutze ich die gleiche Methode mit einer
		 * anderen Instanz von function nach der Vorgabe y=x²
		 */
		function = new Quadrat();
		System.out.println(FunctionUtil.flaecheUnterGraph(function, 0.0, 1.0,
				0.000001));
		System.out
		.println("--------------------------- y=2x²+3x+2 ---------------------------------");
		
		function = new Parabel(2, 3, 2);
		System.out.println(FunctionUtil.flaecheUnterGraph(function, 0.0, 1.0,
				0.000001));
		System.out
		.println("--------------------------- y=x³ ---------------------------------");
		function = new Hoch3();
		System.out.println(FunctionUtil.flaecheUnterGraph(function, 0.0, 1.0,
				0.000001));
		
		System.out
		.println("--------------------------- Das Ganze Kompakter ---------------------------------");
		
		List<IFunction> functions = new ArrayList<>(); 
		functions.add(new LineareFunktion(1, 0));
		functions.add(new Quadrat());
		functions.add(new Parabel(2, 3, 2));
		functions.add(new Hoch3());
		functions.add(new HochN(4));
		functions.add(new HochN(5));

		for(IFunction myFunction : functions) {
			System.out.println(FunctionUtil.flaecheUnterGraph(myFunction, 0.0, 1.0,
					0.000001));
			
		}
		
	}

}
