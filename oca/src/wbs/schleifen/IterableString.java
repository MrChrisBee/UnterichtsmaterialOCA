package wbs.schleifen;

import java.util.Iterator;
import java.util.NoSuchElementException;

class StringItr implements Iterator<Character> {

	private CharSequence cs;
	private int index = 0;
	
	public StringItr(CharSequence cs) {
		this.cs = cs;
	}
	
	@Override
	public boolean hasNext() {
		return index < cs.length();
	}
	
	@Override
	public Character next() {
		if(! hasNext()) {
			throw new NoSuchElementException("no more elements...");
		}
		return cs.charAt(index++);
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove not supported...");
	}
}

public class IterableString implements Iterable<Character> {

	private CharSequence cs;
	
	public IterableString(CharSequence cs) {
		this.cs = cs;
	}
	@Override
	public Iterator<Character> iterator() {
		return new StringItr(cs);
	}

}

