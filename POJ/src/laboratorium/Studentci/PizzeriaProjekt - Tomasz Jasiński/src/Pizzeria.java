public abstract class Pizzeria {

    public static Pizza createPlacek(Rozmiar rozmiar){
        Pizza p;
        switch(rozmiar){
            case MALA: p =  new MalaPizza();
                break;
            case SREDNIA: p =  new SredniaPizza();
                break;
            case DUZA: p =  new DuzaPizza();
                break;
            default: p = new MalaPizza();
        }
        return p;
    }

    public Pizza createPizza(Typ typ, Rozmiar rozmiar){
        Pizza p;
        switch(typ){
            case MARGHARITA: p = createMargharitaPizza(rozmiar);
                break;
            case PROSCIUTTO: p = createProsciuttoPizza(rozmiar);
                break;
            case DIAVOLA: p = createDiavolaPizza(rozmiar);
                break;
            case SALAMI: p = createSalamiPizza(rozmiar);
                break;
            case SCAMPI: p = createScampiPizza(rozmiar);
                break;
            case VEGE: p = createVegePizza(rozmiar);
                break;
            default:
                p = createMargharitaPizza(rozmiar);
        }
        return p;
    }

    public Pizza createMargharitaPizza(Rozmiar rozmiar){
        Pizza p = createPlacek(rozmiar);
        p.setOpis(p.getOpis() + " Margharita");
        p = new MozzarellaDekorator(p);

        return p;
    }

    public Pizza createProsciuttoPizza(Rozmiar rozmiar){
        Pizza p = createPlacek(rozmiar);
        p.setOpis(p.getOpis() + " Prosciutto");
        p = new MozzarellaDekorator(p);
        p = new SzynkaDekorator(p);
        p = new PieczarkiDekorator(p);

        return p;
    }

    public Pizza createDiavolaPizza(Rozmiar rozmiar){
        Pizza p = createPlacek(rozmiar);
        p.setOpis(p.getOpis() + " Diavola");
        p = new MozzarellaDekorator(p);
        p = new SalamiDekorator(p);
        p = new PeperoncinoDekorator(p);

        return p;
    }

    public Pizza createSalamiPizza(Rozmiar rozmiar){
        Pizza p = createPlacek(rozmiar);
        p.setOpis(p.getOpis() + " Salami");
        p = new MozzarellaDekorator(p);
        p = new SalamiDekorator(p);

        return p;
    }

    public Pizza createScampiPizza(Rozmiar rozmiar){
        Pizza p = createPlacek(rozmiar);
        p.setOpis(p.getOpis() + " Scampi");
        p = new KrewetkiDekorator(p);
        p = new CzosnekDekorator(p);

        return p;
    }

    public Pizza createVegePizza(Rozmiar rozmiar){
        Pizza p = createPlacek(rozmiar);
        p.setOpis(p.getOpis() + " Vege");
        p = new CzosnekDekorator(p);
        p = new BaklazanDekorator(p);
        p = new KarczochyDekorator(p);

        return p;
    }

    public abstract String getPizzeria();
}
