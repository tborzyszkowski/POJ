package pizza.wloska;

import pizza.Pizza;

public class WloskaWiejska extends Pizza {

    public WloskaWiejska() {
        setNazwa("Wloska Wiejska");
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
