package wbs.schleifen;

public class ContinueDemo {
	/*
	 * wir geben alle Aufrufargumente mit ungeradem Index aus
	 * 
	 * args[1]args[3]args[5]args[7]
	 * 
	 * 1. variante ohne continiue
	 * 1. variante mit continiue
	 */
	public static void main(String[] args) {
		for (int i = 1; i < args.length; i++) {
			if ((i % 2) != 0) {
				System.out.println(args[i]);
			}
		}

		for (int i = 1; i < args.length; i++) {
			if((i % 2) == 0) 
				continue;
			System.out.println(args[i]);
		}

	}
}
