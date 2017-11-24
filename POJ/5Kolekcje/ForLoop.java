import java.util.ArrayList;

class ForLoop {
	public static void main(String args[]) {
		double a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double result = 0;

		// normalna petla for
		for (int i = 0; i < a.length; i++)
			result += a[i];
		System.out.println(result);

		// inna forma petli for
		result = 0;
		for (double el : a)
			result += el;
		System.out.println(result);

		ArrayList<String> al = new ArrayList<String>();

		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		for (String v : al)
			System.out.println(v);
	}
	
}
