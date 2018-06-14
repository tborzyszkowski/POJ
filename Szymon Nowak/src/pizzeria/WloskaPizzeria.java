package pizzeria;

import pizza.Pizza;
import pizza.amerykanska.AmerykanskaCapriciosa;
import pizza.amerykanska.AmerykanskaMargherita;
import pizza.amerykanska.AmerykanskaWiejska;
import pizza.wloska.WloskaCapriciosa;
import pizza.wloska.WloskaMargherita;
import pizza.wloska.WloskaWiejska;

import java.util.Arrays;
import java.util.List;

public class WloskaPizzeria extends Pizzeria {
    public WloskaPizzeria() {
        listaPizz = Arrays.asList("WloskaMargherita", "WloskaWiejska", "WloskaMargherita");
    }

    @Override
    public Pizza utworzPizze(String typ) {
        Pizza pizza;
        if (typ.equals("WloskaMargherita"))
            pizza = new WloskaMargherita();
        else if (typ.equals("WloskaWiejska"))
            pizza = new WloskaWiejska();
        else
            pizza = new WloskaCapriciosa();
        return pizza;
    }
}
