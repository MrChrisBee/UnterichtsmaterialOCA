package wbs.test;

public class SampleClass {
	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		@SuppressWarnings("unused")
		SampleClass sc = new SampleClass();
		sc = asc;
	}
}

class AnotherSampleClass extends SampleClass {
}