package _06Wyjatki;

class Value {
	private int value;

	public int getValue() {
		return value;
	}

	public Value setValue(int value) {
		this.value = value;
		return this;
	}

	public Value setPPValue() {
		this.value++;
		return this;
	}

	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}

}

class ExcA {
	static void procA() throws RuntimeException {
		int a = 1;
		try {
			System.out.println("Wewnatrz procA: " + a);
			a++;
			throw new RuntimeException("To tylko test: " + a);
		} catch (RuntimeException e) {
			a++;
			System.out.println("Wewnatrz catch: " + a + " e: " + e);
			throw e;
		} finally {
			System.out.println("finally w procA: " + (++a));
			a = a / (a - a);
		}
	}

//	static int procB() {
//		int a = 1;
//		try {
//			System.out.println("Wewnatrz procB-0: " + a);
//			return ++a;
//		} finally {
//			System.out.println("finally w procB-1: " + a);
//			++a;
//			System.out.println("finally w procB-2: " + a);
//		}
//	}

//	static Integer procB() {
//		Integer a = 1;
//		try {
//			System.out.println("Wewnatrz procB-0: " + a);
//			return ++a;
//		} finally {
//			System.out.println("finally w procB-1: " + a);
//			++a;
//			System.out.println("finally w procB-2: " + a);
//		}
//	}

	static Value procB() {
		Value a = new Value().setValue(1);
		try {
			System.out.println("Wewnatrz procB-0: " + a);
			return a.setPPValue();
		} finally {
			System.out.println("finally w procB-1: " + a);
			a.setPPValue();
			System.out.println("finally w procB-2: " + a);
		}
	}

	static void procC() {
		try {
			System.out.println("Wewnatrz procC");
		} finally {
			System.out.println("finally w procC");
		}
	}

	public static void main(String args[]) {
//		try {
//			try {
//				procA();
//			} catch (Exception e) {
//				System.out.println("Main: wyjatek z procA obsłużony" + e);
//			}
//		} catch (Exception e) {
//			System.out.println("Main: wyjatek z procA obsłużony" + e);
//		}
		System.out.println("B: " + procB());
		// procC();
	}
}
