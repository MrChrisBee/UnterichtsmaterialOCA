package wbs.test;

public class S31 {
	public static void main(String[] args) {
		int i, j = 1;
		for (i = 1; i < 4; i++) {
			for (j = 1; j < 4; j++) {
				if (i == 3) {
					continue;
				}
				System.out.println(i + "," + j);
			}
		}
		System.out.println("i: " + i);
		System.out.println("j: " + j);
	}
}