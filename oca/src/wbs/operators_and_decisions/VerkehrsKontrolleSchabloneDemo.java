package wbs.operators_and_decisions;

import java.util.ArrayList;
import java.util.List;

enum Geschlecht {
	MAENNLICH, WEIBLICH;
}

enum Status {
	ENTZOGEN, ANZEIGEWEGENFOF, VERBLEIBT
}

interface FahrerCheck {
	public boolean hatGueltigeFahrerlaubnis();

	public double promilleWert();

	public void entzugFuehrerschein();
}

class Person {
	// TODO konstruktor vervollständigen, getter, setter, toString()
	private String name;
	private int geburtsJahr;
	private Geschlecht geschlecht;

	public Person(String name, int geburtsJahr, Geschlecht geschlecht) {
		this.name = name;
		this.geburtsJahr = geburtsJahr;
		this.geschlecht = geschlecht;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", geburtsJahr=" + geburtsJahr
				+ ", geschlecht=" + geschlecht + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGeburtsJahr() {
		return geburtsJahr;
	}

	public void setGeburtsJahr(int geburtsJahr) {
		this.geburtsJahr = geburtsJahr;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

}

class Autofahrer extends Person implements FahrerCheck {

	private boolean konnteFahrerlaubnisNachweisen;
	private double promille = 0.0;
	private Status statusFahrerlaubnis = Status.VERBLEIBT;

	
	public void setFuererschein(boolean hatFlaeppe) {
		this.konnteFahrerlaubnisNachweisen = hatFlaeppe;
	}

	public void setPromille(double promille) {
		this.promille = promille;
	}

	public Autofahrer(String name, int geburtsJahr, Geschlecht geschlecht) {
		super(name, geburtsJahr, geschlecht);
	}
	
	public Status getFuererscheinstatus() {
		return statusFahrerlaubnis;
	}

	@Override
	public boolean hatGueltigeFahrerlaubnis() {
		return konnteFahrerlaubnisNachweisen;
	}

	@Override
	public void entzugFuehrerschein() {
		if (konnteFahrerlaubnisNachweisen) 
			statusFahrerlaubnis = Status.ENTZOGEN; 
		else 
			statusFahrerlaubnis = Status.ANZEIGEWEGENFOF;
	}

	@Override
	public double promilleWert() {
		return promille;
	}

}

/*
 * einige frauen und männer werden bei einer verkehrskontrolle überprüft.
 * 
 * nach abschluss der kontrolle erfolgt die auswertung.
 * 
 * in der auswertung wird ausgegeben: wie viele personen insgesamt kontrolliert
 * wurden. wie viele männer kontrolliert wurden. wie viele frauen kontrolliert
 * wurden. wie vielen personen der führerschein wegen zu hoher alkoholwerte
 * abgenommen wurde. wie viele personen keine gültige fahrerlaubnis hatten. der
 * durchschnittliche promillewert.
 */

public class VerkehrsKontrolleSchabloneDemo {

	public static void main(String[] args) {

		List<Autofahrer> fahrers = new ArrayList<>();

		int anzahlFrauen = 0;
		int anzahlMaenner = 0;
		int anzahlFuehrerscheinAbgenommen = 0;
		int anzahlOhneFahrerlaubnis = 0;
		double promilleGesammt = 0;
		int anzahlPromillesuenderOhneFS = 0;
		// TODO
		// ggf weitere variablen definieren

		// TODO
		// einige autofahrer erzeugen und in der list fahrer ablegen
		Autofahrer a1 = new Autofahrer("Paulsen", 1970, Geschlecht.MAENNLICH);
		a1.setFuererschein(true);
		a1.setPromille(0.87);
		a1.entzugFuehrerschein();
		fahrers.add(a1);
		a1 = new Autofahrer("Werner", 1990, Geschlecht.MAENNLICH);
		a1.setFuererschein(true);
		a1.setPromille(1.8);
		a1.entzugFuehrerschein();
		fahrers.add(a1);
		a1 = new Autofahrer("Sorglos", 1969, Geschlecht.WEIBLICH);
		a1.setFuererschein(true);
		a1.setPromille(0.5);
		fahrers.add(a1);
		a1 = new Autofahrer("Bauer", 1960, Geschlecht.MAENNLICH);
		a1.setFuererschein(false);
		a1.entzugFuehrerschein();
		a1.setPromille(4.8);
		fahrers.add(a1);
		a1 = new Autofahrer("Werner", 1990, Geschlecht.MAENNLICH);
		a1.setFuererschein(true);
		a1.setPromille(1.8);
		a1.entzugFuehrerschein();
		fahrers.add(a1);

		for (Autofahrer fahrer : fahrers) {
			// TODO
			// werte ermitteln
			promilleGesammt = promilleGesammt + fahrer.promilleWert();
			if (fahrer.getGeschlecht() == Geschlecht.WEIBLICH) {
				anzahlFrauen++;
			} else
				anzahlMaenner++;
			if (!fahrer.hatGueltigeFahrerlaubnis()) {
				anzahlOhneFahrerlaubnis++;
			}
			if (fahrer.getFuererscheinstatus() == Status.ANZEIGEWEGENFOF) {
				anzahlPromillesuenderOhneFS++;
			}
			if (fahrer.getFuererscheinstatus() == Status.ENTZOGEN) {
				anzahlFuehrerscheinAbgenommen++;
			}
		}

		System.out.println("Anzahl kontollierter Personen: " + fahrers.size());
		System.out.println("Anzahl Frauen: " + anzahlFrauen);
		System.out.println("Anzahl Maenner: " + anzahlMaenner);
		System.out.println("Anzahl der abgenommenen Fuehrerscheine : "
				+ anzahlFuehrerscheinAbgenommen);
		System.out.println("Anzahl der Personen ohne Führerschein : " + anzahlOhneFahrerlaubnis);
		System.out.println("Anzahl der Anzeigen wegen betrunken Fahren ohne Führereschein : " + anzahlPromillesuenderOhneFS);
		// TODO promilledurchschnitt ausgeben
		System.out.println("Promilledurchschnitt : " + promilleGesammt / fahrers.size());

	} 

}
