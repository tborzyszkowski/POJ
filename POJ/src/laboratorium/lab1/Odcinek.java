package laboratorium.lab1;

public class Odcinek {
	private Punkt a;
	private	Punkt b;
	
	Odcinek(Punkt a1, Punkt b1){
		a = a1;
		b = b1;
	}
	void setOdcinek(Punkt x, Punkt y){
		a = x;
		b = y;
	}
	Punkt getA(){
		return a;
	}
	Punkt getB(){
		return b;
	}
	public String toString(){
		return "["+a+", "+b+"]";
	}
	public double dlugosc(){
		return a.odleglosc(b);
	}
	public double odlegloscPunktu(Punkt p){
		double kier = (b.getY() - a.getY()) / (b.getX() - a.getX());
		double cz1 = (b.getX() * a.getY() - a.getX() * b.getY()) / (b.getX() - a.getX());
		return Math.abs(kier * p.getX() - p.getY() + cz1) / Math.sqrt(kier * kier + 1);
	}
}
