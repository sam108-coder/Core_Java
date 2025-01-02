package constructorReference;

import java.util.ArrayList;
import java.util.Collections;

public class NumberSort2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("Before Sort :: " + al);

		// Collections.sort(al, new NumberComparator1());

		// Ascending
		// Collections.sort(al,(i,j)-> i.compareTo(j));

		// Descending 
		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1);

		System.out.println("After Sort :: " + al);

	}
}


