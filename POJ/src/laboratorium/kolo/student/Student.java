package laboratorium.kolo.student;

import java.util.ArrayList;

import laboratorium.kolo.zad2.IStudent;

public class Student implements IStudent {
	private ArrayList<Integer> w = new ArrayList<>();
	
	public Student() {}
	
	public Student(Student s) {
		this.w = new ArrayList<Integer>(s.w);
	}
	
	@Override
	public void uczysie(Integer wiedza) {
		w.add(wiedza);
	}

	public ArrayList<Integer> getW() {
		return w;
	}

	public void setW(ArrayList<Integer> w) {
		this.w = w;
	}

	@Override
	public String toString() {
		return "Student [w=" + w + "]";
	}
	
}
