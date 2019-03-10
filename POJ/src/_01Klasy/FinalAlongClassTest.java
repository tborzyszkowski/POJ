package _01Klasy;

class FinalAlongClass{
	final int STALA = 5;
	
//	FinalAlongClass(int val){
//		this.STALA = val;
//	}
}

class FinalAlongObject{
	final int STALA;
	
	FinalAlongObject(int val){
		STALA = val;
//		setSTALA(val);
	}
	
//	void setSTALA(int val){
//		STALA = val;
//	}
	
}


public class FinalAlongClassTest {
	public static void main(String args[]) {
		FinalAlongClass fac1 = new FinalAlongClass();
		FinalAlongClass fac2 = new FinalAlongClass();
		
		System.out.println("fac1 = " + fac1.STALA);
		System.out.println("fac2 = " + fac2.STALA);
//		fac1.STALA = 8;
		
		FinalAlongObject fao1 = new FinalAlongObject(5);
		FinalAlongObject fao2 = new FinalAlongObject(6);
		
		System.out.println("fao1 = " + fao1.STALA);
		System.out.println("fao2 = " + fao2.STALA);
//		fao1.STALA = 9;
	}
}
