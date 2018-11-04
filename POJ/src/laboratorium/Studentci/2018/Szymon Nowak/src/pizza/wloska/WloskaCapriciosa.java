package pizza.wloska;

public class WloskaCapriciosa extends pizza.Pizza {
    public WloskaCapriciosa(){
     super();
    setNazwa("WloskaCapriciosa");
    setOpis(getNazwa());
    setSos("czosnkowy");
    setCiasto("grube");
    addSkladnik("ser");
}

    @Override
    public double koszt() { return 20 + 0.5 *wielkosc;
    }
}
