package wbs.vererbung;

/*
 * Wir garantieren nun das man keine Kreise mit einem Radius von 0 oder kleiner erstellen kann
 */
public class Kreis extends Figur2D {
private double radius;


	public Kreis(double radius) {
	setRadius(radius);
}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Bitte einen Radius größer als 0 Eingeben!");
		}
		this.radius = radius;
	}

	@Override
	public double Flaeche() {
		return Math.PI * radius * radius;
	}

	@Override
	public double Umfang() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Kreis [getId()=" + getId() + ", Flaeche()=" + Flaeche() + "]";
	}

}
