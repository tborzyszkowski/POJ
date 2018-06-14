package pizzeria;

import pizza.Pizza;
import pizza.amerykanska.AmerykanskaCapriciosa;
import pizza.amerykanska.AmerykanskaMargherita;
import pizza.amerykanska.AmerykanskaWiejska;

import java.util.Arrays;
import java.util.List;

public class AmerykanskaPizzeria extends Pizzeria {
    public AmerykanskaPizzeria(){
        listaPizz = Arrays.asList("AmerykanskaMargherita" , "AmerykanskaWiejska", "AmerykanskaCapriciosa");
    }
    @Override
    public Pizza utworzPizze(String typ) {
        Pizza pizza;
        if(typ.equals("AmerykanskaMargherita"))
            pizza = new AmerykanskaMargherita();
        else if (typ.equals("AmerykanskaWiejska"))
            pizza = new AmerykanskaWiejska();
        else
            pizza = new AmerykanskaCapriciosa();
        return pizza;
    }

}