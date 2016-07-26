package wbs.interfaces;

// wir implementieren lineare Funktion
// Lineare Funktionen haben die folgende Form a * x + b
// z.B. 3*x+13  -3*x-7
public class LineareFunktion implements IFunction {
	private double a; //faktor
	private double b; //konstante
	
	
	public LineareFunktion(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	@Override
	public double f(double x) {
		return a*x+b;
	}
		 
}
