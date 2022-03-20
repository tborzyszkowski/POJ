package _01Klasy;

class Outer {
	int xInOuterClass = 100;
	static int yInOuterClass = 200;
	int z;

	void test() {
		Inner2 inner = new Inner2();
		inner.display();
		System.out.println(inner.y);
		Inner2.z++;
		//Inner2.y++;
	}

	static class Inner2 {
		static int z = 20;
		int y = 10;
		int outer_x = 200;
		Outer oo = new Outer();

		static {
			z = z + 1;
		}

		void display() {
			System.out.println(" display: outer_y = " + yInOuterClass + "\n");
			System.out.println(" display: outer_x = " + oo.xInOuterClass + "\n");
		}
	}

	void show_y() {
		//System.out.println(y);
		System.out.println();
		System.out.println(Inner2.z);
	}

	int getZ() {
		return Inner2.z;
	}
}

class InnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();

		outer.test();
		outer.show_y();
		System.out.println(outer.getZ());
	}
}
