package _02Interfejsy.deepcopy;

public class Dolly implements Cloneable {
	private Element e = new Element();
	private int w = 10;

	public Dolly clone(){
		try {
			Dolly cloned = (Dolly) super.clone();
			cloned.e = (Element) e.clone();
//			cloned.e = e;
			return cloned;
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
			return null;
		}
	}

	public String toString() {
		return "Dolly [e=" + e + ", w=" + w + " hash = "+ this.hashCode() +"]";
	}

	public Element getE() {
		return e;
	}

	public void setE(Element e) {
		this.e = e;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}
	
}
