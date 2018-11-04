package pizzeria;

//klasa dodatkowa szynka dziedziczaca z dekoratora 
// odpowiada za dodanie szynki do opisu pizzy oraz zwiekszenie ceny
 class DodatkowaSzynka extends ProduktWMenuDekorator {
     public DodatkowaSzynka(ProduktWMenu produkt) {
        super(produkt);
    }
 
    @Override
    public String pokazOpis() {
        return produkt.pokazOpis() + ", dodatkowa szynka";
    }
 
    @Override
    public int cena() {
        return produkt.cena() + 5;
    }
}
