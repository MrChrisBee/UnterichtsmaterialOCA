package wbs.vererbung;

public class Rechteck extends Figur2D {
	private double a;
	private double b;

	public Rechteck(double a, double b) {
		setA(a);
		setB(b);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		validate(a);
		this.a = a;
	}
 
	public double getB() {
		return b;
	}

	public void setB(double b) {
		validate(b);
		this.b = b;
	}

	public double Flaeche() {
		return a * b;
	}

	public double Umfang() {
		return 2 * a + 2 * b;
	}
	private void validate(double x) {
		if(x<=0) {
			throw new IllegalArgumentException("Bitte positiven Wert größer 0 eingeben.");
		}
	}
	@Override
	public String toString() {
		return "Rechteck [getId()=" + getId() + ", Flaeche()=" + Flaeche()
				+ "]";
	}
	
}
