package wbs.basic_data_types;

public class ImmutableAndFinalDemo {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// der durch s1 referenzierte string ist unveränderlich, aber
		// s1 kann immer wieder andere strings referenzieren
		String s1 = "blabla";
		
		// sb1 wird immer dasselbe StringBuffer- objekt referenzieren,
		// aber das StringBuffer- objekt selbst ist veränderlich
		final StringBuffer sb1 = new StringBuffer("lalla");
		
		s1 = "aha";  // ok
		
		// sb1 = new StringBuffer("aha");  compilerfehler
		sb1.append("nana");   // ok

	}

}
