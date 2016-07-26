package wbs.basic_data_types;

public class C01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 100;
		// char c3 = 100000; Wertebereich von 0 bis 65535 also 2^16
		char c4 = '\u0061';

		byte b1 = 100;
		// byte b2 = 1.0; Wie soll ein Double in ein Byte passen? compiler
		// cannot convert from double to Byte
		// byte b3 = 088; 088 gibt es nicht: Literalfehler 
		// 
		// byte b4 = 0x88; wenn 088 also Oktal 88 schon zu viel ist was ist dann
		// erst 88 Hexadezimal
		byte b5 = 0x50;

		int i1 = 0b111;
		int i2 = 0b1_111;
		int i3 = 0b111_111;
		// int i4 = 1L; Long passt nicht in int

		float f1 = 1;
		// float f2 = 2.0; wenn nichts angegeben ist (2.0) ist immer double
		// gemeint (Gleitpunkt Literal) das in kein float passt
		float f3 = 2.0f;
		float f4 = 2_11.0_113f;
		double d1 = 1.0d;
		double d2 = 1.0f;
		// double d3 = 1.1e-12.2; 1.1 * 10 ^ 12 ok aber hoch 12.2 ?
		// double d5 = 0b111f; diese Schreibweise gibt es nur bei dezimalen
		// Literalen
		double d6 = 0b1110;
	}
}