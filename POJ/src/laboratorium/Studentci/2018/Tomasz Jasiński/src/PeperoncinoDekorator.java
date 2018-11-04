public class PeperoncinoDekorator extends Dekorator {

    Pizza pizza;
    public PeperoncinoDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", peperoncino";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 3;
    }

    public double getCena(){
        return pizza.getCena() + 2;
    }
}
