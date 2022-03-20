package _01Klasy;


class Absolute {
	static short abs(short a) {
		return (a > 0) ? a : (short)-a;
	}
	static int abs(int a) {
		return (a > 0) ? a : -a;
	}
	static long abs(long a) {
		return (a > 0) ? a : -a;
	}
	static float abs(float a) {
		return (a > 0) ? a : -a;
	}
	static double abs(double a) {
		return (a > 0) ? a : -a;
	}
}

class AbsDemo {
	public static void main(String[] args) {
		System.out.println("short  abs = " + Absolute.abs((short) -100));
		System.out.println("int    abs = " + Absolute.abs(-100));
		System.out.println("long   abs = " + Absolute.abs(-100000000000000000L));
		System.out.println("float  abs = " + Absolute.abs(-123456789.123456789f));
		System.out.println("float  abs = " + 123456789.123456789f);
		System.out.println("double abs = " + Absolute.abs(-123456789.123456789));
		System.out.println("double abs = "
				+ Absolute.abs(-123456789.123456789123456789));
	}
}
