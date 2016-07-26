package wbs.schleifen;
/*
 * wir geben alle Aufrufargumente aus
 * bis wir auf ein Argument stossen bei dem das 1. Zeichen gleich dem letzten Zeichen ist
 * 
 * 1. variante ohne break
 * 1. variante mit break
 */
public class BreakDemo {

	public static void main(String[] args) {
		for(int i = 0; i <args.length && args[i].charAt(0) != args[i].charAt(args[i].length()-1); i++) {
			System.out.println(args[i]);
		}
		System.out.println("***************************");
		for (String string: args) {
			if(string.charAt(0) == string.charAt(string.length()-1)) {
				break;
			}
			System.out.println(string);
		}

	}

}
