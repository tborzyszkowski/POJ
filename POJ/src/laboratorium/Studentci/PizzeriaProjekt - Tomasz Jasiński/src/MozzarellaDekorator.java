public class MozzarellaDekorator extends Dekorator {

    Pizza pizza;
    public MozzarellaDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", mozzarella";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 0;
    }

    public double getCena(){ return pizza.getCena() + 1.5;
    }
}
