package Pizze;

import Skladniki.*;

public interface PizzaFabryka {
    default Pizza wegetaria(int wielkosc){
        Pizza pizza = PizzaCiastoFabryka.stworozPizze(wielkosc);
        pizza = new SerDekorator(pizza);


        pizza.setNazwa(pizza.getNazwa()+" Wegetaria");
        return pizza;
    }
    default Pizza capricciosa(int wielkosc){
        Pizza pizza = PizzaCiastoFabryka.stworozPizze(wielkosc);
        pizza = new SzynkaDekorator(pizza);
        pizza = new SerDekorator(pizza);
        pizza = new PieczarkiDekorator(pizza);

        pizza.setNazwa(pizza.getNazwa()+" capricciosa");
        return pizza;
    }
    default Pizza peperoni(int wielkosc){
        Pizza pizza = PizzaCiastoFabryka.stworozPizze(wielkosc);
        pizza = new SzynkaDekorator(pizza);
        pizza = new SerDekorator(pizza);
        pizza = new PieczarkiDekorator(pizza);
        pizza = new CebulaDekorator(pizza);
        pizza = new PaprykaDekorator(pizza);
        pizza = new PomidorDekorator(pizza);



        pizza.setNazwa(pizza.getNazwa()+" Peperoni");
        return pizza;
    }


}
