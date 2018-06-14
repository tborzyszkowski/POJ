package pizza.amerykanska;
import pizza.Pizza;

import java.util.ArrayList;
public class AmerykanskaCapriciosa extends Pizza {
    public AmerykanskaCapriciosa() {
        super();
        setNazwa("Amerykanska Margherita");
        setOpis(getNazwa());
        setSos("czosnkowy");
        setCiasto("grube");
        addSkladnik("ser");
    }

    @Override
    public double koszt() {
        return 20 + 0.5 *wielkosc;
    }
}
