package wbs.schleifen;

import java.util.Iterator;
import java.util.List;

public class IterableZahl implements Iterable<Integer>{
	private List<Integer> primfaktoren;
	int zahl;
	
	public IterableZahl(int zahl) {
		if (zahl < 1) {
			throw new IllegalArgumentException("Ungültiges Argument Die Zahl sollte größer 0 sein!");
		}
		this.zahl = zahl;
		primfaktoren = wbs.operators_and_decisions.IntegerUtil.primFaktoren(zahl);
		
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return primfaktoren.iterator();
	}

	public int anzahlPrimfaktoren() {
		return primfaktoren.size();
	}
	@Override
	public String toString() {
		return Integer.toString(zahl);
	}
}
