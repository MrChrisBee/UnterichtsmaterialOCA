// die nachstehende Klasse gehört zum Package wbs.intro
// der source-code muss in einem Verzeichnis namens wbs.intro leigen
// source-file: SimpleDemo.java
// class-file: SimpleDemo.class
// die package-deklaration muss (falls vorhanden) am anfang stehen
// konvention: in package-bezeichnern keine grossbuchstaben

package wbs.intro;

// es folgt die definition der klasse SimpleDemo 
// häufig entspricht eine Sourcedatei der definition einer klasse
// konvention: bezeichner von klassen beginnen mit einem großbuchstaben 
// die klasse ist public und damit von überall ansprechbar 

public class SimpleDemo {
	
	// die klasse definiert eine einzige methode (main)
	// konvention: die bezeichner einer methode beginnen mit einem kleinbuchstaben
	// die ausführung eines java programms beginnt mit einer main() - methode
	// die sichtbarkeit der methode ist public (überall aufrufbar)
	// die methode ist static (also ohne objektbezug aufrufbar) 
	// die methode lierfert ihrem aufrufer keinen Wert 
	// die methode hat einen parameter vom typ array von String namens args
	// String ist eine Klasse aus dem package java.lang
	public static void main(String[] args) {
		
		// System ist eine Klasse aus dem package java.lang
		// out ist ein statisches Feld der Klasse system vom typ PrintStream aus dem package java.io 
		// println() ist eine methode der klasse PrintStream
		// die methode println() wird mit einem string als argument aufgerufen
		System.out.println("Dank utf-8 klappt das auch mit den Umlauten öüäßß!!!");
	
	}

}
