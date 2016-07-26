package wbs.intro;

/* 
 * Unterscheide:
 * 
 * -Objekt
 * -Variable
 * -Referenz
 */



public class SimpleGCDemo {

	public static void main(String[] args) {
	Adresse a1 = new Adresse("Paul", "strasse", 12345, "Zuhause");
	Adresse a2 = new Adresse("Susanne", "strasse", 12345, "FernDerHeimat");
	// Auf beide Objekte gibt es eine Zugriffsmöglichkeit
	System.out.println(a1);
	System.out.println(a2);
	a1 = a2;
	// auf das ursprünglich von a1 referenzierte Objekt kann nicht mehr zugegriffen werden
	// es ist ein Kandidat für den Garbage Collector
	System.out.println(a1);
	System.out.println(a2);
	
	System.gc();
	}

}
