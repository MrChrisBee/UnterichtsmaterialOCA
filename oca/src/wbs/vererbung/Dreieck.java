package wbs.vererbung;

/*
 * Der Entwickler einer Klasse muss garantieren das die Invarianten der 
 * Klasse eingehalten werden. Invarianten sind Eigenschaften oder Kombinationen 
 * von Eigenschaften die immer eingehalten seien müssen .
 * 
 * Invarianten im Dreieck:
 * 
 * a>0
 * b>0
 * c>0
 * s(s-a)(s-b)(s-c) > 0
 * 
 * wenn eine operation zu einer Verletzung dieser Invarianten führen würde dann muss der Code eine Exception werfen
 */
public class Dreieck extends Figur2D {
	private double a;
	private double b;
	private double c;

	public double getA() {
		return a;
	}

	public void setA(double sa) {
		validate(sa, this.b, this.c);
		this.a = sa;
	}

	public double getB() {
		return b;
	}

	public void setB(double sb) {
		validate(this.a, sb, this.c);
		this.b = sb;
	}

	public double getC() {
		return c;
	}

	public void setC(double sc) {
		validate(this.a, this.b, sc);
		this.c = sc;
	}

	public Dreieck(double a, double b, double c) {
		validate(a, b, c);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private void validate(double a2, double b2, double c2) {
		double s = (a2 + b2 + c2) / 2;
		if ((s * (s - a2) * (s - b2) * (s - c2)) <= 0 || a2 <= 0 || b2 <= 0
				|| c2 <= 0) {
			throw new IllegalArgumentException(
					"Die Seiten a, b und c ergeben mit den gegebenen Werten kein Dreieck.");
		}
	}

	@Override
	public double Flaeche() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));

	}

	@Override
	public double Umfang() {

		return a + b + c;
	}

	@Override
	public String toString() {
		return "Dreieck [Flaeche()=" + Flaeche() + ", getId()=" + getId() + "]";
	}

}
