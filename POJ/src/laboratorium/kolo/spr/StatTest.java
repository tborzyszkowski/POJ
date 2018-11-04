package laboratorium.kolo.spr;

import java.util.HashSet;
import java.util.Set;

@FunctionalInterface
interface IntBinaryOprator{
	int applayAsInt(int l, int r);
}

public class StatTest {
	
	public static void main(String[] args) {
		IntBinaryOprator adder1 = (x, y) -> x+y;
		int x = adder1.applayAsInt(1,2);
	}
}
