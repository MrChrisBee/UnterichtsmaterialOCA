package wbs.test;

public class FinalForDemo {

	public static void main(String[] args) {
//	for (final int i=0; i<10; i++ ) { // das geht nicht da i final ist
//		System.out.println(i);
//	}
//	
		int[] a = {1,2,3,4,5};
		// hier soll es gehen
		for(final int j:a) {
			System.out.println(j);
		}
	}

}
