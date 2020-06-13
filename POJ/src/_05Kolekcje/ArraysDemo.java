package _05Kolekcje;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String args[]) {

		int array[] = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = -3 * i;

		System.out.println("Oryginalna tablica ");
		for (int a : array)
			System.out.print(a + "\t");
		System.out.println();

		Arrays.sort(array);
		System.out.println("Posortowana tablica ");
		for (int a : array)
			System.out.print(a + "\t");
		System.out.println();

		Arrays.fill(array, 2, 6, -1);
		System.out.println("Po wypelnieniu tablica ");
		for (int a : array)
			System.out.print(a + "\t");
		System.out.println();

		Arrays.sort(array);
		System.out.println("Posortowana tablica ");
		for (int a : array)
			System.out.print(a + "\t");
		System.out.println();

		System.out.println("-9 jest na pozycji tablica  ");
		System.out.println(Arrays.binarySearch(array, 9));
	}
}
