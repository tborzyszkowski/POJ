public class KarczochyDekorator extends Dekorator {

    Pizza pizza;
    public KarczochyDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", karczochy";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 0;
    }

    public double getCena(){
        return pizza.getCena() + 2;
    }
}
