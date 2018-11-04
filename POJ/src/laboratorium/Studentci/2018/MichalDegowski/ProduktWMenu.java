package pizzeria;

//abstrakcyjna klasa ProduktWMenu
abstract class ProduktWMenu {
    protected String Opis;
    //metoda odpowiedzialna za pokazanie opisu
    public String pokazOpis(){
    return Opis;
}
    public abstract int cena();
    //metoda ktora wyswietla cene oraz obecne skladniki na pizzy
    @Override
    public String toString() {
        return cena()+ "zł " + "(" + pokazOpis() + ")";
    }
}
