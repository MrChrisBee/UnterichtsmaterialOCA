package wbs.vererbung;

class Base1 {
	public Base1() {
		System.out.println("Base()");
	}

	public Base1(int n) {
		System.out.println("Base(int)");
	}

	public void m() {
		System.out.println("m() von Base");
	}
}

class Sub110 extends Base1 {
	public Sub110() {
		super();	// Optional
		System.out.println("Sub()");
	}
	public Sub110(int n) {
		super(n);  // nicht Optional da sonnst der parameterlose Konstruktor von Base1 genutzt wird
		System.out.println("Sub(int)");
	}
	public void m() {
		super.m();
		System.out.println("m() von Sub");
	}

}

public class SuperDemo {

	public static void main(String[] args) {
		Sub110 sub1 =  new Sub110();
		sub1.m();
		Sub110 sub2 =  new Sub110(12345);
		sub2.m();
	}

}
 