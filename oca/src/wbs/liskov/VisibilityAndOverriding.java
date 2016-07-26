package wbs.liskov;

class Base3 {
	protected void m1() {

	}

	void m2() {

	}
}

class Sub3 extends Base3 {
/*
 * Sichtbarkeiten in absteigender Reihenfolge 
 * 
 * public protected PACKETSICHTBAR private 
 * PACKETSICHTBAR sind an der fehlenden definition zu erkennen
 * 
 * und nun eine Korrekte und eine Inkorrekte Überschreibung
 */
	public void m1() {
		// bessere Sichtbarkeit ist möglich
	}

	protected void m2() {
		// bessere Sichtbarkeit ist möglich
	}
//	void m1() {} // so wird m1 weniger gut gesehen -- Verstecken is wohl nich
//
//	private void m2() {} // so wird m2 weniger gut gesehen -- Verstecken is wohl nich

}