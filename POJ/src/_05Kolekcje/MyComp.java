package _05Kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class MyCompDef<E extends Comparable<E>> implements Comparator<E> {
	public int compare(E a, E b) {
//		return b.compareTo(a);
		return a.compareTo(b);
	}
}

class MyComp {
	public static void main(String args[]) {
		TreeSet<String> ts = new TreeSet<String>(new MyCompDef<>());

		ts.add("A");
		ts.add("H");
		ts.add("O");
		ts.add("B");
		ts.add("I");
		ts.add("P");
		ts.add("C");
		ts.add("J");
		ts.add("Q");
		ts.add("D");
		ts.add("K");
		ts.add("R");
		ts.add("E");
		ts.add("L");
		ts.add("S");
		ts.add("F");
		ts.add("M");
		ts.add("T");
		ts.add("G");
		ts.add("N");
		ts.add("U");
		ts.add("W");
		ts.add("V");
		ts.add("X");
		ts.add("Y");
		ts.add("Z");

		// wypisujemy elementy
		for (String s : ts)
			System.out.print(s + " ");

		System.out.println();
//		System.out.println(ts);

		TreeSet<Integer> integer = new TreeSet<Integer>(new MyCompDef<>());

		integer.add(10);
		integer.add(9);
		integer.add(15);
		integer.add(22);
		integer.add(18);
		integer.add(7);
		integer.add(1);
		integer.add(0);
		integer.add(2);
		integer.add(10);
		integer.add(100);
		integer.add(-5);

		for (Integer i : integer)
			System.out.print(i + " ");

		System.out.println();

		ArrayList<Integer> ii = new ArrayList<Integer>();

		ii.add(10);
		ii.add(9);
		ii.add(15);
		ii.add(22);
		ii.add(18);
		ii.add(7);
		ii.add(1);
		ii.add(0);
		ii.add(2);
		ii.add(10);
		ii.add(100);
		ii.add(-5);

		Collections.sort(ii, new MyCompDef<>());

		for (Integer i : ii)
			System.out.print(i + " ");


	}
}
