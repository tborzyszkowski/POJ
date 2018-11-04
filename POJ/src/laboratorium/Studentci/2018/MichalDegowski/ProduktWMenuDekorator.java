package pizzeria;

//dekorator klasy ProduktWMenu z ktorej dziedziczy
abstract class ProduktWMenuDekorator extends ProduktWMenu {
    //tworzymy obiekt produkt klasy ProduktWMenu
    ProduktWMenu produkt;
    public ProduktWMenuDekorator(ProduktWMenu produkt) {
        this.produkt = produkt;
    }
    @Override
    public abstract String pokazOpis();
    
}
