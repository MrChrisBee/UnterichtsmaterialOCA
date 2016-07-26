package wbs.test;

public class TestStudent {
	public static void main(String[] args) {
		Student bob = new Student();
		Student jian = new Student();
		bob.name = "Bob";
		bob.age = 19;
		jian = bob;  // leider bleibt es bei einem Objekt jian zeigt jetzt nur auf Bob
		jian.name = "Jian";
		System.out.println("Bob's Name: " + bob.name);
		System.out.println(jian == bob);
		System.out.println(jian.age);
	}
}