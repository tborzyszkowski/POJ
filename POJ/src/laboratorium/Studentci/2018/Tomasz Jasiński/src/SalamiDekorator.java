public class SalamiDekorator extends Dekorator {

    Pizza pizza;
    public SalamiDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis() { return pizza.getOpis() + ", salami"; }

    public int getOstrosc(){
        return pizza.getOstrosc() + 1;
    }

    public double getCena(){
        return pizza.getCena() + 3;
    }
}
