package pizza.amerykanska;

import pizza.Pizza;

import java.util.ArrayList;

public class AmerykanskaMargherita extends Pizza {

    public AmerykanskaMargherita() {
        super();
        setNazwa("Amerykanska Margherita");
        setOpis(getNazwa());
        setSos("czosnkowy");
        setCiasto("grube");
        addSkladnik("ser");
    }

    @Override
    public double koszt() {
        return 12 + 0.5 * wielkosc;
    }
}
