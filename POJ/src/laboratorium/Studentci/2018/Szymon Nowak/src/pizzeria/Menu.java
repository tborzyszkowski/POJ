package pizzeria;

import pizza.Pizza;
import pizza.amerykanska.AmerykanskaCapriciosa;
import pizza.amerykanska.AmerykanskaMargherita;
import pizza.amerykanska.AmerykanskaWiejska;
import pizza.dodatki.Ananas;
import pizza.dodatki.Ser;
import pizza.dodatki.Szynka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private static Menu instancja;
    public static List<String> listaSkladnikow = Arrays.asList("ser"  , "ananas",  "szynka");
    public static List<String> listaPizzeri = Arrays.asList("Amerykanska" , "Włoska");
    private Menu() {


    }

    public static Menu getinstancja() {
        if (instancja == null) {
            instancja = new Menu();

        }

        return instancja;

    }





    public String wyswietlPizzerie() {
        String pizzeria = " wybierz pizzerie ";
        int index = 0;
        for (String x : listaPizzeri) {

            pizzeria +=  " " + index + " " + x;
            index++;

        }
        return pizzeria;
    }

    public String wyswietlPizze(Pizzeria pizzeria) {
        //TODO: zamien ifa na swicza
        String ret = " wybierz pizze ";
        int index = 0;
        for (String x : pizzeria.listaPizz) {

            ret +=  " " + index + " " + x;
            index++;
        }
        return ret;
    }


    public Pizzeria wyborPizzeri(int wyborPizzeri) {
        switch (wyborPizzeri) {
            case 0: {
                return new AmerykanskaPizzeria();
            }

            case 1: {
                return new WloskaPizzeria();
            }
            default: {
                return null;
            }

        }
    }
        public String wielkoscPizzy(){
                String ret= " wybierz wielkosc :";
                return ret;
        }


    public Pizza wyborPizzy (int wyborPizzy,Pizzeria pizzeria) {
        if(wyborPizzy < 0 || wyborPizzy >=pizzeria.listaPizz.size())
        {
            return null;
        }
                else
                {
                    return pizzeria.utworzPizze(pizzeria.listaPizz.get(wyborPizzy));
                }


            }
    public Pizza wyborSkladnikow(int wybranySkladnik, Pizza pizza){
        switch(wybranySkladnik){
            case 0:{
                pizza = new Ser(pizza);
                break;
            }
            case 1:{
                pizza = new Ananas(pizza);
                break;
            }
            case 2:{
                pizza = new Szynka(pizza);
                break;
            }
        }
        return pizza;
    }
    public String wyswietlSkladniki() {
        String skladnik = " wybierz skladniki ";
        int index = 0;
        for (String x : listaSkladnikow) {

            skladnik +=  " " + index + " " + x;
            index++;

        }
        skladnik += " -1 zakoncz dodawanie skladnikow";
        return skladnik;

    }


    public String ostroscPizzy() {
        return "Wybierz ostrosc pizzy (0-5):";
    }
}
