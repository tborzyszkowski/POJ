package pizzeria;
//klasa pizzy
public class Pizza 
{
    //deklarujemy potrzebujemy wszystkie potrzebne dane
  private static int IlePizz = -1;
  String nazwaPizzy;
  String skladniki;
  int poziomOstrosci;
  int[] ceny=new int[3];
  //konstruktor 
    public  Pizza(String a,String b,int c, int m,int s,int d){
   nazwaPizzy=a;
  skladniki=b;
   poziomOstrosci=c;
   ceny[0]=m;
   ceny[1]=s;
   ceny[2]=d;
   IlePizz++;
   
           
    }
    //metoda klasy menu odpowiadajaca za wyswietlanie 'etykiety' danego obiketu klasy Menu w tym przypadku pizzy
   public void etykietaPizzy(){
       System.out.print(nazwaPizzy+" "+"Składniki: "+skladniki+" "+"PoziomOstrości: "+ poziomOstrosci+" "+"Cena: "+"mała: "+ceny[0]+" średnia: "+ceny[1]+" duża: "+ceny[2]+"\n");
       
   } 
   // metoda pokazujaca ile obiektow klasy Pizza zostalo juz utworzonych
public static int pokazIlePizz() {
    return IlePizz;
}
}
