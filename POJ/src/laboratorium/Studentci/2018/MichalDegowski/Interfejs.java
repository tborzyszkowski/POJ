package pizzeria;
//klasa wykorzystujaca wzorzec singleton ,aby moc stworzyc tylko jeden obiket klasy Interfejs
public class Interfejs  {
    // zmienne przechowująca instancję naszej klasy
   private static Interfejs instance=null;
//tworzymy prywatny konstruktor  (aby nie można było utworzyć dodatkowych instancji)
   private Interfejs(){  
    }
   //synchronizacja jezeli aplikacja bylaby rozbudowana o dodatkowe watki
   public static Interfejs getInstance()
   {
       // jezeli nie zostal jeszcze stworzony obiekt Singletona to go tworzymy
       //jezeli byl zwracamy instancje
       if(instance==null)
        instance=new Interfejs();
       return instance;
   }
  //koniec  

//metoda klasy Interfejs odpowiedzialna za wyswietlanie glownego menu
    public  void wyswietlanieMenu(){
    System.out.print("         Witaj w PizzeriJava !!\n");
    System.out.print("1.Zamów pizze\n");
    System.out.print("2.Kontakt\n");
    System.out.print("3.Podsumowanie zamówienia i płatność\n");
    System.out.print("4.Stworz swoja pizze\n");
    }
     //metoda klasy Interfejs odpowiedzialna za wyswietlanie sekcji kontakt  
    public   void Kontakt()
    {
        System.out.print("Miasto:Gdansk\n");
        System.out.print("Ulica:Nowa\n");
        System.out.print("Telefon:555255521\n");
        System.out.print("mail:pizzeriaJava@gmail.com\n");
    }
    //metoda klasy Interfejs odpowiedzialna za wyswietlanie sekcji wyjscie
    public   void Wyjscie(int cena,String zamowienia[],int ileZamowien){
        System.out.print("Łączny koszt twojego zamówienia wynosi: " +cena +"zł\n");
        //wyswietlanie wszystkich zamowien
        for(int i=0; i<ileZamowien; i++)
        {System.out.print(zamowienia[i]+"\n");
         
        }
    
    }
    //metoda klasy interfejs odpowiadajaca za tworzenie pizzy
    public  void TworzeniePizzy(){
        System.out.print("Witaj w kreatorze tworzenia wlasnej pizzy\n");
        System.out.print("Dodaj jakie tylko chcesz składniki\n");
        
    }
    
    }
    
    

