package Pizze;

public interface PizzaCiastoFabryka {
    static Pizza stworozPizze(int wielkosc) {
        switch (wielkosc) {
            case 1: {
                return new MalaPizza();

            }
            case 2: {
                return new SredniaPizza();

            }
            case 3: {
                return new DuzaPizza();

            }
            default: {
                return new MalaPizza();
            }
        }
    }
}