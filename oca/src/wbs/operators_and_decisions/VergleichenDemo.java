package wbs.operators_and_decisions;

public class VergleichenDemo {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		
		String s1 = "anna";
		String s2 = "bert";
		
		StringBuffer sb1 = new StringBuffer("chris");
		StringBuffer sb2 = new StringBuffer("dieter");
			
		//wir geben aus ob n1 kleiner ist als n2
		System.out.println(n1 < n2);
		//wir geben aus ob s1 kleiner ist als s2
		System.out.println(s1.compareTo(s2) < 0);  // <0 erstes Arg. < zweites Arg.
		//wir geben aus, ob sb1 kleiner ist als sb2
		System.out.println(sb1.toString().compareTo(sb2.toString()) < 0); // >0 erstes Arg. > zweites Arg.
	}

}
