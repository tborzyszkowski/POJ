package pizza.wloska;

import pizza.Pizza;

public class WloskaMargherita extends Pizza {
    public WloskaMargherita(){
        setNazwa("Wloska Margherita");
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
