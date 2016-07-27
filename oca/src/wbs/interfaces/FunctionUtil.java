package wbs.interfaces;

public class FunctionUtil {
	/*
	 * Wenn eine Klasse nur Statische Funktionen und statische Felder hat mach
	 * es keinen Sinn Instanzen der Klasse zu erzeugen
	 */
 
	/*
	 * in welchem klaren Sinn kann man sagen das die Methode Fläche unter Graph
	 * mit Objekten zusammenarbeitet, von deren klasse diese Methode nichts
	 * weiss
	 * 
	 * die Methode flaecheUnterGraph() kennt den referenz-typ von function, aber nicht den
	 * object-type.  Der Compiler wird garantieren, dass beim Aufruf der Methode ein Objekt 
	 * übergeben wird, dessen reference-type IFunction ist. Damit hat die Methode
	 * flaecheUnterGraph()  die Garantie, das sie die Methode f() von function aufrufen kann,
	 * wie auch immer sie implementiert ist.
	 *
	 * 
	 * warum ist das sehr wichtig und nützlich?
	 * 
	 * Entwickler 1 erstellt die Klasse FunctionUtil und das Interface IFunction
	 * beides packt er in eine Bibliothek (jar-file), diese stellt er anderen
	 * Entwicklern zur Verfügung 
	 * 
	 * Entwickler 2 (oder die Anderen) binden diese Bibliothek in den sogenannten Classpath
	 * ihres Projektes ein und können dann beliebige eigene Klassen erstellen. Wenn diese 
	 * Klassen das Interface IFunction implementieren, dann kann die Methode flaecheUnterGraph
	 * mit ihnen zusammenarbeiten. 
	 */
	private FunctionUtil() {
	}

	public static double flaecheUnterGraph(IFunction function, double from,
			double to, double interval) {
		double flaeche = 0.0;
		for (double x = from + interval / 2.0; x < to; x += interval) {
			flaeche += (interval * function.f(x));
		}
		return flaeche;
	}
}