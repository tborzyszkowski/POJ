package pizzeria;
import java.util.Scanner;

//klasa z algorytmami odpowiedzialnymi za obliczanie ceny i rozpoznawanie pizzy
public class SystemZamawiania {
    
    //deklarowanie potrzebnch zmiennych
    int cenaDowozu=0;
    //akutalna cena dowozu
   
    String JakaPizza,CzyNaMiejscu;
    int ileDan,wielkosc;
    String czyDalekiDowoz;
    //kontruktor
    public SystemZamawiania(){
        JakaPizza="";
        CzyNaMiejscu="";
        ileDan=0;
        wielkosc=0;
    }
    //metoda zliczajca cene wvbranej pizzy
    public  int zliczanieCeny(Pizza pizza){
       return pizza.ceny[wielkosc]*ileDan;
        
    }
    //metoda sprawdzajaca jaka pizze wybral klient
    public static  void   jakaPizza(Pizza menu[], String jakaPizza ,int ileWMenu){
        for(int i=0; i<=ileWMenu; i++)
            if(menu[i].nazwaPizzy.equals(jakaPizza))
            {    System.out.print("Wvbrales: \n");
                 menu[i].etykietaPizzy();
                break;
            }
        System.out.print("Niestety nie posiadamy takiej pizzy w naszym menu \n");
        
    }
    
    
    // metoda doliczajaca (lub nie) cene dowozu
    // jeden z argumentow to obiekt  interfejsu CenaDowozu
    public  void cenaZdowozem(int cenaJedzenia,CenaDowozu cena)
    {
        
        if(CzyNaMiejscu.equals("N"))
        {
            cenaJedzenia+=cena.ileDowoz(0);
            System.out.print("Dowoz kosztuje: "+cena.ileDowoz(0)+"\n");  
        }
        System.out.print("Łączny koszt: "+cenaJedzenia+"\n"); 
    }
   
    //metoda odpowiedzialna za zadawnie pytan o nazwe pizz , rozmiar , wielkosc ...
    public void pytaniaDoZamowienia(){
          Scanner odczyt = new Scanner(System.in); 
          Scanner odczytInt=new Scanner(System.in);
        System.out.print("Którą pizze wybierasz ?\n");
                JakaPizza=odczyt.nextLine();
                System.out.print("Ile ?\n");
                ileDan=odczytInt.nextInt();
                System.out.print("Jakiej wielkosci[mala-0,srednia-1,duza-2] ?\n");
                wielkosc=odczytInt.nextInt();
                System.out.print("Zjesz na miejscu(Y/N) ?\n");
                CzyNaMiejscu=odczyt.nextLine();        
    }
    
}
