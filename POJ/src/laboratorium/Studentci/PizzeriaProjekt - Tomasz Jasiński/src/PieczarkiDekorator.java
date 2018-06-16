public class PieczarkiDekorator extends Dekorator {

    Pizza pizza;
    public PieczarkiDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", pieczarki";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 0;
    }

    public double getCena(){
        return pizza.getCena() + 1;
    }
}
