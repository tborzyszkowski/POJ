package notatki2017;

import java.util.Scanner;

public class NumberParser {
	static Number parseValue() {
		Number val = 0;
		Scanner sc = new Scanner(System.in);
		boolean czyJeszcze = true;
		do {
			if (sc.hasNextInt()) {
				val =  new Integer(sc.nextInt());
				czyJeszcze = false;
			} else if (sc.hasNextDouble()) {
				val = new Double(sc.nextDouble());
				czyJeszcze = false;
			} else {
				sc.next();
			}
		} while (czyJeszcze && sc.hasNext());

		// if(val instanceof Integer)
		// try{
		// val = (T)new Integer(sc.nextInt());
		// } catch (Exception e) {
		// System.out.println(e);
		// }
		// else if (val instanceof Double)
		// try{
		// val = (T)new Double(sc.nextDouble());
		// } catch (Exception e) {
		// System.out.println(e);
		// }

		return val;
	}
	public static void main(String[] args) {
		Number n = parseValue();
		System.out.println("" + n.getClass()+ " "+ n);
	}

}
