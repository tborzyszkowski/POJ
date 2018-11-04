package pizzeria;

//klasa dodatkowe oliwki dziedziczaca z dekoratora 
// odpowiada za dodanie oliwek do opisu pizzy oraz zwiekszenie ceny
 class DodatkoweOliwki extends ProduktWMenuDekorator {
     public DodatkoweOliwki(ProduktWMenu produkt) {
        super(produkt);
    }
 
    @Override
    public String pokazOpis() {
        return produkt.pokazOpis() + ", dodatkowe oliwki";
    }
 
    @Override
    public int cena() {
        return produkt.cena() + 6;
    }
}
