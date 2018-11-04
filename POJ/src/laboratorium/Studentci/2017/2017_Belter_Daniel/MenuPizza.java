import Pizze.Pizza;
import Pizze.PizzaFabryka;
import Restauracje.PizzaFabrykaBrzegi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPizza {
    public double podlicz()
    {
        double suma=0;
        for (Pizza pizza:pizzaList) {
            suma+=pizza.getCena();
        }
        return suma;
    }
    List<Pizza> pizzaList = new ArrayList<>();
    PizzaFabryka pizzaFabryka;
    public List<Pizza> getPizzaList() {
        return pizzaList;
    }
    boolean wyjdz = false;
    int opcja = 0;
    int  rodzajPizzy = 0;
    int typPizzy = 0;
    int dostawa = 0;
    String adres;
    Scanner odczyt = new Scanner(System.in);

    public void menu(){
        pizzaFabryka = new PizzaFabrykaBrzegi();

        do{
            System.out.println("===MENU===");
            System.out.println("Wegetarianska");
            System.out.println("Cappricosa");
            System.out.println("Peperoni");
            System.out.println("========");

            System.out.println("Witaj w pizzeri");
            System.out.println("[1]Zamow pizze");
            System.out.println("[2]Zloz zamowienie");
            System.out.println("[3]Wyjdz");
            opcja = odczyt.nextInt();
            if(opcja == 2 ){

                System.out.println("Wybierz sposob dostawy");
                System.out.println("[1]Odbiur osobisty");
                System.out.println("[2]Dowoz");
                dostawa = odczyt.nextInt();
                if(dostawa == 2){
                    System.out.println("Podaj adres");
                    adres = odczyt.nextLine();
                    odczyt.nextLine();

                for(int i =0; i<pizzaList.size();i++)
                {
                    System.out.println(pizzaList.get(i));

                }
                    double sum = podlicz() +5;

                System.out.println("Suma zamówienia wynosi: "+ sum);
                //wyjdz = true;
                }
                else
                {
                    for(int i =0; i<pizzaList.size();i++)
                    {
                        System.out.println(pizzaList.get(i));

                    }


                    System.out.println("Suma zamówienia wynosi: " + podlicz());

                   // wyjdz = true;
                }
            }
            if(opcja ==3) wyjdz = true;
            switch(opcja){
                case 1:{
                    System.out.println("Podaj rozmiar pizzy");
                    System.out.println("[1]Mala");
                    System.out.println("[2]Srednia");
                    System.out.println("[3]Duza");
                    typPizzy = odczyt.nextInt();
                    switch (typPizzy){
                        case 1:{
                            System.out.println("Wybierz rodzaj Pizzy");
                            System.out.println("[1]Wegetarianska");
                            System.out.println("[2]Cappricosa");
                            System.out.println("[3]Peperoni");
                            rodzajPizzy = odczyt.nextInt();
                            if(rodzajPizzy ==1){
                                pizzaList.add(pizzaFabryka.wegetaria(typPizzy));
                                break;
                            }
                            if(rodzajPizzy == 2){
                                pizzaList.add(pizzaFabryka.capricciosa(typPizzy));
                                break;
                            }
                            if(rodzajPizzy == 3){
                                pizzaList.add(pizzaFabryka.peperoni(typPizzy));
                                break;
                            }

                        }
                        case 2:{
                            System.out.println("Wybierz rodzaj Pizzy");
                            System.out.println("[1]Wegetarianska");
                            System.out.println("[2]Cappricosa");
                            System.out.println("[3]Peperoni");
                            rodzajPizzy = odczyt.nextInt();
                            if(rodzajPizzy ==1){
                                pizzaList.add(pizzaFabryka.wegetaria(typPizzy));
                                break;
                            }
                            if(rodzajPizzy == 2){
                                pizzaList.add(pizzaFabryka.capricciosa(typPizzy));
                                break;
                            }
                            if(rodzajPizzy == 3){
                                pizzaList.add(pizzaFabryka.peperoni(typPizzy));
                                break;
                            }

                        }
                        case 3:{
                            System.out.println("Wybierz rodzaj Pizzy");
                            System.out.println("[1]Wegetarianska");
                            System.out.println("[2]Cappricosa");
                            System.out.println("[3]Peperoni");
                            rodzajPizzy = odczyt.nextInt();
                            if(rodzajPizzy ==1){
                                pizzaList.add(pizzaFabryka.wegetaria(typPizzy));
                                break;
                            }
                            if(rodzajPizzy == 2){
                                pizzaList.add(pizzaFabryka.capricciosa(typPizzy));
                                break;
                            }
                            if(rodzajPizzy == 3){
                                pizzaList.add(pizzaFabryka.peperoni(typPizzy));
                                break;
                            }

                        }
                    }
                }
            }
        }while(!wyjdz);
    }
}

