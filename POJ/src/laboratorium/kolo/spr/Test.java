package laboratorium.kolo.spr;

class Liczby{
    static  int a = 3;
    private int b = 2;
    Liczby(int i){
		a = a + i;
		b = i * 2;
    }
    Liczby(){
		b = a - 1;
		a = b / 2;
    }
    void wyswietl(){
		System.out.println("a = " + a + " b = " + b);
    }
    static{
		a = a + 1;
    }
}

class Test{
    public static void main(String[] args){
		System.out.println(Liczby.a);
		Liczby.a++;
		Liczby licz1 = new Liczby(4);
		Liczby licz2 = new Liczby(3);
		Liczby licz3 = new Liczby();
		licz1.wyswietl();
		licz2.wyswietl();
		licz3.wyswietl();
    }
}