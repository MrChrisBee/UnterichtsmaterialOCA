package wbs.interfaces;

public class HochN implements IFunction {
	private int potenz;

	public HochN(int potenz) {
		super();
		this.potenz = potenz;
	}

	@Override
	public double f(double x) {
		double ergebnis = 1.0;
		for (int i = 1; i <= potenz; i++) {
			ergebnis = ergebnis * x;
		}
		return ergebnis;
	}

}
