package wbs.vererbung;

public class ValidateFigur2DDemo {

	public static void main(String[] args) {

		try {
			Figur2D f1 = new Kreis(0);
			System.out.println(f1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			Figur2D f2 = new Rechteck(0, -1);
			System.out.println(f2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Figur2D f3 = new Kreis(1);
			System.out.println(f3);
		} catch (Exception e) {
			e.getMessage();
		}
		
	} 
	

}
