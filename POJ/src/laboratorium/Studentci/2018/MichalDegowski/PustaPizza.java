package pizzeria;

// klasa pustej pizzy podstawowego skladnika w tworzeniu pizzy dziedziczy z klasy ProduktWMenu
 class PustaPizza extends ProduktWMenu {
      public PustaPizza() {
        Opis = "Podstawowa pizza";
    }
 
    @Override
    public int cena() {
        return 12;
    }
    
}
