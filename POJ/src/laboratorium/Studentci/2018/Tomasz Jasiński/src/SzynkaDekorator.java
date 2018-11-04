public class SzynkaDekorator extends Dekorator {

    Pizza pizza;
    public SzynkaDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", szynka";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 0;
    }

    public double getCena(){
        return pizza.getCena() + 2;
    }
}
