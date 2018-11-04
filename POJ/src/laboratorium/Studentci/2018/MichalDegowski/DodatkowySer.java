package pizzeria;

//klasa dodatkowy ser dziedziczaca z dekoratora 
// odpowiada za dodanie sera do opisu pizzy oraz zwiekszenie ceny
class DodatkowySer extends ProduktWMenuDekorator {
    public DodatkowySer(ProduktWMenu produkt) {
        super(produkt);
    }
 
    @Override
    public String pokazOpis() {
        return produkt.pokazOpis() + ", dodatkowy ser";
    }
 
    @Override
    public int cena() {
        return produkt.cena() + 3;
    }
    
}

