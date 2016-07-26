package wbs.intro;

public class Adresse {
	// definiere die Felder (Objektvariablen)
	private String name;
	private String ort;
	// int ist ein primitiver Datentyp, keine Klasse
	private int plz;
	private String strasse;
	
	// statische Felder (Klassenvariablen)
	// initialisierung ist Optional wird in diesem Fall automatisch mit 0 vorbelegt
	private static int counter = 0;

	
	// konstruktor
	// konstruktoren deklarieren keinen returntyp und sind oft aber nicht immer public
	// für jeden Paramerter muss der Typ und der Bezeichner angegeben werden 
	// String name und co sind die Parameter des Konstruktors (in dem Zusammenhang vlt. Signatur)
	public Adresse(String name, String strasse, int plz, String ort) {
		// this bezieht sich auf das aktuelle objekt und darf in statischen Methoden nicht verwendet werden
		// this.name ist das Feld des Objektes 
		// name (ohne this) kommt aus der Partameterliste des Konstruktors
		// name = name währe ein selbstbezug
		// bei namensgleichheit von feldern und Parameter 
		// haben 
		this.name = name;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
		// da counter ein statisches Feld der Klasse adresse ist geht auch der folgende aufruf
		// counter++ währe aber geläufiger und wird meistens eingesetzt
		// im editor werden statische Felder cursiv dargestellt
		Adresse.counter++;
	}
	
	// getter und setter-Methoden

	
	// this wird hier vorallem deshalb eingesetzt weil es eine namensgleichheit 
	// von Parametern und Feldern gibt,
	// man könnte  das umgehen indem man einen Parameternahmen ungleich
	// dem Feldnamen verwendet, dann währe eine zuweisung wie:
	// name = pName (pName name des Parameters)
	// richtig und gut
	// Sichtbarkeit Returntyp Methodenname 
	// es wird nichts als parameter übergeben
	public String getName() {
		// gibt den Wert des Feldes des aktuellen Objektes zurück 
		// der Typ ist wie oben angegeben String
		return name;
	}

	// Sichtbarkeit Returntyp Methodenname 
	// da es sich um einen sehr einfachen setter handelt
	// ist hier der Returntyp void
	public void setName(String name) {
		//setzte das feld name des aktuellen Objektes auf den Wert des Parameters name
		this.name = name;
	}

	public String getOrt() {
		return ort;
		// return this.ort ist auch möglich
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
		
	public static int getCounter() {
		return Adresse.counter;
		// man kann auch einfach return counter schreiben
		// this.counter erzeugt einen Compilerfehler
	}
	
	// würden wir eine Methode setCounter erstellen könnten wir nicht gewährleisten das 
	// die Anzahl der Objekte mit dem Wert von counter übereinstimmt
	// der Wert von counter wird vom Construktor gepflegt

	@Override
	public String toString() {
		return "Adresse [name=" + name + ", ort=" + ort + ", plz=" + plz
				+ ", strasse=" + strasse + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Das wars für diese Adresse!!!");
	}


}
