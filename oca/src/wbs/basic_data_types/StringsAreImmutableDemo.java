package wbs.basic_data_types;

public class StringsAreImmutableDemo {

	public static void main(String[] args) {
		String s1 = "haus";
		// concat() verändert nicht den string, für den concat aufgerufen
		// wird, sondern liefert eine referenz auf einen neuen string
		// da hier die von concat() gelieferte referenz nirgenwo gespeichert
		// wird, ist der string sofort kandidat für garbage collection
		s1.concat("meister");
		System.out.println(s1); // haus
		
		// StringBuffer- objekte sind veränderlich (immutable)
		StringBuffer  sb1 = new StringBuffer("haus");
		sb1.append("meister");
		System.out.println(sb1);  // hausmeister
		
		String s31 = "haus";
		String s32 = s31;
		s31 = s31.concat("meister");
		System.out.println(s31);  // hausmeister
		System.out.println(s32);  // haus
	}
}
