package pizzeria;

import pizza.Pizza;

import java.util.List;

public abstract class Pizzeria {
    public List<String> listaPizz;
    public Pizzeria(){
    }
    public Pizza zamowPizze(String typ) {
        return utworzPizze(typ);
    }

    protected abstract Pizza utworzPizze(String typ);

}
