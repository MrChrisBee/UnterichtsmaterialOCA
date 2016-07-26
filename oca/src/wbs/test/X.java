package wbs.test;

class X {
	static void m(Integer j) {
		j += 7;
	}

	public static void main(String[] args) {
		Integer j = 12;
		m(j);
		System.out.println(j);
	}
}