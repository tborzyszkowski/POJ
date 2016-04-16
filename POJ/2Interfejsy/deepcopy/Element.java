package deepcopy;

public class Element implements Cloneable {
	private int i = 5;
	
	public Element clone() {
		try {
			Element cloned = (Element) super.clone();
			cloned.i = i;
			return cloned;
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
			return null;
		}
	}
	
	public String toString() {
		return "Element [i=" + i + "]";
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
}
