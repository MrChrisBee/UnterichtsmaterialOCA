package wbs.vererbung;

public abstract class Figur2D implements Comparable<Figur2D> {
	private static int counter = 0;
	private int id;

	protected Figur2D() {
		id = ++counter;
	}

	public abstract double Flaeche();

	public abstract double Umfang();

	public static int getCounter() {
		return counter;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Figur2D [id=" + id + ", Flaeche()=" + Flaeche() + "]";
	}

	@Override
	public int compareTo(Figur2D other) {
		double diff = this.Flaeche() - other.Flaeche();
		int Result = 0;
		if (diff > 0) {
			Result = 1;
		} else if (diff < 0) {
			Result = -1;
		}
		return Result;
	}

}
