package laboratorium.lab1;

public class Punkt {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	Punkt(int x, int y){
		this.x = x;
		this.y = y;
	}

	Punkt(){
		x = 0;
		y = 0;
	}
	
	public String toString(){
		return "("+x+", "+y+")";
	}
	
	public double odleglosc(Punkt p){
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}