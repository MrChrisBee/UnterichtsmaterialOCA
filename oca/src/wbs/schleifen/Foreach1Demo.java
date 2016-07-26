package wbs.schleifen;

public class Foreach1Demo {
	/*
	 * wir geben alle Aufrufargumente aus und nutzen dafür die Foreach schleife
	 */
	public static void main(String[] args) {
		for(String argument : args) {
			System.out.println(argument);
		}
	}

}
