package wbs.intro;

public class AdressDemo {

	public static void main(String[] args) {
		// Wir erzeugen 2 Adressen 
		Adresse ersteAddresse = new Adresse("Kinski", "Am Eck 15" , 12345, "NoPlanTown");
		Adresse zweiteAddresse = new Adresse("Suaheli", "Am Rund 16" , 12345, "NoPlanTown");
		// erste- und zweiteAdresse sind lokale Variablen der Methode Main
		// in ihnen liegen referenzen auf Adresse-Objekte die mit dem Konstruktor aufruf erzeugt wurden
		// lokale Variablen sind immer Innerhalb eines Blockes in einer Methode oder einem Konstruktor definiert
		// sie sind k e i n e Felder der Klasse AdresseDemo

		// Wir geben für jede Adresse den Namen un die Stadt aus
		System.out.println(ersteAddresse.getName()+" : "+ersteAddresse.getOrt());
		System.out.println(zweiteAddresse.getName()+" : "+zweiteAddresse.getOrt());
		// mit dem Operator + kann man in Java Strings aneinender hängen
		// getName() und getOrt() sind nicht statisch und müssen über eine Objektreferenz aufgerufen werden
		
		// Wir geben die Anzahl der erzeugten Adressen aus
		System.out.println(Adresse.getCounter());
		// getCounter() ist eine Statische Methode 
		// sie sollte also über den Klassennamen aufgerufen werden
		
		// Wir geben eine Adresse als ganzes aus
		System.out.println(ersteAddresse);
		System.out.println(zweiteAddresse);
		// ohne überschreibung wird die toString() methode von Objekt genutzt
		
		//adresse ist subklasse von Objekt 
	}

}
