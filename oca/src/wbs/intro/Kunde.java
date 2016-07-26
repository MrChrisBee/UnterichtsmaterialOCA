package wbs.intro;

import java.util.ArrayList;
import java.util.List;

public class Kunde {

	private double genrab_1;
	private double genrab_2;
	private Adresse rechnungsadresse;
	private List<Ansprechpartner> ansprechpartners = new ArrayList<>();
	private List<Adresse> lieferadressen = new ArrayList<>();

	public Kunde(double genrab_1, double genrab_2, Adresse rechnungsadresse) {
		this.genrab_1 = genrab_1;
		this.genrab_2 = genrab_2;
		this.rechnungsadresse = rechnungsadresse;
	}

	public double getGenrab_1() {
		return this.genrab_1;
	}

	public double getGenrab_2() {
		return this.genrab_2;
	}

	public Adresse getRechnungsAdresse() {
		return this.rechnungsadresse;
	}

	public void setGenrab_1(double genrab) {
		this.genrab_1 = genrab;
	}

	public void setGenrab_2(double genrab) {
		this.genrab_2 = genrab;
	}

	public void setRechnungsadresse(Adresse rechnungsAdresse) {
		this.rechnungsadresse = rechnungsAdresse;
	}

	public void addLieferAdresse(Adresse LieferAdresse) {
		this.lieferadressen.add(LieferAdresse);
	}

	public void removeLeiferAdresse(Adresse LieferAdresse) {
		this.lieferadressen.remove(LieferAdresse);
	}

	public void addAnsprechpartner(Ansprechpartner ansprech) {
		this.ansprechpartners.add(ansprech);
	}

	public void removeAnsprechpartner(Ansprechpartner ansprech) {
		this.ansprechpartners.remove(ansprech);
	}

	public List<Ansprechpartner> getAnsprechpartner() {
		return this.ansprechpartners;
	}

	public List<Adresse> getLiferadresse() {
		return this.lieferadressen;
	}
 
	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Für die Rechnungsadresse \n" + rechnungsadresse + "\ngibt es\n"
				+ ansprechpartners.size() + " Ansprechpartner\n und \n"
				+ lieferadressen.size() + " Lieferadressen\n");
	if (ansprechpartners.size() > 0) {
		sb.append("Der erste Ansprechpartner ist:\n" + ansprechpartners.get(0).toString());
	} 
		return sb.toString();
	}

}
