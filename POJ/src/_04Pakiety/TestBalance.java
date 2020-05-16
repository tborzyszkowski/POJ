package _04Pakiety;

//import _04Pakiety.MyPack1.Balance;

//import  _04Pakiety.MyPack2.*;
import  _04Pakiety.MyPack1.*;


//class Balance {
//	String name;
//	double bal;
//
//	public Balance(String n, double b) {
//		name = n;
//		bal = b;
//	}
//
//	public void show() {
//		if (bal < 0)
//			System.out.println("==>");
//		System.out.println(name + "----: USD " + bal);
//	}
//}

class TestBalance {
	public static void main(String args[]) {

		Balance current[] = new Balance[3];

		current[0] = new Balance("J.F.K", -8888.8888);
		current[1] = new Balance("W. Tell", 9989.9989);
		current[2] = new Balance("T.B.", 1212.1212);

		for (int i = 0; i < 3; i++)
			current[i].show();
	}
}
