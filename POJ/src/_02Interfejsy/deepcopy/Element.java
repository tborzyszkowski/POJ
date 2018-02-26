package _02Interfejsy.deepcopy;

public class Element //extends Foo 
implements Cloneable {
	private int i = 5;
	
	public Element clone() {
		//try {
			Element cloned = new Element();//(Element) super.clone();
			cloned.i = i;
			return cloned;
//		} catch (CloneNotSupportedException e) {
//			System.out.println(e);
//			return null;
//		}
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
