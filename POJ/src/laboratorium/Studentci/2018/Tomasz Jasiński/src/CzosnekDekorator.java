public class CzosnekDekorator extends Dekorator {

    Pizza pizza;
    public CzosnekDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", czosnek";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 1;
    }

    public double getCena(){
        return pizza.getCena() + 1;
    }
}
