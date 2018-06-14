import pizza.Pizza;
import pizza.dodatki.Ser;
import pizza.dodatki.Szynka;
import pizza.dodatki.Ananas;
import pizzeria.AmerykanskaPizzeria;
import pizzeria.Menu;
import pizzeria.Pizzeria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String wyborPizzeri;
        Pizzeria pizzeria;
        String nastepnaPizza;
        do{
            System.out.println(Menu.getinstancja().wyswietlPizzerie());
            wyborPizzeri = in.nextLine();

            pizzeria = Menu.getinstancja().wyborPizzeri(Integer.parseInt(wyborPizzeri));
        } while(pizzeria == null);
        ArrayList<Pizza> aktualneZamowienie = new ArrayList<Pizza>();
        do{
            Pizza pizza;
            do{

            System.out.println(Menu.getinstancja().wyswietlPizze(pizzeria));
                String wyborPizzy = in.nextLine();
                pizza = Menu.getinstancja().wyborPizzy(Integer.parseInt(wyborPizzy),pizzeria);
            } while(pizza == null);
            double wielkoscPizzy;
            do{
                System.out.println(Menu.getinstancja().wielkoscPizzy());
                wielkoscPizzy = Double.parseDouble(in.nextLine());

            }while (wielkoscPizzy < 0 || wielkoscPizzy > 50.0);
            pizza.setWielkosc(wielkoscPizzy);


            int ostroscPizzy;
            do{
                System.out.println(Menu.getinstancja().ostroscPizzy());
                ostroscPizzy = Integer.parseInt(in.nextLine());
                pizza.setOstrosc(ostroscPizzy);
            }while (ostroscPizzy < 0 || ostroscPizzy > 5);
            pizza.setWielkosc(wielkoscPizzy);


            int skladnik;
            do{
                System.out.println(Menu.getinstancja().wyswietlSkladniki());
                skladnik = Integer.parseInt(in.nextLine());
                if(skladnik != -1){
                    pizza = Menu.getinstancja().wyborSkladnikow(skladnik, pizza);
                }
            } while(skladnik != -1);

            aktualneZamowienie.add(pizza);

            System.out.println("Dodac kolejna pizze? (t/n)");
            nastepnaPizza = in.nextLine();
        }while(nastepnaPizza.equals("t"));
        double sumaZamowienia = 0.0;
        for (Pizza pizza:
             aktualneZamowienie) {
            System.out.println(pizza.pobierzOpis());
            sumaZamowienia += pizza.koszt();
        }
        System.out.println("Koszt zamowienia: " + sumaZamowienia);




    }
}
