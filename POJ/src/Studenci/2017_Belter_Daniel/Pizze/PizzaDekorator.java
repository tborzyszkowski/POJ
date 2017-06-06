package Pizze;

public class PizzaDekorator extends Pizza{

    protected Pizza _pizza; //dekorowany element
    public PizzaDekorator(Pizza pizza){
        _pizza = pizza;
    }
    public String getNazwa() {
        return this._pizza.getNazwa();
    }

    public void setNazwa(String nazwa) {
        _pizza.setNazwa(nazwa);
    }

    public String getSkladniki() {
        return _pizza.getSkladniki();
    }

    public void setSkladniki(String skladniki) {
        _pizza.setSkladniki(skladniki);

    }

    public int getOstosc() {
        return _pizza.getOstosc();
    }

    public void setOstosc(int ostosc) {
        _pizza.setOstosc(ostosc);
    }

    public double getCena() {
        return _pizza.getCena();
    }

    public void setCena(double cena) {
        _pizza.setCena(cena);
    }


}
