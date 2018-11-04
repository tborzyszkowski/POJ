//glowna klasa 
package pizzeria;

import java.util.Scanner;

public class Pizzeria {

    //glowna metoda main
    public static void main(String[] args) {

        //tablica w ktorej zapamietujemy zamowienia
        String[] zamowionePizze = new String[100];
        int ileRoznychZamowien = 0;

        //laczna cena zamowienia
        int cena = 0;

//tablica obiektow -Menu naszej restauracji
        Pizza[] menu = new Pizza[50];

        //tworzenie obiektu odpowiedzialnego za zamawianie dan
        SystemZamawiania system = new SystemZamawiania();

        // tworzenie obiektów klasy menu i ich inicjalizacja 
        Pizza wegetarianska = new Pizza("Wegetarianska", "papryka,pomidor,ser", 0, 20, 25, 30);
        menu[Pizza.pokazIlePizz()] = wegetarianska;
        Pizza capricciosa = new Pizza("Capricciosa", "pieczarki, sos, szynka", 1, 22, 27, 32);
        menu[Pizza.pokazIlePizz()] = capricciosa;
        Pizza pepperoni = new Pizza("Pepperoni", "salami, papryka ostra, cebula, ser", 5, 25, 30, 35);
        menu[Pizza.pokazIlePizz()] = pepperoni;
//tworzymy obiekt klasy Interfejs odpowiedzialny za wyswietlanie menu za pomoca naszej funkcji getInstance
// poniewaz konstruktor jest prywatny
Interfejs nowyInterfejs= Interfejs.getInstance();
//przygotowywujemy odczyt
        String wyborOpcji;
        nowyInterfejs.wyswietlanieMenu();

        //MenuPetla
        while (true) {
            //PobieranieOdUżytkownika wyboru
            Scanner odczyt = new Scanner(System.in);
            wyborOpcji = odczyt.nextLine();
            switch (wyborOpcji) {
                //SekcjaZamawianie

                case "1":
                    //wyswietlanie dostepnego menu restauracji
                    for (int i = 0; i <= Pizza.pokazIlePizz(); i++) {
                        menu[i].etykietaPizzy();
                    }

                    //pytania precyzujace zamowienie
                    system.pytaniaDoZamowienia();

                    //wyswietlamy jaka dokladnie pizze wybral uzytkownik
                    // jezeli zgadza sie z menu obliczamy cene i wyswietlamy jego wybor
                    boolean czyPoprawnaPizza = false;
                    for (int i = 0; i <= Pizza.pokazIlePizz(); i++) { //jezeli nazwa wprowadzona jest taka sama jak ktoras w menu
                        if (menu[i].nazwaPizzy.equals(system.JakaPizza)) {       //wyswietlamy etytkiete pizzy
                            menu[i].etykietaPizzy();
                            //flaga czyPoprawnaPizza=true    
                            czyPoprawnaPizza = true;
                            //wpisujemy Pizze do listy zamowien oraz zwiekszamy ilosc zamowien
                            zamowionePizze[ileRoznychZamowien] = menu[i].nazwaPizzy;
                            ileRoznychZamowien++;
                            //zwiekszamy cene odpowiadnia funkcja klasy system
                            cena = system.zliczanieCeny(menu[i]);
                            cena += system.cenaDowozu;
                        }
                    }
                    // wyswietlanie odpowidnich komunikatow na podstawie flagi czyPoprawnaPizza
                    if (czyPoprawnaPizza == false) {
                        System.out.print("Nie ma takiej pizzy w naszym menu \n");
                    } else {
                        System.out.print("Twoje zamówienie zostało dodane do koszyka\n");
                    }

                    // ponowne wyswietlenie Menu , aby użytkownik mogl dokonac innych akcji
                    nowyInterfejs.wyswietlanieMenu();

                    break;
                //SekcjaKontakt
                case "2":
                    nowyInterfejs.Kontakt();
                    break;
                //Sekcja Wyjście
                case "3":
                    nowyInterfejs.Wyjscie(cena, zamowionePizze, ileRoznychZamowien);
                    //tworzymy obiekt i ustawiamy stawke dowozu na 3zl a potem przekazujemy do metody
                     CenaDowozu kosztDowozu=new StawkaDowozu3();
                    system.cenaZdowozem( cena,kosztDowozu);
                    break;
                //Sekcja tworzenia wlasnej pizzy
                case "4":
                    nowyInterfejs.TworzeniePizzy();
                    // tworzenie obiektu pizza klasy ProduktWMenu
                    ProduktWMenu pizza;
                    pizza = new PustaPizza();
                    //Prosty interfejs
                    System.out.print("Dodaj Szynke-1\n");
                    System.out.print("Dodaj Ser-2\n");
                    System.out.print("Dodaj Oliwki-3\n");
                    System.out.print("Skonczylem tworzyc moja pizze-4\n");
                    Scanner wybor = new Scanner(System.in);
//petla w ktorej mozemy dodawac ile skladnikow chcemy
                    while (true) {
                        //flaga odpowiedzalna za wylczaczanie petli true
                        boolean czyPrzerwacPetle=false;
                        String nrSkladnika = wybor.nextLine();
                        switch (nrSkladnika) {
                        //dodatkowa szynka
                            case "1":
                                pizza = new DodatkowaSzynka(pizza);
                                System.out.print("Dodales szynke\n");
                                break;
                                //dodatkowy Ser
                            case "2":
                                pizza = new DodatkowySer(pizza);
                                System.out.print("Dodales ser\n");
                                break;
                                //dodatkowy ser
                            case "3":
                                pizza = new DodatkoweOliwki(pizza);
                                System.out.print("Dodales oliwki\n");
                                break;
                                //wyswietlenie stanu pizzy
                            case "4":
                                System.out.println(pizza);
                                //podniosimy flage
                                czyPrzerwacPetle=true;
                                break;
                            default:
                                System.out.print("Nie prawidlowa opcja");
                                break;
                        }
                        if(czyPrzerwacPetle)
                        {
                            nowyInterfejs.wyswietlanieMenu();
                            break;
                            
                        }
                            
                    }
                default:
                   
                    break;

            }

        }

    }

}
