package _01Klasy;

class Static1 {
	private static int a = 3;
	private static int b = 1;

	private static void pisz(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b + "\n");
	}

	private static void test(Integer i) {
		System.out.println("i = " + i.intValue());
	}

	static {
		System.out.println("Blok statyczny wykonany");
		b = b * 4;
	}

	public static void main(String args[]) {
		pisz(1234);
		test(new Integer(3));
		test(3);
		pisz(56789);
	}
}
