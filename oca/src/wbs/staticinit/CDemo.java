package wbs.staticinit;

public class CDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String className = "wbs.staticinit.C";
		/*
		 * Wir laden die Klasse deren Bezeichner in className steht zur 
		 * Laufzeit mit Class.forName(). Mit dem Class-Objekt das uns die Methode forName()
		 * liefert erzeugen wir (unter Verwendung der Methode newInstance()) 2 Instanzen
		 * der Klasse C
		 */
		try {
			Class<?> t = Class.forName("wbs.staticinit.C");
			Object hierPasstAllesRein = t.newInstance();
			Object hierPasstAllesRein2 = t.newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("Klasse nicht vorhanden");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
		//C c = new C(); das währe ja einfach 

	}

}
