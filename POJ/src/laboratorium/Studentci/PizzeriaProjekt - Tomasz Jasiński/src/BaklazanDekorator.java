public class BaklazanDekorator extends Dekorator {

    Pizza pizza;
    public BaklazanDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", baklazan";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 0;
    }

    public double getCena(){
        return pizza.getCena() + 2;
    }
}
