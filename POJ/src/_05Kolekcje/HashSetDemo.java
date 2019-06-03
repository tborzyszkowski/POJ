package _05Kolekcje;

import java.util.*;

class HashSetDemo{
    public static void main(String args[]) {

	HashSet<String> hs = new HashSet<>(10);
	System.out.println(hs.isEmpty());
	
	hs.add("AA"); hs.add("HH"); hs.add("O1");
	hs.add("B1"); hs.add("I1"); hs.add("P1");
	hs.add("C1"); hs.add("J1"); hs.add("Q1");
	hs.add("D1"); hs.add("K1"); hs.add("R1");
	hs.add("E1"); hs.add("L1"); hs.add("S1");
	hs.add("F1"); hs.add("M1"); hs.add("T1");
	hs.add("G1"); hs.add("N1"); hs.add("U1");

	// w jakiej kolejnosci otrzymamy dane
	System.out.println(hs);

	hs.add("W"); hs.add("V"); hs.add("X");
	hs.add("B"); hs.add("I"); hs.add("P");
	hs.add("Y"); hs.add("Z");
	hs.add("1"); hs.add("2"); hs.add("3");
	hs.add("4"); hs.add("5");
	hs.add("aW"); hs.add("aV"); hs.add("aX");
	hs.add("aY"); hs.add("aZ");
	hs.add("a1"); hs.add("a2"); hs.add("a3");
	hs.add("a4"); hs.add("a5");
	hs.add("BB"); hs.add("BBBB");
	// a jakiej teraz
	System.out.println(hs);
	System.out.println(hs.contains("B") );
    }
}
