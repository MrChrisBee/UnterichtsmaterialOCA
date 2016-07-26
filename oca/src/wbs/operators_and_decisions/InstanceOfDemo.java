package wbs.operators_and_decisions;

/*
 *  der Reference-Typ von Feldern und variablen wird zur compile-Time festgelegt 
 *  und ist dem Compiler damit auch bekannt
 *  
 *  der Objekt-Typ entscheidet sich zur Laufzeit und ist dem Compiler nicht bekannt
 */


public class InstanceOfDemo {
	public static void main(String[] args) {
		
		CharSequence cs = "blabla";
		System.out.println(cs instanceof String);
		System.out.println(cs instanceof StringBuffer);
		
		cs = new StringBuffer("blabla");
		System.out.println(cs instanceof String);
		System.out.println(cs instanceof StringBuffer);
		
		//System.out.println(cs instanceof Integer);
		/*
		 * Liefert einen Compilerfehler weil Integer Final ist und es somit nie möglich werden kann
		 * 
		 */
		
		
		/*
		 * o instanceof T liefert true wenn ...
		 * o.getClass is a T
		 * ... zwischen dem Objektype von o und T eine IS A - Beziehung besteht
		 * 
		 * o instanceof T liefert false wenn ... 
		 * ... zwischen dem Objektype von o und T KEINE IS A - Beziehung besteht
		 * 
		 * o instanceof t erzeugt einen CompilerFehler wenn ...
		 * ... es keine mögliche Welt gibt, 
		 * in der zwischen dem Objekt-Type von o und T eine IS A - Beziehung besteht.
		 */
		
		System.out.println(cs instanceof Number);  //false
		
		cs = new StrangeNumber();
		System.out.println(cs instanceof Number);  //true
		
		
	}

}
