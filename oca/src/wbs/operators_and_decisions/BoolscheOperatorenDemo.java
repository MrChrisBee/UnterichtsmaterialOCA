package wbs.operators_and_decisions;

class Helper{
	private int n = 1;
	public boolean m1() {
		n++;
		return true;
	}
	public int getN() {
		return n;
	}
	
}

public class BoolscheOperatorenDemo {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2;
		
		Helper h = new Helper();
		b2 = (b1 || h.m1()); // m1() wird nicht ausgeführt
		System.out.print(b2 + "  ");
		System.out.println(" n ist "+h.getN());
		
		b1 = false;
		b2 = (b1 && h.m1()); // m1() wird nicht ausgeführt
		System.out.print(b2 + "  ");
		System.out.println(" n ist "+h.getN());
		b1 = true;
		b2 = (b1 | h.m1());// m1() wird ausgeführt
		System.out.print(b2 + "  ");
		System.out.println(" n ist "+h.getN());
		b1 = false;
		b2 = (b1 & h.m1()); // m1() wird ausgeführt
		System.out.print(b2 + "  ");
		System.out.println(" n ist "+h.getN());
		
		
	}

}
