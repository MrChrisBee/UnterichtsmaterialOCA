package wbs.intro;


public class AnsprechpartnerDemo {

	@Override
	public String toString() {
		return "AnsprechpartnerDemo\n ";
	}

	public static void main(String[] args) {
		/*
		 * Wenn Felder eines Objektes nicht explizit im Konstruktor
		 * initialisiert werden, werden Sie mit dem Default ihres Typs vorbelegt
		 * 
		 * Bei Refeerenztypen ist der dafault null.
		 */
		Ansprechpartner a1 = new Ansprechpartner("Susi Sorglos", "1234", "hallo@doeskopp.de", Position.ENTWICKLUNG);
		Ansprechpartner a2 = new Ansprechpartner("Paul Paulsens", "1235", "voll_am@arsch.de", Position.SUPPORT);
		System.out.println(a1);
		System.out.println(a2);
	}

}
