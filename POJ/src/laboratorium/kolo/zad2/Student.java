package laboratorium.kolo.zad2;


public class Student implements IStudent, Cloneable{
	private double w = 0;

	public void uczysie(Integer wiedza) {
		w+= wiedza;
	}
	
	public Student clone() {
			Student cloned = new Student();
			cloned.w = this.w;
			return cloned;
	}

	public String toString() {
		return "Student [w=" + w + "]";
	}
}
