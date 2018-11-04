public class KrewetkiDekorator extends Dekorator {

    Pizza pizza;
    public KrewetkiDekorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getOpis(){
        return pizza.getOpis() + ", krewetki";
    }

    public int getOstrosc(){
        return pizza.getOstrosc() + 0;
    }

    public double getCena(){
        return pizza.getCena() + 3;
    }
}
