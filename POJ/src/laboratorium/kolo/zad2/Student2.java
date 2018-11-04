package laboratorium.kolo.zad2;

import java.util.*;

public class Student2 implements IStudent {
	List<Integer> w = new ArrayList<>();

	public void uczysie(Integer wiedza) {
		w.add(wiedza);
	}

	public Student2 clone() {
		Student2 cloned = new Student2();
		// cloned.w = this.w;
		for (Integer i : this.w)
			cloned.w.add(new Integer(i.intValue()));
		return cloned;
	}

	public String toString() {
		return "Student2 [w=" + w + "]";
	}
	
}
