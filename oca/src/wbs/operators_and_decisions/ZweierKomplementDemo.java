package wbs.operators_and_decisions;

public class ZweierKomplementDemo {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(-n));
		int m = -100;
		m = ~m;
		m++;
		System.out.println(m);

	
	}

}
