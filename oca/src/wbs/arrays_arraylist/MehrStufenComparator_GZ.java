package wbs.arrays_arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MehrStufenComparator_GZ<T> implements Comparator<T> {

	private List<Comparator<T>> cmpList = new ArrayList<>();
	
	@Override
	public int compare(T t1, T t2) {
		int result = 0;
		for(Comparator<T> cmp : cmpList) {
			result = cmp.compare(t1, t2);
			if(result != 0) {
				break;
			}
		}
		return result;
	}

	public List<Comparator<T>> getCmpList() {
		return cmpList;
	}
}
