package laboratorium.kolo.zad2;

class ConstReadOnly {
	final Integer x = 1;
	
	final int y;
	
	public ConstReadOnly(int y) {
//		this.x = 2;
		this.y = y;
	}
	
	public static void main(String[] args) {
		ConstReadOnly o1 = new ConstReadOnly(7);
		ConstReadOnly o2 = new ConstReadOnly(7);
		ConstReadOnly o22 = o2;
		
		System.out.println(o1.x + " " + o1.y);
		System.out.println(o2.x + " " + o2.y);
		System.out.println(o2 == o1);
	}
}
