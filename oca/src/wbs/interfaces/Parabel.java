package wbs.interfaces;

public class Parabel implements IFunction {
private double a;
private double b;
private double c;


	public Parabel(double a, double b, double c) {
	this.a = a;
	this.b = b;
	this.c = c;
}


	public double getA() {
		return a;
	}


	public double getB() {
		return b;
	}


	public double getC() {
		return c;
	}


	@Override
	public double f(double x) {
		return a*x*x+b*x+c;
	}

}
