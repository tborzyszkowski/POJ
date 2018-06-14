package pizza.amerykanska;

import pizza.Pizza;

import java.util.ArrayList;

public class AmerykanskaWiejska extends Pizza {

    public AmerykanskaWiejska() {
            super();
            setNazwa("Amerykanska Wiejska");
            setOpis(getNazwa());
            setSos("czosnkowy");
            setCiasto("grube");
            addSkladnik("ser");
    }

    @Override
    public double koszt() {
        return 18 + 0.5 *wielkosc;
    }
}
